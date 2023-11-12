package com.vti.Lesson3.Baitap;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số :");
        int x = scan.nextInt();
        if (x<0){
            System.out.println("X là số âm ");
        }
        else if (x == 0){
            System.out.println("X là số 0");
        }
        else {
            System.out.println(" X là số dương");
    }
}}
