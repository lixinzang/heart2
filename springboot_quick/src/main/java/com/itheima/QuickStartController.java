package com.itheima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class QuickStartController {
    @RequestMapping("/demo01")
    public String quick() {
        System.out.println("eeee");
        return "aaaaa";
    }
}
