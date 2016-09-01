/**
 * @(#)SourceTemplate.java, 2016年8月4日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.model;

import java.util.List;

import com.netease.mail.stat.flume.manager.common.ChannelComponent;
import com.netease.mail.stat.flume.manager.common.NamedComponent;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
public class SourceComponent extends NamedComponent {
    /**
     * 名称
     */
    private String name;

    private List<ConfigurationItem> configurations;

    private ChannelSelectorComponent channelSelector;

    private ChannelComponent channelComponent;

    private List<InterceptorComponent> interceptorComponents;

}
