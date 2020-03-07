package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Class;
import com.heeexy.example.dao.ArticleDao;
import com.heeexy.example.dao.ClassDao;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.ClassService;
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
public class ClassServiceImpl implements ClassService {

	@Autowired
	private ClassDao classDao;

	/**
	 * 新增
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addClass(Class model) {
		classDao.addClass(model);
		return CommonUtil.successJson();
	}

	@Override
	public JSONObject listClass(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = classDao.countClass(jsonObject);
		List<JSONObject> list = classDao.listClass(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateClass(JSONObject jsonObject) {
		classDao.updateClass(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 删除
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject deleteClass(JSONObject jsonObject) {
		classDao.deleteClass(jsonObject);
		return CommonUtil.successJson();
	}
}
