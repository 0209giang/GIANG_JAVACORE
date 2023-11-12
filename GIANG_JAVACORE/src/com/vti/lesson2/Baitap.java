package com.vti.lesson2;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        float r = tinhSHinhTron(4);
        System.out.println(" dien tich hinh tron : " + r);
        Scanner input = new Scanner(System.in);
        System.out.print("chiều dài hình chữ nhất là: ");
        int a = input.nextInt();
        System.out.print("chiều rộng hình chữ nhất là: ");
        int b = input.nextInt();


        int s = dienTichHinhChuNhat(a, b);
        System.out.println(" diện tích hình chữ nhật là có cạnh " + a + "và chiều rộng : " + b + " là : " + s);


    }

    public static float tinhSHinhTron(float r) {
        return r * r * 3.14F;
    }

    // tính dien tich hinh chu nhat
    public static int dienTichHinhChuNhat(int a, int b) {
        return a * b;
    }

}

