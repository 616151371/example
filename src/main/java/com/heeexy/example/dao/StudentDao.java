package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Student;

import java.util.List;

/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface StudentDao {
	/**
	 * 新增
	 */
	int addStudent(Student student);

	/**
	 * 统计文章总数
	 */
	int countStudent(JSONObject jsonObject);

	/**
	 * 列表
	 */
	List<JSONObject> listStudent(JSONObject jsonObject);

	/**
	 * 更新
	 */
	int updateStudent(JSONObject jsonObject);

	/**
	 * 删除
	 */
	int deleteStudent(JSONObject jsonObject);
}
