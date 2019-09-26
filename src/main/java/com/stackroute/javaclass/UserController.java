package com.stackroute.javaclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "display",method = RequestMethod.GET)
    public ModelAndView user(ModelMap model)
    {
        //ApplicationContext context=new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        //User user=context.getBean("user",User.class);
        User user = new User("Shivani");
        System.out.println(user.getName());
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("user",user);
//        model.addAttribute("user","bhbj");
//        model.addAttribute("user",user.getName());
        return modelAndView;
    }
}
