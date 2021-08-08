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
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập giá trị");
        int s1 = sc.nextInt();
        //check(s1);
        System.out.println("kết quả là"+ check(s1));
    }
     static long check(int n){
       if(n>0){
           // đệ quy 
           return( n *check(n-1));
       }else{
           return 1;
       }
   }
}
