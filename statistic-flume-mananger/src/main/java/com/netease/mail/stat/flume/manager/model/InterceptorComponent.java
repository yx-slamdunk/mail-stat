/**
 * @(#)InterceptorComponent.java, 2016年8月5日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.model;

import java.util.List;

import com.netease.mail.stat.flume.manager.common.NamedComponent;

/**
 * 用于Source的过滤器
 * 
 * @author hzyangxiong2014@corp.netease.com
 */
public class InterceptorComponent extends NamedComponent {

    /**
     * 配置项
     */
    private List<ConfigurationItem> configurations;

}
