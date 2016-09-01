/**
 * @(#)NamedComponet.java, 2016年7月6日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.common;

/**
 * 命名组件
 * 
 * @author hzyangxiong2014@corp.netease.com
 */
public abstract class NamedComponent extends Component implements NamedAware {

    /**
     * 组件名称
     */
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
