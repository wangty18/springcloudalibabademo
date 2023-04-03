package com.add.springcloud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/add")
    public String add(){
        System.out.println("1111!");
        return "222222!";
    }
}
