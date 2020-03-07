package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Student;

/**
 * @author: Su
 * @date: 2017/10/24 16:06
 */
public interface StudentService {
	/**
	 * 新增
	 */
	JSONObject addStudent(Student student);

	/**
	 * 列表
	 */
	JSONObject listStudent(JSONObject jsonObject);

	/**
	 * 更新
	 */
	JSONObject updateStudent(JSONObject jsonObject);

	/**
	 * 删除
	 */
	JSONObject deleteStudent(JSONObject jsonObject);
}
