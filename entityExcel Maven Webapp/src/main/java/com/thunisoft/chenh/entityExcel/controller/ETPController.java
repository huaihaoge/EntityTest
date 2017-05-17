package com.thunisoft.chenh.entityExcel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/main")
public class ETPController {


    @RequestMapping("/entityList")
    public String toIndex(HttpServletRequest request, Model model) {

        return "entityList";
    }
    
}
