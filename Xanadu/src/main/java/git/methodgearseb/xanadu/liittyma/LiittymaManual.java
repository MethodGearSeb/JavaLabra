package git.methodgearseb.xanadu.liittyma;

import java.awt.*;
import javax.swing.*;

public class LiittymaManual extends javax.swing.JFrame {
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;

    public LiittymaManual() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        GridLayout layout = new GridLayout(4, 4);
        BorderLayout layout1 = new BorderLayout();
        Dimension dimension = new Dimension(800, 800);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(dimension);
        setMinimumSize(dimension);

        jPanel1.setLayout(layout);
        jPanel1.setSize(dimension);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
    }
    
    private void run() {
        getContentPane().add(jPanel1, "Center");
        pack();
        
    }
}
