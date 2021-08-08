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
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào chuỗi");
        String chuoi = sc.nextLine();
        for (int i = 0; i <= chuoi.length(); i++) {

            if (chuoi.charAt(i) == chuoi.charAt(chuoi.length() - i - 1)) {
                // kiểm tra giá trị tại vị trí i và giá tri tại vị trí cuối cùng -i
                // phải -1 vì đang lấy giá trị tại vị trí i chứ không phải lấy vị trí  ở i
                System.out.println("day la day");
                break;
            } else {
                System.out.println("day khong phải");
                break;
            }

        }
    }
}
