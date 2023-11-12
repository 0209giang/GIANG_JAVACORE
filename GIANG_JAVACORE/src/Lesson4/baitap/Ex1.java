package Lesson4.baitap;

import Lesson4.lythuyet.hinhhoc.HinhChuNhat;
import Lesson4.lythuyet.hinhhoc.Hinhtron;
import Lesson4.lythuyet.hinhhoc.Hinhvuong;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(" TÍNH DIỆN TÍCH HÌNH HỌC \n" +
                "Mời nhập hình muốn tính \n"+
                "1 = Hình Tròn\n"+
                "2 = Hình chữ nhật\n"+
                "3 = Hình vuông\n");



        Scanner hinh = new Scanner(System.in);

        System.out.println(" Mời nhập lựa chọn ");
        int x ;
        do {
            x = hinh.nextInt();
            if((x!=1)&&(x!=2)&&(x!=3)){

            System.out.println("Không thể nhập số khác 1 ;2 hoặc 3");
            System.out.println("Xin mời nhập lại");}
        }
        while ((x!=1)&&(x!=2)&&(x!=3));



        switch (x){
            case 1:Scanner a = new Scanner(System.in);
                System.out.println("Diện tích hình tròn cần tính của bạn có bán kính là bao nhiêu ");
                float r = a.nextFloat();
                float dientichHT = Hinhtron.dienTich(r);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHT);
                break;
            case 2:Scanner b = new Scanner(System.in);
                System.out.println("Diện tích hình vuông cần tính của bạn có cạnh là bao nhiêu ");
                int canh = b.nextInt();
                int dientichHV = Hinhvuong.dienTich(canh);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHV);
                break;
            case 3:Scanner c = new Scanner(System.in);
                System.out.println("Diện tích hình chữ nhật cần tính của bạn có chiều dài và chiều rộng là bao nhiêu ");
                int chieudai = c.nextInt();
                int chieurong = c.nextInt();
                int dientichHCN = HinhChuNhat.Dientich(chieudai,chieurong);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHCN);
                break;




        }}}




