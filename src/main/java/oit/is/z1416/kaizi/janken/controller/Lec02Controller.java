package oit.is.z1416.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1416.kaizi.janken.model.Janken;
import oit.is.z1416.kaizi.janken.model.Entry;

@Controller
public class Lec02Controller {

  @PostMapping("/lec02")
  public String lec02(@RequestParam String userName, ModelMap model) {
    model.addAttribute("userName", userName);
    return "lec02.html";
  }

  @Autowired
  private Entry entry;

  @GetMapping("/lec02")
  public String lec03(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("entry", this.entry);
    model.addAttribute("loginUser", loginUser);
    return "lec02.html";
  }

}
