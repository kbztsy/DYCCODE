package com.dtsp.controller;


import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelOld.Login;
import com.dtsp.configure.WebSecurityConfig;
import com.dtsp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/yh")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private Login login;
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/userInfo")
    public String userInfo(){
        return "userInfo";
    }

    @RequestMapping(value = "/Sign")
    @ResponseBody
    public JSONObject SelectUP(HttpServletRequest request, HttpServletResponse response,HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        login.setUsername(username);
        login.setPassword(password);
        List<Login> list = loginService.SelectLogin(login);
        JSONObject jsonObject = new JSONObject();
        if(list.size() == 1){
            jsonObject.put("StateMsg","0");
            login.setUsername(list.get(0).getUsername());
            login.setUsername(list.get(0).getPassword());
            login.setJurisdiction(list.get(0).getJurisdiction());
            session.setAttribute(WebSecurityConfig.SESSION_KEY, list.get(0).getUsername());
            return jsonObject;
        }else{
            jsonObject.put("StateMsg","1");
            jsonObject.put("Message","登录失败");
            return jsonObject;
        }
    }

    @RequestMapping("/logout")
    @ResponseBody
    public boolean logout(HttpSession session) {
        try {
            session.removeAttribute(WebSecurityConfig.SESSION_KEY);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
