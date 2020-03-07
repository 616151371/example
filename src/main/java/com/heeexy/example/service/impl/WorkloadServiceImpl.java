package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.LeaveDao;
import com.heeexy.example.dao.WorkloadDao;
import com.heeexy.example.service.LeaveService;
import com.heeexy.example.service.WorkloadService;
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
public class WorkloadServiceImpl implements WorkloadService {

	@Autowired
	private WorkloadDao workloadDao;

	/**
	 * 新增
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addWorkload(JSONObject jsonObject) {
		workloadDao.addWorkload(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 文章
	 */
	@Override
	public JSONObject listWorkload(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = workloadDao.countWorkload(jsonObject);
		List<JSONObject> list = workloadDao.listWorkload(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateWorkload(JSONObject jsonObject) {
		workloadDao.updateWorkload(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 删除
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject deleteWorkload(JSONObject jsonObject) {
		workloadDao.deleteWorkload(jsonObject);
		return CommonUtil.successJson();
	}
}
