package com.mycompany.rv;
import javax.swing.*;
public class rev1 {
    public static void main(String args[]) {
        String [] stgArr = new String [8];
        for (int i = 0; i < 8 ; i++)
        {
            String wrd = JOptionPane.showInputDialog ("Enter a word: ");
            stgArr [i] = wrd;
        }
        System.out.println();
        for (int j = 0 ; j < 8 ; j++)
        {
            System.out.println(stgArr [j]);
        }
    }
}