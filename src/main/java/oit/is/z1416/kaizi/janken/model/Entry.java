package oit.is.z1416.kaizi.janken.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Entry {
  ArrayList<String> users = new ArrayList<>();

  public void addUser(String userName) {
    for (String user : this.users) {
      if (userName.equals(user)) {
        return;
      }
    }
    this.users.add(userName);
  }

  public ArrayList<String> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<String> users) {
    this.users = users;
  }

}
