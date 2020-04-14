package app.vistaPrincipal;

import javax.swing.JFrame;

public class VistaPrincipalTemplate extends JFrame {

    public VistaPrincipalTemplate() {
        super("Vista Principal");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}