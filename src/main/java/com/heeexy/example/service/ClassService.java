package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Class;
/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface ClassService {
	/**
	 * 新增
	 */
	JSONObject addClass(Class model);

	/**
	 * 列表
	 */
	JSONObject listClass(JSONObject jsonObject);

	/**
	 * 更新
	 */
	JSONObject updateClass(JSONObject jsonObject);

	/**
	 * 删除
	 */
	JSONObject deleteClass(JSONObject jsonObject);
}
