package app;

import javax.swing.SwingUtilities;

import app.login.LoginTemplate;

public class App {
  public static void main(String[] args) {
    Runnable runApplication = new Runnable() {
      public void run(){
        LoginTemplate vista = new LoginTemplate();
        vista.getClass();
      }
    };
    SwingUtilities.invokeLater(runApplication);
  }
}