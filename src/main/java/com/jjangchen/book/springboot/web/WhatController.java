package com.jjangchen.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatController {
    @GetMapping("/what")
    public String What() {
        return "what";
    }
}
