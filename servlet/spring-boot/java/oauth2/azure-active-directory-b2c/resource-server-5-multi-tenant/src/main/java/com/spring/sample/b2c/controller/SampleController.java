package com.spring.sample.b2c.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @ResponseBody
    @GetMapping(value = { "/hello" })
    @PreAuthorize("hasAnyAuthority('ROLE_Application.Permission.Role1', 'SCOPE_Delegated.Premisson.Scope1')")
    public String hello() {
        return "this is a resource-server protected by Azure Active Directory B2C. ";
    }
}