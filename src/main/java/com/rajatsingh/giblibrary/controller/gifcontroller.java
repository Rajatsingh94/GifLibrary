package com.rajatsingh.giblibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rajat on 11/6/2017.
 */
@Controller
public class gifcontroller {
    @RequestMapping("/")
    public String listgif()
    {
        return "home";
    }
}
