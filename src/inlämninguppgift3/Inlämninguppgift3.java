
package inlämninguppgift3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class Inlämninguppgift3 extends JFrame implements ActionListener {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton z1 = new JButton("Nytt spel");
    Ebutton b1 = new Ebutton("1");
    Ebutton b2 = new Ebutton("2");
    Ebutton b3 = new Ebutton("3");
    Ebutton b4 = new Ebutton("4");
    Ebutton b5 = new Ebutton("5");
    Ebutton b6 = new Ebutton("6");
    Ebutton b7 = new Ebutton("7");
    Ebutton b8 = new Ebutton("8");
    Ebutton b9 = new Ebutton("9");
    Ebutton b10 = new Ebutton("10");
    Ebutton b11 = new Ebutton("11");
    Ebutton b12 = new Ebutton("12");
    Ebutton b13 = new Ebutton("13");
    Ebutton b14 = new Ebutton("14");
    Ebutton b15 = new Ebutton("15");
    Ebutton b16 = new Ebutton("16");
    Ebutton Emptybutton = new Ebutton("");

    protected boolean harvunnit = false;
    protected String index = "";
    List<Ebutton> buttonList = new ArrayList<>();

    Inlämninguppgift3() {

        this.setLayout(new BorderLayout());
        this.setLocation(1000, 50);
        this.add(p1, BorderLayout.SOUTH);
        this.add(p2, BorderLayout.NORTH);
        p1.add(z1);
        z1.addActionListener(this);
        p2.setLayout(new GridLayout(4, 4));

        buttonList = new ArrayList<>();

        buttonList.add(b1);
        b1.setText("1");
        b1.setBackground(Color.CYAN);
        b1.setPreferredSize(new Dimension(80, 60));
        b1.addActionListener(this);
        p2.add(b1);
        buttonList.add(b2);
        b2.setText("2");
        b2.setBackground(Color.CYAN);
        b2.setPreferredSize(new Dimension(80, 60));
        b2.addActionListener(this);
        p2.add(b2);
        buttonList.add(b3);
        b3.setText("3");
        b3.setBackground(Color.CYAN);
        b3.setPreferredSize(new Dimension(80, 60));
        b3.addActionListener(this);
        p2.add(b3);
        buttonList.add(b4);
        b4.setText("4");
        b4.setBackground(Color.CYAN);
        b4.setPreferredSize(new Dimension(80, 60));
        b4.addActionListener(this);
        p2.add(b4);
        buttonList.add(b5);
        b5.setText("5");
        b5.setBackground(Color.CYAN);
        b5.setPreferredSize(new Dimension(80, 60));
        b5.addActionListener(this);
        p2.add(b5);
        buttonList.add(b6);
        b6.setText("6");
        b6.setBackground(Color.CYAN);
        b6.setPreferredSize(new Dimension(80, 60));
        b6.addActionListener(this);
        p2.add(b6);
        buttonList.add(b7);
        b7.setText("7");
        b7.setBackground(Color.CYAN);
        b7.setPreferredSize(new Dimension(80, 60));
        b7.addActionListener(this);
        p2.add(b7);
        buttonList.add(b8);
        b8.setText("8");
        b8.setBackground(Color.CYAN);
        b8.setPreferredSize(new Dimension(80, 60));
        b8.addActionListener(this);
        p2.add(b8);
        buttonList.add(b9);
        b9.setText("9");
        b9.setBackground(Color.CYAN);
        b9.setPreferredSize(new Dimension(80, 60));
        b9.addActionListener(this);
        p2.add(b9);
        buttonList.add(b10);
        b10.setText("10");
        b10.setBackground(Color.CYAN);
        b10.setPreferredSize(new Dimension(80, 60));
        b10.addActionListener(this);
        p2.add(b10);
        buttonList.add(b11);
        b11.setText("11");
        b11.setBackground(Color.CYAN);
        b11.setPreferredSize(new Dimension(80, 60));
        b11.addActionListener(this);
        p2.add(b11);
        buttonList.add(b12);
        b12.setText("12");
        b12.setBackground(Color.CYAN);
        b12.setPreferredSize(new Dimension(80, 60));
        b12.addActionListener(this);
        p2.add(b12);
        buttonList.add(b13);
        b13.setText("13");
        b13.setBackground(Color.CYAN);
        b13.setPreferredSize(new Dimension(80, 60));
        b13.addActionListener(this);
        p2.add(b13);
        buttonList.add(b14);
        b14.setText("14");
        b14.setBackground(Color.CYAN);
        b14.setPreferredSize(new Dimension(80, 60));
        b14.addActionListener(this);
        p2.add(b14);
        buttonList.add(b15);
        b15.setText("15");
        b15.setBackground(Color.CYAN);
        b15.setPreferredSize(new Dimension(80, 60));
        b15.addActionListener(this);
        p2.add(b15);

        buttonList.add(b16);
        b16.setText(" ");
        b16.setBackground(Color.black);
        b16.setPreferredSize(new Dimension(80, 60));
        b16.addActionListener(this);
        Emptybutton = b16;
        p2.add(b16);

        this.add(p2);

        
       
        for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setValue(i + 1);
            harvunnit = false;
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.pack();

        }
    }

    private void swap(Ebutton b) {
       // System.out.println("sWAP1 Knapp före if " + +b.getValue() + " empty: " + Emptybutton.getValue());
        if (b.ärbredvid(Emptybutton.getValue())) {
           // System.out.println("SWAP2 Knapp " + b.getValue() + " empty: " + Emptybutton.getValue());
          
            this.Emptybutton.setText(b.getText());
            this.Emptybutton.setBackground(b.getBackground());

            b.setText("");
            b.setBackground(Color.BLACK);
            Emptybutton = b;

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        
    

        if (ae.getSource() == z1) {
        z1.setText("Nytt spel");
         
                b1.setText("1");
                b1.setBackground(Color.CYAN);
                b1.setPreferredSize(new Dimension(80, 60));
                //b1.addActionListener(this);
                //p2.add(b1);

                b2.setText("2");
                b2.setBackground(Color.CYAN);
                b2.setPreferredSize(new Dimension(80, 60));
               // b2.addActionListener(this);
                //p2.add(b2);

                b3.setText("3");
                b3.setBackground(Color.CYAN);
                b3.setPreferredSize(new Dimension(80, 60));
                //b3.addActionListener(this);
                //p2.add(b3);

                b4.setText("4");
                b4.setBackground(Color.CYAN);
                b4.setPreferredSize(new Dimension(80, 60));
               // b4.addActionListener(this);
                //p2.add(b4);

                b5.setText("5");
                b5.setBackground(Color.CYAN);
                b5.setPreferredSize(new Dimension(80, 60));
               // b5.addActionListener(this);
                //p2.add(b5);

                b6.setText("6");
                b6.setBackground(Color.CYAN);
                b6.setPreferredSize(new Dimension(80, 60));
              //  b6.addActionListener(this);
                //p2.add(b6);

                b7.setText("7");
                b7.setBackground(Color.CYAN);
                b7.setPreferredSize(new Dimension(80, 60));
               // b7.addActionListener(this);
                //p2.add(b7);

                b8.setText("8");
                b8.setBackground(Color.CYAN);
                b8.setPreferredSize(new Dimension(80, 60));
               // b8.addActionListener(this);
                //p2.add(b8);

                b9.setText("9");
                b9.setBackground(Color.CYAN);
                b9.setPreferredSize(new Dimension(80, 60));
               // b9.addActionListener(this);
                //p2.add(b9);

                b10.setText("10");
                b10.setBackground(Color.CYAN);
                b10.setPreferredSize(new Dimension(80, 60));
               // b10.addActionListener(this);
                //p2.add(b10);

                b11.setText("11");
                b11.setBackground(Color.CYAN);
                b11.setPreferredSize(new Dimension(80, 60));
                //b11.addActionListener(this);
                //p2.add(b11);

                b12.setText("12");
                b12.setBackground(Color.CYAN);
                b12.setPreferredSize(new Dimension(80, 60));
               // b12.addActionListener(this);
                //p2.add(b12);

                b13.setText("13");
                b13.setBackground(Color.CYAN);
                b13.setPreferredSize(new Dimension(80, 60));
               // b13.addActionListener(this);
                //p2.add(b13);

                b14.setText("14");
                b14.setBackground(Color.CYAN);
                b14.setPreferredSize(new Dimension(80, 60));
               // b14.addActionListener(this);
                //p2.add(b14);

                b15.setText("15");
                b15.setBackground(Color.CYAN);
                b15.setPreferredSize(new Dimension(80, 60));
               // b15.addActionListener(this);
                //p2.add(b15);
                Emptybutton = b16;
               // buttonList.add(b16);
                b16.setText(" ");
                b16.setBackground(Color.BLACK);
                b16.setPreferredSize(new Dimension(80, 60));
               // b16.addActionListener(this);
         
          Collections.shuffle(buttonList);//  använder metoden shuffle för att knappen vara i slumpmässig ordning när vi klicka på knappen z1
          for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setValue(i + 1);
        }

    
          
          for(Ebutton b: buttonList){
            b.setPreferredSize(new Dimension(80, 60));
           
          p2.add(b);
            b.addActionListener(this);
        }    
       //Emptybutton = b16;
              //  p2.add(b16);
          
                this.add(p2);

                harvunnit = false;
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            } else if (ae.getSource().equals(b1)) {
                swap(b1);

            } else if (ae.getSource().equals(b2)) {
                swap(b2);

            } else if (ae.getSource().equals(b3)) {
                swap(b3);
      } else if (ae.getSource().equals(b4)) {
                swap(b4);
          } else if (ae.getSource().equals(b5)) {

                swap(b5);

            } else if (ae.getSource().equals(b6)) {
                swap(b6);

            } else if (ae.getSource().equals(b7)) {
                swap(b7);

            } else if (ae.getSource().equals(b8)) {
                swap(b8);

            } else if (ae.getSource().equals(b9)) {
                swap(b9);
  } else if (ae.getSource().equals(b10)) {
                swap(b10);
         }
             else if (ae.getSource().equals(b11)) {
                swap(b11);

            } else if (ae.getSource().equals(b12)) {
                swap(b12);

            } else if (ae.getSource().equals(b13)) {
                swap(b13);

            } else if (ae.getSource().equals(b14)) {
                swap(b14);

            } else if (ae.getSource().equals(b15)) {

                swap(b15);


            } else if (ae.getSource().equals(b16)) {
               
                swap(b16);

            }
           
            for (Ebutton b : buttonList) {
                index += b.getText();
            }
            if (index.trim().equals("123456789101112131415")) {
                harvunnit = true;
            }
            // if (Emptybutton == b16)
            if (harvunnit) {
              if (Emptybutton == b16) {
                    z1.setText("Grattis, du har vunnit");
                     
                    harvunnit = false;
                   

                }
            }
        
    }
    

    public static void main(String[] args) {

        Inlämninguppgift3 o = new Inlämninguppgift3();

    }
}

// jag diskuterade   med Anna och tittade  litte på hennes kod men jag har jobbat själv på mitt sätt jag vill bara informera er  