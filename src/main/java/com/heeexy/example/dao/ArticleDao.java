package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: Su
 * @description: 文章Dao层
 * @date: 2017/10/24 16:06
 */
public interface ArticleDao {
	/**
	 * 新增
	 */
	int addArticle(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countArticle(JSONObject jsonObject);

	/**
	 * 列表
	 */
	List<JSONObject> listArticle(JSONObject jsonObject);

	/**
	 * 更新
	 */
	int updateArticle(JSONObject jsonObject);

	/**
	 * 删除
	 */
	int deleteArticle(JSONObject jsonObject);
}
