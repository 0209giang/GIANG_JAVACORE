package com.vti.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println(x !=y);

        x = 4;
        y = 10;
        System.out.println(x<= y);
        tonghaiso();
        hieu2so(2,3);
        int c = tichhaiso(3,4);
        System.out.println("c :"+ c);

        int d = tichhaiso(4);
        System.out.println("d :"+ d);

        // OVERLOAD
        float a = tonghaiso(3f,44f);
        System.out.println("tổng hai số kiểu float :"+ a);
        }
        //tong hai so
        public static void tonghaiso() {
            System.out.println("tong hai so  2 va 3 la : "+(2+3));
        }

 public static int hieu2so(int x,int y){
        int hieu;
        return x;
        // chỉ trả về được 1 giá trị



 }
 // hàm có tham số truyền vào
    public static int tichhaiso(int a, int b){

        return a*b;
    }
    public static int tichhaiso(int c){
        return  c*6;
    }
    //overload :cùng tên nhưng khác tham số truyền vào
    public static int tonghaiso(int a, int b){
        return a+b;
    }
    public static float tonghaiso (float a, float b){
        return  a+b ;

    }


}
