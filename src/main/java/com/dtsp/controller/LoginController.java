package com.dtsp.controller;


import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private Login login;
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/userInfo")
    public String userInfo(){
        return "userInfo";
    }

    @RequestMapping(value = "/Sign")
    @ResponseBody
    public JSONObject SelectUP(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        login.setUsername(username);
        login.setPassword(password);
        System.out.println(username);
        System.out.println(password);
        List<Login> list = loginService.SelectLogin(login);
        JSONObject jsonObject = new JSONObject();
        if(list.size() == 1){
            jsonObject.put("StateMsg","0");
            login.setUsername(list.get(0).getUsername());
            login.setUsername(list.get(0).getPassword());
            login.setJurisdiction(list.get(0).getJurisdiction());
            return jsonObject;
        }else{
            jsonObject.put("StateMsg","1");
            jsonObject.put("Message","登录失败");
            return jsonObject;
        }
    }
}
