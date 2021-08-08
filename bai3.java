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
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mời bạn nhập vào số cuối cùng trong dãy");
        int n = sc.nextInt();
        System.out.println("các số nguyên tố nhỏ hơn " + n +" là");
        for (int i = 0; i < n; i++) {
            if (check(i) == true) {
                System.out.print(i + " ");
            }
        }

    }
    //hàm kiểm tra số nguyên tố 
    protected static Boolean check(int m) {
        for (int j = 2; j <= m / 2; j++) {
            if (m % j == 0) {
                return false;
            }

        }

        return true;
    }
}
