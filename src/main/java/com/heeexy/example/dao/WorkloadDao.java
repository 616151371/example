package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: Su
 * @description: Dao层
 * @date: 2017/10/24 16:06
 */
public interface WorkloadDao {
	/**
	 * 新增
	 */
	int addWorkload(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countWorkload(JSONObject jsonObject);

	/**
	 * 列表
	 */
	List<JSONObject> listWorkload(JSONObject jsonObject);

	/**
	 * 更新
	 */
	int updateWorkload(JSONObject jsonObject);

	/**
	 * 删除
	 */
	int deleteWorkload(JSONObject jsonObject);
}
