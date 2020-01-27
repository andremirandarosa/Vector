package com.example.backend2.config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** Controlador MVC Padrao */
@Controller
public class MVCConfig implements ErrorController{
    
    private static final String ROOT_PATH = "/";
    
    @RequestMapping(value = ROOT_PATH)
    public String root(){
        
        return "index.html";
    }
    
    @Override
    public String getErrorPath(){
        
        return ROOT_PATH;
    }
}
