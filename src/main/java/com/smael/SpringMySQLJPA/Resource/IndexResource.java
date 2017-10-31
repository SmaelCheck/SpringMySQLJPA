package com.smael.SpringMySQLJPA.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping (value="/")
public class IndexResource {

    @GetMapping("/")

    public String indexAction(HttpServletRequest request, ModelMap model){
        return "index";
    }
}
