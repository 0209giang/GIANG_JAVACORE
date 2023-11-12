package com.vti.Lesson3;

import java.util.Scanner;

public class Main {
    // II: Hằng số :
    // Tên hằng số viết hoa tất car các chữ cái : VD : MALE , GO_HOME
    public static final int THANG_CUA_NAM = 12 ;
    public static final String MEMBER =" Bùi Bình Giang ";
    public static void main(String[] args) {
        // I: chuỗi và hằng số
        String str = " Xin chào các bạn ";
        System.out.println(str);

        // Ghép chuỗi
        String str2 = "Các bạn có khoẻ không " +"Mình tên là Giang";
        System.out.println(str2);

        // Hằng số ;
        System.out.println(" Thang cua nam" + THANG_CUA_NAM);
        System.out.println(" ten toi la "+ MEMBER);

        // III : đọc dưc liệu từ bàn phím
        Scanner scan = new Scanner(System.in);
                // Cấu trúc tiêu chuẩn khai báo Scanner khi muốn nhập từ bàn phím
        System.out.println(" Nhập số bất kì ");
        scan.nextInt();// Tên biến là scan


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nhập tên anh chị : ");
        scan2.nextLine();

        // III: if

        Scanner scan3 = new Scanner(System.in);
        System.out.println(" Nhập giá trị X là :" );
        int x = scan3.nextInt();
       ;
                if ( x < 10){
            System.out.println(" X nhỏ hơn 10 ");
        }
                else {
            System.out.println(" X lớp hơn 10");
        }
        scan.close();
        scan2.close();
        scan3.close();



    }
}
