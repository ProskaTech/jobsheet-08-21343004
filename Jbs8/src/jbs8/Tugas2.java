/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbs8;

/**
 *
 * @Created by Azzahra Putri
 */
import javax.swing.JOptionPane;
public class Tugas2 {
     public static void main(String[] args) {
        int[] a = new int[10];
        String[] n = new String[10];
        
        int max = 0;
        
        for (int i = 0; i < a.length; i++){
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ": ");
            
            a[i] = Integer.parseInt(n[i]);
            
            if (a[i] > max){
                max = a[i];
            }
        }
        
        String hasil = "Bilangan terbesar adalah " + max;
        JOptionPane.showMessageDialog(null, hasil);
    }
}
