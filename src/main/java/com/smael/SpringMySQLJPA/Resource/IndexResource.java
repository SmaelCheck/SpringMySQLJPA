package com.smael.SpringMySQLJPA.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController(value ="/")
@RequestMapping(value ="/")
public class IndexResource {

    @RequestMapping(value="/", method = GET)
    public ModelAndView indexAction( Model model
    ){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("membre-form");
        return mav;
    }

    @RequestMapping(value = "/", method = POST)
    public void postLogiForm(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(">>>>>>>>>>>>>>>>>> USERNAME : "+username + " PASSWORD : "+password);
    }
}
