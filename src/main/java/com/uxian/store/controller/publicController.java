package com.uxian.store.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class publicController {
    @GetMapping("/login")
    public String toXinXiGuanLi() {
        return "login";
    }
}
