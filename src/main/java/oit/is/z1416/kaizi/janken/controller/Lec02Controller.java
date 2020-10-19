package oit.is.z1416.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import oit.is.z1416.kaizi.janken.model.Entry;

@Controller
@RequestMapping("/lec02")
public class Lec02Controller {

  @Autowired
  private Entry entry;

  @GetMapping("/lec02")
  public String lec02_hand(@RequestParam String hand, ModelMap model) {
    model.addAttribute("hand", hand);
    return "lec02.html";
  }

  @GetMapping("/lec02")
  public String lec03(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("room", this.entry);
    model.addAttribute("name", loginUser);
    return "lec02.html";
  }

}
