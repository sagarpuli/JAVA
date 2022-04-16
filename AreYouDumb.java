package com.areyoudumb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        new AreYouDumb();
    }
}

class AreYouDumb implements ActionListener {

    JButton yes = new JButton("Yes");
    JButton no = new JButton("No");
    JButton restart = new JButton("Restart");
    JPanel yesPanel = new JPanel();
    JLabel hehe = new JLabel("I knew it! \uD83D\uDE1B");
    JLabel cool = new JLabel("Cool! \uD83D\uDE0E");

    AreYouDumb(){
        JFrame frame = new JFrame("Breh");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        Color dm = new Color(24, 28,34);
        JPanel panel = new JPanel();
        panel.setBackground(dm);
        panel.setSize(500,500);
        panel.setLayout(null);

        yes.setBounds(100,300,80,50);
        yes.setBackground(dm);
        yes.setForeground(Color.white);
        yes.setFocusable(false);
        yes.addActionListener(this);

        no.setBounds(300,300,80,50);
        no.addActionListener(this);
        no.setBackground(dm);
        no.setForeground(Color.white);
        no.setFocusable(false);

        JLabel ard = new JLabel("Are You Dumb !?");
        ard.setFont(new Font("Sans Serif", Font.BOLD, 40));
        ard.setBounds(78,25,400,200);
        ard.setForeground(Color.white);


        yesPanel.setBackground(dm);
        yesPanel.setSize(500,500);
        yesPanel.setLayout(null);


        hehe.setFont(new Font("Sans Serif", Font.BOLD, 50));
        hehe.setBounds(100,50,400,200);
        hehe.setForeground(Color.white);
        hehe.setVisible(false);


        cool.setFont(new Font("Sans Serif", Font.BOLD, 50));
        cool.setBounds(150,50,400,200);
        cool.setForeground(Color.white);
        cool.setVisible(false);
        

        restart.setBounds(100,300,80,50);
        restart.setBackground(dm);
        restart.setForeground(Color.white);
        restart.setFocusable(false);
        restart.addActionListener(this);
        restart.setVisible(false);

        yesPanel.add(hehe);
        yesPanel.add(cool);
        yesPanel.add(restart);
        yesPanel.setVisible(false);

        frame.add(yesPanel);
        frame.add(panel);
        panel.add(ard);
        panel.add(yes);
        panel.add(no);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x, y, luck;
        x =  ThreadLocalRandom.current().nextInt(200, 400 + 1);
        y = ThreadLocalRandom.current().nextInt(200, 400 + 1);
        luck = ThreadLocalRandom.current().nextInt(1,8 + 1);
        if (e.getSource() == no){
            no.setBounds(x,y,80,50);
        }
        if (e.getSource() ==  yes){
            if (luck == 6){
                cool.setVisible(true);
            } else {
            hehe.setVisible(true);}
            yesPanel.setVisible(true);
            yes.setVisible(false);
            restart.setVisible(true);
            no.setVisible(false);

        }
        if(e.getSource() == restart){
            yesPanel.setVisible(false);
            yes.setVisible(true);
            no.setVisible(true);
            hehe.setVisible(false);
            cool.setVisible(false);
        }
    }
}