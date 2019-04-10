package com.ays.controller;

import com.ays.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

@Controller
@RequestMapping("/user")
//@Api(value = "测试信息", tags = {"测试相关接口"})//swagger控制器说明注解
@Api(value = "用户信息", description = "用户信息", produces = MediaType.APPLICATION_JSON)
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/addUi.htm")
    public String addUi(HttpServletRequest request,Model model){
        return "user/add";
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String add(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
       // User user = userService.;
        //绑定对象到test/index.jsp
       // model.addAttribute("user", user);
        return "test/index";
    }

   /* @RequestMapping("/index_api")
    @ResponseBody
    @ApiOperation(value = "获取单个测试实例", notes = "传入一个id，获取该id对应的实例。",httpMethod = "GET")//swagger方法注解
    public User Index(HttpServletRequest request,Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        return this.userService.getModelById(id);
    }*/
}