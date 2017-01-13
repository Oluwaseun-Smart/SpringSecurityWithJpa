/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.securitypratice.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Oluwaseun_Smart
 */
@RestController
public class PostController {

    @RequestMapping("/posts/")
    public String list() {
        return "list posts...";
    }

    @RequestMapping("/admin/posts/create")
    public String addPost() {
        return "add posts...";
    }
}
