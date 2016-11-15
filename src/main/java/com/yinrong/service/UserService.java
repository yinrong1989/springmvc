package com.yinrong.service;

import com.yinrong.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinrong on 2016/4/30.
 */
public class UserService {
    public  static Map<String,User> userMap=new HashMap<String,User>();
    private  static List<User>userlist=new ArrayList<User>();
    public UserService() {
        init();
    }
   public void init(){
       userlist.add(new User("yinrong",28,"男"));
       userlist.add(new User("jiaxiaohong",26,"女"));
       userlist.add(new User("luowengjing",23,"女"));
       userlist.add(new User("liuqian",27,"女"));
       for (User user:userlist){
           userMap.put(user.getName(),user);
       }


   }
    public User getUser(String name){
        return userMap.get(name);
    }
    public List<User> getUserlist(){
        return  userlist;
    }
}
