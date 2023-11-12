package Lesson4.baitap;

import Lesson4.lythuyet.hinhhoc.HinhTamGiac;
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
                int r;
                do
                {r = a.nextInt();
                    if(r<0){
                        System.out.println("Xin nhập lại");}
                }
                while (r<0);
                float dientichHT = Hinhtron.dienTich(r);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHT);
                break;

            case 2:Scanner b = new Scanner(System.in);
                System.out.println("Diện tích hình Vuông cần tính của bạn có cạnh là bao nhiêu ");
                int canh;
                do
                {canh = b.nextInt();
                if(canh<0){
                    System.out.println("Xin nhập lại");}
                }
                while (canh<0);
                int dientichHV = Hinhvuong.dienTich(canh);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHV);
                break;

            case 3:Scanner c = new Scanner(System.in);
                System.out.println("Diện tích hình tam giác cần tính của bạn có đáy và chiều cao là bao nhiêu ");
                int day;
                int cao ;
                do
                {day = c.nextInt();
                    cao = c.nextInt();
                if((day<0)||(cao<0)){
                    System.out.println("Xin nhập lại");}
                }
                while ((day<0)||(cao<0));
                float dientichHTG = HinhTamGiac.Dientich(day,cao);
                System.out.println(" Vậy diện tích là :");
                System.out.println(dientichHTG);
                break;



        }}}




