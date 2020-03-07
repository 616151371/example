package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.LeaveService;
import com.heeexy.example.service.WorkloadService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Su
 * @description: 相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/workload")
public class WorkloadController {

	@Autowired
	private WorkloadService workloadService;

	/**
	 * 查询列表
	 */
	@RequiresPermissions("workload:list")
	@GetMapping("/listworkload")
	public JSONObject listWorkload(HttpServletRequest request) {
		return workloadService.listWorkload(CommonUtil.request2Json(request));
	}

	/**
	 * 新增
	 */
	@RequiresPermissions("workload:add")
	@PostMapping("/addworkload")
	public JSONObject addWorkload(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "content");
		return workloadService.addWorkload(requestJson);
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("workload:update")
	@PostMapping("/updateworkload")
	public JSONObject updateWorkload(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return workloadService.updateWorkload(requestJson);
	}

	/**
	 * 删除
	 */
	@RequiresPermissions("workload:delete")
	@PostMapping("/deleteworkload")
	public JSONObject deleteWorkload(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return workloadService.deleteWorkload(requestJson);
	}
}
