package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface LeaveService {
	/**
	 * 新增
	 */
	JSONObject addLeave(JSONObject jsonObject);

	/**
	 * 列表
	 */
	JSONObject listLeave(JSONObject jsonObject);

	/**
	 * 更新
	 */
	JSONObject updateLeave(JSONObject jsonObject);

	/**
	 * 删除
	 */
	JSONObject deleteLeave(JSONObject jsonObject);
}
