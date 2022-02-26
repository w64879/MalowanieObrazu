package com.w64879.projekt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RysowanieSwing {
    JButton PrzyciskWyczysc, PrzyciskCzarny, PrzyciskNiebieski, PrzyciskZielony, PrzyciskCzerwony, PrzyciskRozowy, PrzyciskZolty, PrzyciskSzary, PrzyciskCyan, PrzyciskCiemnoszary, PrzyciskPomaranczowy;
    ObszarRysowania obszarRysowania;
    ActionListener Listener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == PrzyciskWyczysc) {
                obszarRysowania.clear();
            } else if (e.getSource() == PrzyciskCzarny) {
                obszarRysowania.black();
            } else if (e.getSource() == PrzyciskNiebieski) {
                obszarRysowania.blue();
            } else if (e.getSource() == PrzyciskZielony) {
                obszarRysowania.green();
            } else if (e.getSource() == PrzyciskCzerwony) {
                obszarRysowania.red();
            } else if (e.getSource() == PrzyciskRozowy) {
                obszarRysowania.pink();
            } else if (e.getSource() == PrzyciskZolty) {
                obszarRysowania.yellow();
            }else if (e.getSource() == PrzyciskSzary) {
                obszarRysowania.gray();
            }else if (e.getSource() == PrzyciskCyan) {
                obszarRysowania.cyan();
            }else if (e.getSource() == PrzyciskCiemnoszary) {
                obszarRysowania.darkgray();
            }else if (e.getSource() == PrzyciskPomaranczowy) {
                obszarRysowania.orange();
            }


        }
    };

    public static void main(String[] args) {
        new RysowanieSwing().show();
    }

    public void show() {
        JFrame ramka = new JFrame("Malowanie Obrazu");
        Container kontener = ramka.getContentPane();
        kontener.setLayout(new BorderLayout());
        obszarRysowania = new ObszarRysowania();
        kontener.add(obszarRysowania, BorderLayout.CENTER);
        JPanel Menu = new JPanel();
        Menu.setBackground(Color.ORANGE);

        PrzyciskWyczysc = new JButton("Wyczysc");
        PrzyciskWyczysc.addActionListener(Listener);
        PrzyciskWyczysc.setPreferredSize(new Dimension(140, 40));

        PrzyciskCzarny = new JButton();
        PrzyciskCzarny.addActionListener(Listener);
        PrzyciskCzarny.setBackground(Color.black);
        PrzyciskCzarny.setPreferredSize(new Dimension(40, 40));

        PrzyciskNiebieski = new JButton();
        PrzyciskNiebieski.addActionListener(Listener);
        PrzyciskNiebieski.setBackground(Color.blue);
        PrzyciskNiebieski.setPreferredSize(new Dimension(40, 40));

        PrzyciskZielony = new JButton();
        PrzyciskZielony.addActionListener(Listener);
        PrzyciskZielony.setBackground(Color.green);
        PrzyciskZielony.setPreferredSize(new Dimension(40, 40));

        PrzyciskCzerwony = new JButton();
        PrzyciskCzerwony.addActionListener(Listener);
        PrzyciskCzerwony.setBackground(Color.red);
        PrzyciskCzerwony.setPreferredSize(new Dimension(40, 40));

        PrzyciskRozowy = new JButton();
        PrzyciskRozowy.addActionListener(Listener);
        PrzyciskRozowy.setBackground(Color.pink);
        PrzyciskRozowy.setPreferredSize(new Dimension(40, 40));

        PrzyciskZolty = new JButton();
        PrzyciskZolty.addActionListener(Listener);
        PrzyciskZolty.setBackground(Color.yellow);
        PrzyciskZolty.setPreferredSize(new Dimension(40, 40));

        PrzyciskSzary = new JButton();
        PrzyciskSzary.addActionListener(Listener);
        PrzyciskSzary.setBackground(Color.gray);
        PrzyciskSzary.setPreferredSize(new Dimension(40, 40));

        PrzyciskCyan = new JButton();
        PrzyciskCyan.addActionListener(Listener);
        PrzyciskCyan.setBackground(Color.cyan);
        PrzyciskCyan.setPreferredSize(new Dimension(40, 40));

        PrzyciskCiemnoszary = new JButton();
        PrzyciskCiemnoszary.addActionListener(Listener);
        PrzyciskCiemnoszary.setBackground(Color.darkGray);
        PrzyciskCiemnoszary.setPreferredSize(new Dimension(40, 40));

        PrzyciskPomaranczowy = new JButton();
        PrzyciskPomaranczowy.addActionListener(Listener);
        PrzyciskPomaranczowy.setBackground(Color.orange);
        PrzyciskPomaranczowy.setPreferredSize(new Dimension(40, 40));

        Menu.add(PrzyciskCzarny);
        Menu.add(PrzyciskZielony);
        Menu.add(PrzyciskNiebieski);
        Menu.add(PrzyciskCzerwony);
        Menu.add(PrzyciskRozowy);
        Menu.add(PrzyciskZolty);
        Menu.add(PrzyciskCyan);
        Menu.add(PrzyciskSzary);
        Menu.add(PrzyciskCiemnoszary);
        Menu.add(PrzyciskPomaranczowy);

        Menu.add(PrzyciskWyczysc);

        kontener.add(Menu, BorderLayout.SOUTH);

        ramka.setSize(1280, 720);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);


    }

}
