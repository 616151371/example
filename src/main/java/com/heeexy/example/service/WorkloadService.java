package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: Su
 * @date: 2017/10/24 16:06
 */
public interface WorkloadService {
	/**
	 * 新增
	 */
	JSONObject addWorkload(JSONObject jsonObject);

	/**
	 * 列表
	 */
	JSONObject listWorkload(JSONObject jsonObject);

	/**
	 * 更新
	 */
	JSONObject updateWorkload(JSONObject jsonObject);

	/**
	 * 删除
	 */
	JSONObject deleteWorkload(JSONObject jsonObject);
}
