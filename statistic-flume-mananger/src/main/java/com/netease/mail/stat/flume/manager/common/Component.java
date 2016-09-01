/**
 * @(#)Component.java, 2016年7月6日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.common;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
public abstract class Component {
    /**
     * 组件在数据库id
     */
    protected long id;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
