package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.Class;
import java.util.List;

/**
 * @author: Su
 * @date: 2017/10/24 16:06
 */
public interface ClassDao {
	/**
	 * 新增
	 */
	int addClass(Class model);

	/**
	 * 统计文章总数
	 */
	int countClass(JSONObject jsonObject);

	/**
	 * 列表
	 */
	List<JSONObject> listClass(JSONObject jsonObject);

	/**
	 * 更新
	 */
	int updateClass(JSONObject jsonObject);

	/**
	 * 删除
	 */
	int deleteClass(JSONObject jsonObject);
}
