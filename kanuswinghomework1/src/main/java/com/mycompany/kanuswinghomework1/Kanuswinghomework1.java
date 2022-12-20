/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kanuswinghomework1;

/**
 *
 * @author KANU
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
public class Kanuswinghomework1 {

    public static void main(String[] args) {
 JFrame f=new JFrame("home work in swing");
 f.setSize(1000, 800);
 f.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lbl3=new JLabel("Username : ");
        JLabel lbl4=new JLabel("Password : ");
        JLabel lbl5=new JLabel("comment section : ");
        lbl3.setBounds(20,20,100,20);
         lbl4.setBounds(350,20,100,20);
          lbl5.setBounds(350,100,600,40);
 JPanel p1=new JPanel();
        JPanel p2=new JPanel();
JPanel p3=new JPanel();
JLabel lbl7=new JLabel("ETHIOPIA");
        p1.setPreferredSize(new Dimension(1000,400));
        p2.setPreferredSize(new Dimension(1000,400));
        //p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.setBackground(new Color(190, 243, 214));
        p2.setBackground(new Color(190, 220, 169));
 ImageIcon icon=new ImageIcon("ethiopia.jfif");
  f.setIconImage(icon.getImage());
  JLabel lbl6=new JLabel(icon);
 JTextField txt=new JTextField(10);
        JPasswordField pf=new JPasswordField(10);
        JTextArea txta=new JTextArea(5,10);
        JButton btn=new JButton("log in");
        JButton btn1=new JButton("submit");
  JRadioButton r1=new JRadioButton("A) Male");
        JRadioButton r2=new JRadioButton("B) Female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2);
        txt.setBounds(100,20,200,20);
        pf.setBounds(450,20,200,20);
        txta.setBounds(470,100,200,100);
        btn.setBounds(700,20,100,20);
         btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnresponse="you have signed up sussesfully";
                String btnresponse1="error try again";
                if(txt.getText().isEmpty() || pf.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(null,btnresponse1);
                }
                else
                {
                   JFrame fr=new JFrame("VIST ETHIOPIA ");
                   fr.setSize(1000, 800);
                   JPanel p=new JPanel();
                    p.setPreferredSize(new Dimension(1000,400));
                    p.setBackground(new Color(232, 243, 214));
                    JLabel lb2=new JLabel(); 
                    JLabel lb3=new JLabel();
                    JTextArea txa=new JTextArea();
                   JLabel lb1=new JLabel("choose the place you like");
                    String pla[]={"The rock churches of Lalibela reminded me strongly of the stone city of Petra in Jordan (which I have unfortunately not yet visited myself). The buildings in Petra were carved horizontally into the rock, while in Lalibela the churches were created from top to bottom. And that almost 1000 years ago!\n" +
"\n" +
"Visiting the rock churches feels like walking through a time portal. Time really seems to have stood still here. Take time to see the churches from the inside (many of them are very similar).","sfdhoigjf"};
                   String country[]={"lalibela","gonder","axum","jegol","sofemer"};
                     fr.setIconImage(icon.getImage());
                     p.setLayout(new FlowLayout());
        JComboBox cb=new JComboBox(country);
         cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb.getSelectedIndex()==0){
                    ImageIcon icon1=new ImageIcon("lalibela.jfif");


icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb2.setIcon(icon1);
                    JFileChooser fm=new JFileChooser();
                    //lb3.
                } else if(cb.getSelectedIndex()==1) {
                    ImageIcon icon1=new ImageIcon("gonder.jfif");
                    icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb2.setIcon(icon1);
                }
                else if (cb.getSelectedIndex()==2){
                    ImageIcon icon1=new ImageIcon("axumtsiyon.jpg");
                    icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb2.setIcon(icon1);}
                else if(cb.getSelectedIndex()==3){
                        ImageIcon icon1=new ImageIcon("jegol.jfif");
                    icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb2.setIcon(icon1);     }
                else
                {ImageIcon icon1=new ImageIcon("sofmer.jfif");
                    icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb2.setIcon(icon1);}  
                }
            
        });
         cb.setPreferredSize(new Dimension(80,30));
            ImageIcon icon1=new ImageIcon("ethiopianflag.jpg");
                    icon1.setImage(icon1.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH));
                    lb3.setIcon(icon1);
         p.add(lb1);
        p.add(cb);
          p.add(lb2);
       //   p.add(lb3);
        fr.add(p);
        fr.add(lb3);
                    fr.setLayout(new FlowLayout());
                     fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

                }

            }
        });
           btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String commentresponse="thank you for your comment";
                if (txta.getText().isEmpty()) {
                }else{
                    JOptionPane.showMessageDialog(null,commentresponse);
                }

            }
        });

p3.add(lbl7);
     p2.add(lbl3);
        p2.add(txt);
        
p2.add(lbl4);
        p2.add(pf);
        p2.add(btn);
        p2.add(txta);
      p2.add(lbl5);
      p2.add(btn1);
            f.add(p2);
            p3.add(lbl6);
            f.add(p3);
         f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
