package com.zomwi.simidic;

import com.zomwi.simidic.ui.MainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        MainFrame v = new MainFrame();
        v.setVisible(true);
    }
}
