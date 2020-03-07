package com.heeexy.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Class;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.ClassService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hxy
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classService;

	/**
	 * 查询列表
	 */
	@RequiresPermissions("class:list")
	@GetMapping("/listclass")
	public JSONObject listClass(HttpServletRequest request) {
		return classService.listClass(CommonUtil.request2Json(request));
	}

	/**
	 * 新增
	 */
	@RequiresPermissions("class:add")
	@PostMapping("/addclass")
	public JSONObject addClass(@RequestBody JSONObject requestJson) {
		Session session = SecurityUtils.getSubject().getSession();
		JSONObject permission = (JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);
        Class model = com.alibaba.fastjson.JSONObject.parseObject(requestJson.toJSONString(),Class.class);
        model.setCreateBy(permission.get("userId").toString());
		return classService.addClass(model);
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("class:update")
	@PostMapping("/updateclass")
	public JSONObject updateClass(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return classService.updateClass(requestJson);
	}

	/**
	 * 删除
	 */
	@RequiresPermissions("class:delete")
	@PostMapping("/deleteclass")
	public JSONObject deleteClass(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return classService.deleteClass(requestJson);
	}
}
