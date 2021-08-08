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
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập giá trị thứ 1 của đầu vào");
        int s1 = sc.nextInt();
        String s11 = String.format("%04d", s1);
        System.out.println("mời bạn nhập giá trị thứ 2 của đầu vào");
        int s2 = sc.nextInt();
        String s22 = String.format("%04d", s2);
        System.out.println("mời bạn nhập giá trị thứ 3 của đầu vào");
        int s3 = sc.nextInt();
        String s33 = String.format("%04d", s3);
        System.out.println("mời bạn nhập giá trị thứ 4 của đầu vào");
        int s4 = sc.nextInt();
        String s44 = String.format("%04d", s4);
        System.out.println("giá trị đầu vào là " + s11 + "," + s22 + "," + s33 + "," + s44);
        String ss1, ss2, ss3, ss4;
        if (s1 % 5 == 0) {
            ss1 = "1";
        } else {
            ss1 = "0";
        }
        if (s2 % 5 == 0) {
            ss2 = "1";
        } else {
            ss2 = "0";
        }
        if (s3 % 5 == 0) {
            ss3 = "1";
        } else {
            ss3 = "0";
        }
        if (s4 % 5 == 0) {
            ss4 = "1";
        } else {
            ss4 = "0";
        }
        System.out.println("giá trị đầu ra là " + ss1 + ss2 + ss3 + ss4);
    }
}
