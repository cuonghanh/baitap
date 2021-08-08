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
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bạn cần nhập bao nhiêu số");

        int n = sc.nextInt();
        int so1 = 0, so2 = 1;
        System.out.println("chuỗi Fib với " + n + " số là");
        for (int i = 1; i <= n; i++) {
            int sotieptheo = so1 + so2;
            so1 = so2;
            so2 = sotieptheo;
            // đổi chỗ cho nhau dể tiếp tục vòng lặp
            System.out.println(so1 + " ");

        }

    }
}
