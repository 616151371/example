package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Class;
import com.heeexy.example.entity.Student;
import com.heeexy.example.service.StudentService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: Su
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/student")
public class StudentController {

	@Resource
	private StudentService studentService;

	/**
	 * 查询列表
	 */
	@RequiresPermissions("student:list")
	@GetMapping("/liststudent")
	public JSONObject listStudent(HttpServletRequest request) {
		return studentService.listStudent(CommonUtil.request2Json(request));
	}

	/**
	 * 新增
	 */
	@RequiresPermissions("student:add")
	@PostMapping("/addstudent")
	public JSONObject addStudent(@RequestBody JSONObject requestJson) {
		Session session = SecurityUtils.getSubject().getSession();
		JSONObject permission = (JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);
		Student model = com.alibaba.fastjson.JSONObject.parseObject(requestJson.toJSONString(),Student.class);
		model.setCreateBy(permission.get("userId").toString());
		return studentService.addStudent(model);
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("student:update")
	@PostMapping("/updatestudent")
	public JSONObject updateClass(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return studentService.updateStudent(requestJson);
	}

	/**
	 * 删除
	 */
	@RequiresPermissions("student:delete")
	@PostMapping("/deletestudent")
	public JSONObject deleteStudent(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return studentService.deleteStudent(requestJson);
	}
}
