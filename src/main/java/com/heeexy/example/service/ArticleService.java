package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: Su
 * @date: 2017/10/24 16:06
 */
public interface ArticleService {
	/**
	 * 新增
	 */
	JSONObject addArticle(JSONObject jsonObject);

	/**
	 * 列表
	 */
	JSONObject listArticle(JSONObject jsonObject);

	/**
	 * 更新
	 */
	JSONObject updateArticle(JSONObject jsonObject);

	/**
	 * 删除
	 */
	JSONObject deleteArticle(JSONObject jsonObject);
}
