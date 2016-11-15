package com.yinrong.controller;



import com.yinrong.model.User;
import com.yinrong.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinrong on 2016/4/30.
 *绑定参数四种种方式ModelAttribute，PathVariable，RequestParam，HttpServletRequest
 *restful方式为PathVariable, RequestParam自带教研
 *
 *
 */

@Controller
@RequestMapping("/users")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    private UserService userService;

    @Autowired

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value="/viewDetail",method = RequestMethod.GET)
    public String viewUser(@RequestParam String name, @ModelAttribute("name")String modelname, HttpServletRequest request, HttpServletResponse response ,Model model){
        log.info("name is" +name);
        User user =userService.getUser(name);
        log.info("model name is" +modelname);
        String requestname = (String) request.getParameter("name");
        log.info("requestmodel name is" +requestname);
        model.addAttribute(user);//user不能为空，否则出错，最好返回一个ModelAndView，来绑定参数和视图
        return "userDetail";
    }
    @RequestMapping(value = "/view/{name}" ,method = RequestMethod.GET)
    public  String viewUserByName(@PathVariable String name,Model model){
        log.info("name is " +name);
        User user =userService.getUser(name);
        model.addAttribute(user);
        return "userDetail";
    }
    @RequestMapping(value = "/add/{name}" ,method = RequestMethod.GET,params = "")
    public  String addUserByName(@PathVariable String name,Model model){
        log.info("name is " +name);

        return "userDetail";
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listUsers(@RequestParam(value = "size",required = false) Integer size,Model model){
        log.info("size is "+size);
        List<User>
        list=userService.getUserlist();
        List<User>userList=new ArrayList<User>();

        if(size!=null ){
            userList=list.subList(0,size);

        }else{
            userList=list;
        }
        model.addAttribute(userList);
        log.info("userlist size:" +userList.size());
        return "userlist";
    }
    @RequestMapping(value = "/list/json",method = RequestMethod.GET)
    public @ResponseBody List<User> listUsersJson(@RequestParam(value = "size",required = false) Integer size,Model model){
        log.info("size is "+size);
        List<User>
                list=userService.getUserlist();
        List<User>userList=new ArrayList<User>();

        if(size!=null ){
            userList=list.subList(0,size);

        }else{
            userList=list;
        }
       return userList;
    }
}