/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import implementation_algorithms.SearchingAlgorithms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Milos Dragovic
 */
public class SearchingListener implements ActionListener {

    private JTextField jTextA;
    private JTextField jTextD;
    private JTextField jTextC;

    public SearchingListener(JTextField jTextA, JTextField jTextD, JTextField jTextC) {
        this.jTextA = jTextA;
        this.jTextD = jTextD;
        this.jTextC = jTextC;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Event has just happened");
        int[] a = convertStringToArray(jTextA.getText().trim());
        int d = Integer.getInteger(jTextD.getText().trim());
        boolean r = new SearchingAlgorithms().LinearSearch(a, d);
        jTextC.setText(r + "");

    }

    private int[] convertStringToArray(String string) {
        String[] arrayStr = string.trim().replace(",", " ").split(" ");
        int[] arrayInt = new int[5];
//        int[] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.valueOf(arrayStr[i].trim());
        }
        return arrayInt;
    }
}
