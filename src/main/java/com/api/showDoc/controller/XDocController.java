package com.api.showDoc.controller;

import com.api.showDoc.service.XDocService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * XDoc的Spring Web入口
 *
 * @author hyy
 *
 */
@RequestMapping("xdoc")
public class XDocController {

    private Logger log = LoggerFactory.getLogger(XDocController.class);

    @Autowired
    private XDocService xDocService;

    /**
     * 生成文档
     * @author 黄育益
     * @description  获取所有文档a
     * @date 2019/3/26
    */
    @ResponseBody
    //@IgnoreApi  加上次注解 ，不生产文档
    @RequiresPermissions("base:sysregion:getProvince2")
    @RequestMapping("apis")
    public Object apis(HttpServletRequest request, HttpServletResponse response) {
        return xDocService.apis(request,response);
    }

}
