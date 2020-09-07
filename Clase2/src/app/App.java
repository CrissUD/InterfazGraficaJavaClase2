package app;

import javax.swing.SwingUtilities;

import app.login.LoginTemplate;

public class App {
  public static void main(String[] args) {
    Runnable runApplication = new Runnable() {
      public void run(){
        LoginTemplate login = new LoginTemplate();
        login.getClass();
      }
    };
    SwingUtilities.invokeLater(runApplication);
  }
}