package br.com.monica.project.tododolist.user;

public class UserModel {
    private String username;
    private String name;
    private String password;


 //inserir valor (username)
  public void setUsername(String username) {
      this.username = username;
  }

  //buscar valor (username)
  public String getUsername() {
      return username;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public String getPassword() {
      return password;
  }

}

