/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.util.Scanner;

/**
 *
 * @author CuongPD
 */
public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập giá trị ");
        int s1 = sc.nextInt();
        if (s1 % 2 == 0) {
            System.out.println("đây là số chẵn");
        } else {
            System.out.println("đây là số le");
        }
    }
}
