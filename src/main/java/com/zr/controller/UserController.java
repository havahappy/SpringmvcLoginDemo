package com.zr.controller;

import java.util.Date;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  
  
import com.zr.model.User;  
import com.zr.service.UserService;  

@RequestMapping("/controller")
@Controller  
public class UserController {  
    @Autowired  
    private UserService userService;
//    @RequestMapping("/reg")  
//    public String register(){  
//        return "index";  
//    }  
    @RequestMapping(value="/user",method=RequestMethod.POST)  
    public ModelAndView addUser(User user) { 
        ModelAndView mav=null;
        user.setRegtime(new Date());
        //try {  
            userService.addUser(user);  
        //  request.setAttribute("user", user);  
            mav = new ModelAndView();  
            mav.setViewName("success");  
            mav.addObject("user", user);  
            mav.addObject("msg", "注册成功了，可以去登陆了");  
            return mav;  
//        } catch (Exception e) {  
//            mav.setViewName("error");  
//            mav.addObject("user", null);  
//            mav.addObject("msg", "注册失败");  
//            return mav;  
//        }  
    }  
  
}  
