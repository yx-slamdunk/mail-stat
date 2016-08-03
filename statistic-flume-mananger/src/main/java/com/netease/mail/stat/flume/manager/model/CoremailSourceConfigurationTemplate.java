/**
 * @(#)CoremailSourceConfigurationTemplate.java, 2016年8月3日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.model;

import com.netease.mail.stat.flume.manager.common.ApplicationConfigurationTemplate;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
public class CoremailSourceConfigurationTemplate extends
    ApplicationConfigurationTemplate {
    private String type;

    private String spoolRoot;

    private String serviceTag;

    private String subDir;

    private String subDirDateFormat;

    private String filePattern;

    private String hdfsSubPath;

    private String interval;

    private String port;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpoolRoot() {
        return spoolRoot;
    }

    public void setSpoolRoot(String spoolRoot) {
        this.spoolRoot = spoolRoot;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public String getSubDir() {
        return subDir;
    }

    public void setSubDir(String subDir) {
        this.subDir = subDir;
    }

    public String getSubDirDateFormat() {
        return subDirDateFormat;
    }

    public void setSubDirDateFormat(String subDirDateFormat) {
        this.subDirDateFormat = subDirDateFormat;
    }

    public String getFilePattern() {
        return filePattern;
    }

    public void setFilePattern(String filePattern) {
        this.filePattern = filePattern;
    }

    public String getHdfsSubPath() {
        return hdfsSubPath;
    }

    public void setHdfsSubPath(String hdfsSubPath) {
        this.hdfsSubPath = hdfsSubPath;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
