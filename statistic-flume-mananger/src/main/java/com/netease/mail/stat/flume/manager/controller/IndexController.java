/**
 * @(#)IndexController.java, 2016Äê6ÔÂ20ÈÕ. 
 * 
 * Copyright 2016 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.stat.flume.manager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hzyangxiong2014@corp.netease.com
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public ModelAndView index(HttpServletRequest request,
        HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("Welcom to statistic flume manager!");
        return mv;
    }
}
