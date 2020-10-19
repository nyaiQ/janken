package oit.is.z1416.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lec02Controller {

  @PostMapping("/lec02")
  public String lec02(@RequestParam String userName, ModelMap model) {
    model.addAttribute("userName", userName);
    return "lec02.html";
  }

  @GetMapping("/lec02")
  public String lec02_hand(@RequestParam String hand, ModelMap model) {
    model.addAttribute("hand", hand);
    return "lec02.html";
  }

}
