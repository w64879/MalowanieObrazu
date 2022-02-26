package com.w64879.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ObszarRysowania extends JComponent {

    private Image Obraz;
    private Graphics2D Grafika2d;
    private int AktualneX, AktualneY, PoprzednieX, PoprzednieY;

    public ObszarRysowania() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                PoprzednieX = e.getX();
                PoprzednieY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                AktualneX = e.getX();
                AktualneY = e.getY();
                if (Grafika2d != null) {
                    Grafika2d.drawLine(PoprzednieX, PoprzednieY, AktualneX, AktualneY);
                    repaint();
                    PoprzednieX = AktualneX;
                    PoprzednieY = AktualneY;
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (Obraz == null) {
            Obraz = createImage(getSize().width, getSize().height);
            Grafika2d = (Graphics2D) Obraz.getGraphics();
            Grafika2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();
        }

        g.drawImage(Obraz, 0, 0, null);
    }

    public void clear() {
        Grafika2d.setPaint(Color.white);
        Grafika2d.fillRect(0, 0, getSize().width, getSize().height);
        Grafika2d.setPaint(Color.black);
        repaint();
    }

    public void red() {
        Grafika2d.setPaint(Color.red);
    }

    public void black() {
        Grafika2d.setPaint(Color.black);
    }

    public void pink() {
        Grafika2d.setPaint(Color.pink);
    }

    public void green() {
        Grafika2d.setPaint(Color.green);
    }

    public void blue() {
        Grafika2d.setPaint(Color.blue);
    }

    public void yellow() {
        Grafika2d.setPaint(Color.yellow);
    }

    public void gray() {
        Grafika2d.setPaint(Color.gray);
    }

    public void cyan() {
        Grafika2d.setPaint(Color.cyan);
    }

    public void darkgray() {
        Grafika2d.setPaint(Color.darkGray);
    }

    public void orange() {
        Grafika2d.setPaint(Color.orange);
    }



}
