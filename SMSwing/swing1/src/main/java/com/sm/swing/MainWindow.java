package com.sm.swing;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Created by Administrator on 2017/10/9.
 */

public class MainWindow extends JFrame {

    private static final double BORDER_RATIO = 0.15;
    private static final double WINDOW_RATIO = 1 - BORDER_RATIO * 2;
    private static final double SPLIT_PANE_RESIZE_WEIGHT = 0.15;

    public void open() {
        pack();
        setLocationAndPosition();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        if (settings.getInput().isEmpty()) {
//            openFile();
//        } else {
//            openFile(settings.getInput().get(0));
//        }
    }

    public void setLocationAndPosition() {
//        if (this.settings.loadWindowPos(this)) {
//            return;
//        }
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode mode = gd.getDisplayMode();
        int w = mode.getWidth();
        int h = mode.getHeight();
        setLocation((int) (w * BORDER_RATIO), (int) (h * BORDER_RATIO));
        setSize((int) (w * WINDOW_RATIO), (int) (h * WINDOW_RATIO));
    }

}
