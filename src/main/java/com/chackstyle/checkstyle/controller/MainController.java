package com.chackstyle.checkstyle.controller;

import org.springframework.web.bind.annotation.RestController;

import com.chackstyle.checkstyle.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @Autowired
  private MainService service;

  @GetMapping("path")
  public String getMethodName() {
      service.process();
      return "Success";
  }

}
