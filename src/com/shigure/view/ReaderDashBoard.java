/*
 * Created by JFormDesigner on Sun Dec 03 20:38:20 CST 2017
 */

package com.shigure.view;

import java.awt.event.*;
import com.shigure.model.User;

import java.awt.*;
import javax.swing.*;

/**
 * @author siyuan zheng
 */
public class ReaderDashBoard extends JFrame {
    public static int uid;

    //static User user = new User();
    public ReaderDashBoard() {
        initComponents();
    }

    public void getUserId(User id){
        ReaderDashBoard.uid = id.getId();
    }

    private void button1ActionPerformed(ActionEvent e) {
        new ReaderBookLookUp().setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        new ReaderBorrowManage().setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        new ReaderBookRecommend().setVisible(true);
    }

    private void button4ActionPerformed(ActionEvent e) {
        new ReaderBookRecommendManage().setVisible(true);
    }

    private void button5ActionPerformed(ActionEvent e) {
        new ReaderSelfimformationManage().setVisible(true);
    }

    private void button6ActionPerformed(ActionEvent e) {
        new About().setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - siyuan zheng
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(105, 95), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("text");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(405, 100), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("text");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(110, 345), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("text");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4);
        button4.setBounds(new Rectangle(new Point(420, 335), button4.getPreferredSize()));

        //---- button5 ----
        button5.setText("text");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5);
        button5.setBounds(new Rectangle(new Point(115, 530), button5.getPreferredSize()));

        //---- button6 ----
        button6.setText("text");
        button6.addActionListener(e -> button6ActionPerformed(e));
        contentPane.add(button6);
        button6.setBounds(new Rectangle(new Point(430, 545), button6.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - siyuan zheng
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
