package oit.is.z1416.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import oit.is.z1416.kaizi.janken.model.Entry;

@Controller
public class Lec02Controller {

  @GetMapping("/lec02")
  public String lec02_hand(@RequestParam String hand, ModelMap model) {
    model.addAttribute("hand", hand);
    return "lec02.html";
  }

  @Autowired
  private Entry entry;

  @GetMapping("/lec02/entry")
  public String lec03(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("entry", this.entry);
    return "lec02.html";
  }

}
