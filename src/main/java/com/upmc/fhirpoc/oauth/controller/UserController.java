/**
 * Copyright (c) 2015 UPMC All rights reserved.
 */
package com.upmc.fhirpoc.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public User list() {
    User user = new User();
    user.name = "shijia";
    return user;

  }
}
