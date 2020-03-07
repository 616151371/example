package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: Su
 * @description: 文章Dao层
 * @date: 2017/10/24 16:06
 */
public interface LeaveDao {
	/**
	 * 新增
	 */
	int addLeave(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countLeave(JSONObject jsonObject);

	/**
	 * 列表
	 */
	List<JSONObject> listLeave(JSONObject jsonObject);

	/**
	 * 更新
	 */
	int updateLeave(JSONObject jsonObject);

	/**
	 * 删除
	 */
	int deleteLeave(JSONObject jsonObject);
}
