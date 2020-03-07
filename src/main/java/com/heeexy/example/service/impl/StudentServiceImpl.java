package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.StudentDao;
import com.heeexy.example.entity.Class;
import com.heeexy.example.entity.Student;
import com.heeexy.example.service.StudentService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Su
 * @date: 2017/10/24 16:07
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	/**
	 * 新增
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addStudent(Student student) {
		studentDao.addStudent(student);
		return CommonUtil.successJson();
	}

	@Override
	public JSONObject listStudent(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = studentDao.countStudent(jsonObject);
		List<JSONObject> list = studentDao.listStudent(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateStudent(JSONObject jsonObject) {
		studentDao.updateStudent(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 删除
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject deleteStudent(JSONObject jsonObject) {
		studentDao.deleteStudent(jsonObject);
		return CommonUtil.successJson();
	}
}
