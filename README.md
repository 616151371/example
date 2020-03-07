# example
毕设高校管理后端
## Spring Boot-Shiro-Vue
提供一套基于SpringBoot-shiro-vue的权限管理思路.

前后端都加以控制,做到按钮/接口级别的权限



admin/123456 管理员身份登录,可以新增用户,角色.

角色可以分配权限

控制菜单是否显示,新增/删除按钮是否显示

## 设计思路
### 核心
每个登录用户拥有各自的N条权限,比如 文章:查看/编辑/发布/删除
### 后端
基于 RBAC新解 .

通常我们的权限设计都是 用户--角色--权限 ,其中角色是我们写代码的人没法控制的,它可以有多条权限,每个用户又可以设计为拥有多个角色.因此如果从角色着手进行权限验证,系统都必须根据用户的配置动起来,非常复杂.

所以我们后台设计的关键点就在于: 后台接口只验证权限,不看角色.

角色的作用其实只是用来管理分配权限的,真正的验证只验证权限 ,而不去管你是否是那种角色.体现在代码上就是接口上注解为
```
@RequiresPermissions("article:add")
```
而不是
```
@RequiresRoles(value = {"admin","manager","writer"}, logical = Logical.OR) 
```
### 前端
采用了vueAdmin-template , ElementUI , 权限设计思路也是参考了 vueAdmin 的动态路由的设计.

后端负责了接口的安全性,而前端之所以要做权限处理,最主要的目的就是隐藏掉不具有权限的菜单(路由)和按钮.

登录系统后,后端返回此用户的权限信息,比如
```Java
 "userPermission":{  
         "menuList":[  
            "role",
            "user",
            "article"
         ],
         "roleId":1,
         "nickname":"超级用户",
         "roleName":"管理员",
         "permissionList":[  
            "article:list",
            "article:add",
            "user:list",
         ],
         "userId":10003
      }
 ```
根据menuList判断给此用户生成哪些路由, 根据permissionList判断给用户显示哪些按钮,能请求哪些接口.

### 数据库
最主要的是要有一张本系统内的全部权限明细表,比如下面这样 
#### 权限表
![](https://camo.githubusercontent.com/ebb130b7464257d75f923e7c70a194e5a577432d/687474703a2f2f696d672e6865656578792e636f6d2f7065726d697373696f6e44617461626173652e706e67)  
#### 权限数据
![](https://camo.githubusercontent.com/cd1946f8e84fde9aded6a69995c8ae2c4e251adf/687474703a2f2f696d672e6865656578792e636f6d2f7065726d697373696f6e446174612e706e67)  
如果某用户拥有表格中前五条权限,就可以查出他就拥有article和user两个菜单,至于页面内是否显示(新增)(修改)按钮,就根据他的permissionList来判断.

### 具体实现
有了思路,就可以根据各自的业务进行实现,本项目在此进行了简单的实现,后端代码在back文件夹,前端代码在vue文件夹.前端启动只需
```
npm install --registry=https://registry.npm.taobao.org
npm run dev
```
后端就是常规的shiro配置,前端代码如果看不明白,可以参考前端权限代码说明

### 分配权限页面效果
#### 分配权限页面
![](https://camo.githubusercontent.com/dc99cc9a2526d3cb82ee70f5d50b4923eaf4eb47/687474703a2f2f696d672e6865656578792e636f6d2f726f6c655f7065726d697373696f6e2e706e67)  