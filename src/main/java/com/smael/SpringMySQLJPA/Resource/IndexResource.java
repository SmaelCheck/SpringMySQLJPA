package com.smael.SpringMySQLJPA.Resource;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController(value ="/")
@RequestMapping(value ="/")
public class IndexResource {

    @GetMapping(value="/")
    public ModelAndView indexAction(ModelMap model){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value="/login")
    public ModelAndView loginAction(Model aModel){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("membre-form");
        return mav;
    }
}
