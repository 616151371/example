package com.heeexy.example.controller;

import java.io.File;

public class RecoverController {
    public static void main(String[] args) throws Exception {
        RecoverController recoverController = new RecoverController();
        recoverController.dataBaseDump("127.0.0.1","root","root","mystock","mystock");
    }

    public static void dataBaseDump(String port,String username,String password,String databasename,String sqlname) throws Exception {
                 File file = new File("E:\\test");
                 if ( !file.exists() ){
                         file.mkdir();
                     }
                 File datafile = new File(file+File.separator+sqlname+".sql");
                 if( datafile.exists() ){
                         System.out.println(sqlname+"文件名已存在，请更换");
                         return ;
                     }
                 //拼接cmd命令
                 Process exec = Runtime.getRuntime().exec("cmd /c mysqldump -h"+port+" -3302"+" -u "+username+" -p"+password+" "+databasename+" > "+datafile);
                 if( exec.waitFor() == 0){
                         System.out.println("数据库备份成功,备份路径为："+datafile);
                     }
             }
}
