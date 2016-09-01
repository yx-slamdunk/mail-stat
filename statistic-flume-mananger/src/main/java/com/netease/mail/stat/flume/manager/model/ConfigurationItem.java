/**
 * @(#)ConfigurationItem.java, 2016年8月4日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.model;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
public class ConfigurationItem {

    /**
     * 配置项
     */
    private long id;

    /**
     * 配置项key
     */
    private String key;

    /**
     * 关联的组件Id
     */
    private int componentId;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 是否必须
     */
    private boolean isRequired;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }
}
