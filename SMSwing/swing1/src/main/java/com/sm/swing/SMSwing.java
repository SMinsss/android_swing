package com.sm.swing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SMSwing {

    private static final Logger LOG = LoggerFactory.getLogger(SMSwing.class);

    public static void main(String[] args) {
        try {
            //LogCollector.register();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    MainWindow window = new MainWindow();
                    window.open();
                }
            });
        } catch (Throwable e) {
            LOG.error("Error: {}", e.getMessage(), e);
            System.exit(1);
        }
    }

}
