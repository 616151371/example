package com.heeexy.example.entity;

import java.util.Date;

public class Class {
    private Integer id;

    /**
     * 课程类型 1-课程大纲 2-实验大纲
     */
    private String type;

    /**
     * 年级 大一--大四
     */
    private String grade;

    /**
     * 科目 高数、物理、英语
     */
    private String subject;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否有效  1.有效  2无效
     */
    private String deleteStatus;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程类型 1-课程大纲 2-实验大纲
     *
     * @return type - 课程类型 1-课程大纲 2-实验大纲
     */
    public String getType() {
        return type;
    }

    /**
     * 设置课程类型 1-课程大纲 2-实验大纲
     *
     * @param type 课程类型 1-课程大纲 2-实验大纲
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取年级 大一--大四
     *
     * @return grade - 年级 大一--大四
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级 大一--大四
     *
     * @param grade 年级 大一--大四
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取科目 高数、物理、英语
     *
     * @return subject - 科目 高数、物理、英语
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置科目 高数、物理、英语
     *
     * @param subject 科目 高数、物理、英语
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return update_by - 创建人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置创建人
     *
     * @param updateBy 创建人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否有效  1.有效  2无效
     *
     * @return delete_status - 是否有效  1.有效  2无效
     */
    public String getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置是否有效  1.有效  2无效
     *
     * @param deleteStatus 是否有效  1.有效  2无效
     */
    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}