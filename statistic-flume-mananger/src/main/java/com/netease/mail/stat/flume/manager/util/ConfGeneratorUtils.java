/**
 * @(#)ConfGeneratorUtils.java, 2016年8月3日. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
public class ConfGeneratorUtils {

    public static void main(String[] args) {

    }

    public ConfGeneratorUtils() {

    }

    public static void initialize() {
        File resource = new File("");
        if (!resource.exists()) {
            throw new RuntimeException("File " + resource.getAbsolutePath()
                + " does't exist.");
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(resource));

        } catch (FileNotFoundException e) {}

        //初始化模板引擎
        Velocity.init("src/velocity.properties");
        //获取VelocityContext
        VelocityContext context = new VelocityContext();
        //为Context设置变量
        context.put("content", "HelloWorld");
        context.put("who", "arthinking");
    }
}
