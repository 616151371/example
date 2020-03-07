package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ArticleDao;
import com.heeexy.example.dao.LeaveDao;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.LeaveService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hxy
 * @date: 2017/10/24 16:07
 */
@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveDao leaveDao;

	/**
	 * 新增
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addLeave(JSONObject jsonObject) {
		leaveDao.addLeave(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 文章
	 */
	@Override
	public JSONObject listLeave(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = leaveDao.countLeave(jsonObject);
		List<JSONObject> list = leaveDao.listLeave(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateLeave(JSONObject jsonObject) {
		leaveDao.updateLeave(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 删除
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject deleteLeave(JSONObject jsonObject) {
		leaveDao.deleteLeave(jsonObject);
		return CommonUtil.successJson();
	}
}
