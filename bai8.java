/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.util.ArrayList;

/**
 *
 * @author CuongPD
 */
public class bai8 {
    public static void main(String[] args) {
        ArrayList<Integer> mang = new ArrayList<>();
        int num =999;
        while (num!=0) {
             int d = num%2;
             mang.add(d);
             num = num/2;
        }
        
        System.out.println(""+mang);
    }
}
