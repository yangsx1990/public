package com.aoji.controller;

import com.aoji.model.SysPermission;
import com.aoji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:25 2017/11/17
 */
@RestController
public class RestTestController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public List<SysPermission> query(){
       return  userService.getFunctionByName("admin");
    }
}
