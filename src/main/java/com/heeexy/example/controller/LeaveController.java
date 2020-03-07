package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.LeaveService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Su
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/leave")
public class LeaveController {

	@Autowired
	private LeaveService leaveService;

	/**
	 * 查询列表
	 */
	@RequiresPermissions("leave:list")
	@GetMapping("/listLeave")
	public JSONObject listLevae(HttpServletRequest request) {
		return leaveService.listLeave(CommonUtil.request2Json(request));
	}

	/**
	 * 新增
	 */
	@RequiresPermissions("leave:add")
	@PostMapping("/addLeave")
	public JSONObject addLevae(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "content");
		return leaveService.addLeave(requestJson);
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("leave:update")
	@PostMapping("/updateLeave")
	public JSONObject updateLevae(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return leaveService.updateLeave(requestJson);
	}

	/**
	 * 删除
	 */
	@RequiresPermissions("leave:delete")
	@PostMapping("/deleteLeave")
	public JSONObject deleteLevae(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return leaveService.deleteLeave(requestJson);
	}
}
