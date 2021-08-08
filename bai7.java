/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CuongPD
 */
public class bai7 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> mang = new ArrayList<>();

        int sorandom = random.nextInt(10000) + 1000;
        System.out.println("" + sorandom);
        int vt1 = sorandom / 1000;
        int vt2 = (sorandom % 1000) / 100;
        int vt3 = (sorandom % 100) / 10;
        int vt4 = sorandom % 10;
        int[] arr1 = {vt1, vt2, vt3, vt4};
        // System.out.println("" + vt1 +"  "+ vt2+"  "+  vt3+"  "+  vt4);

        int cow = 0;
        int bull = 0;
        int vitri = 0;
      

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("mời bạn nhập vào số mà cần đoán");
            int sonhap = sc.nextInt();
            int vtd1 = sonhap / 1000;
            int vtd2 = (sonhap % 1000) / 100;
            int vtd3 = (sonhap % 100) / 10;
            int vtd4 = sonhap % 10;
            for (int i = 0; i < 4; i++) {

                int[] arr2 = {vtd1, vtd2, vtd3, vtd4};
                if (arr1[i] == arr2[i]) {
                    cow++;
                    mang.add(vitri = i);

                } else {
                    bull++;

                }

            }
            System.out.println("bạn đã đoán đúng" + cow + "vị tri" + "ở " + mang);
            System.out.println("bạn đã đoán sai" + bull + "vi tri");

            if (cow == 4) {
                System.out.println("bạn đã đoán đúng");

                break;
            }
        }
    }
}
