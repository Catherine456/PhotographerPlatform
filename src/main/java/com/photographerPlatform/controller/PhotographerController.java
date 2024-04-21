package com.photographerPlatform.controller;
import com.photographerPlatform.pojo.Photographer;
import com.photographerPlatform.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhotographerController {
    @Autowired
    private PhotographerService photographerServ;

//    @RequestMapping("/login")
//    public ModelAndView login(Photographer photographer) {
//        System.out.println("======================进入controller了");
//        ModelAndView modelAndView = new ModelAndView();
////        userService.addUser(user);
//        photographerServ.login(photographer);
//        System.out.println("login方法执行完成");
//        modelAndView.setViewName("ok");
//        return modelAndView;
//    }

    @RequestMapping("/register")
    public ModelAndView register(Photographer photographer) {
        System.out.println("======================进入controller了");
        ModelAndView modelAndView = new ModelAndView();
//        userService.addUser(user);
        photographerServ.registerPho(photographer);
        System.out.println("register方法执行完成");
        modelAndView.setViewName("ok");
        return modelAndView;
    }


}
