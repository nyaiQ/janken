package oit.is.z1416.kaizi.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1416.kaizi.janken.model.User;
import oit.is.z1416.kaizi.janken.model.UserMapper;
import oit.is.z1416.kaizi.janken.model.Entry;
import oit.is.z1416.kaizi.janken.model.Janken;

@Controller
public class Lec02Controller {

  @GetMapping("/gu")
  public String gu(ModelMap model) {
    String hand = "Gu";
    Janken janken = new Janken(hand);
    model.addAttribute("yourhand", hand);
    model.addAttribute("result", janken.result);
    return "lec02.html";
  }

  @GetMapping("/choki")
  public String choki(ModelMap model) {
    String hand = "Choki";
    Janken janken = new Janken(hand);
    model.addAttribute("yourhand", hand);
    model.addAttribute("result", janken.result);
    return "lec02.html";
  }

  @GetMapping("/pa")
  public String pa(ModelMap model) {
    String hand = "Pa";
    Janken janken = new Janken(hand);
    model.addAttribute("yourhand", hand);
    model.addAttribute("result", janken.result);
    return "lec02.html";
  }

  @Autowired
  private Entry room;

  @GetMapping("/lec02")
  public String getname(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);
    model.addAttribute("loginUser", loginUser);
    return "lec02.html";
  }

  @Autowired
  UserMapper userMapper;

  @GetMapping("lec02/{id}")
  public String step2(@PathVariable Integer id, ModelMap model) {
    User user2 = userMapper.selectById(id);
    model.addAttribute("user2", user2);
    return "lec02.html";
  }

}
