package Lesson4.lythuyet.lythuyet.mang;

public class Mang {
    public static void main(String[] args) {
        // Cấu trúc mảng ;
        // Kiểu dũ liệu mảng [] Tên mảng= new kiểu dữ liệu mảng [số phần tử}
        int [] Mangsonguyen = {1,2,3,4,5,6,7};
        int [] mang2 = new int[7];// 7 phần tử sẽ có giá trụ = 0
        mang2 [0] = 1;
        mang2 [1] = 11;
        mang2 [2] = 111;
        mang2 [3] = 1111;
        mang2 [4] = 11111;
        mang2 [5] = 111111;
        mang2 [6] = 1111111;// không khuyến khích
        for (int vitri = 0 ; vitri < mang2.length ; vitri++){
            System.out.println("Phần tử số " +vitri+" của mang2 là : "+ mang2[vitri]);
        }

        // Cấu trúc for each
        for(int item : mang2 ){
            System.out.println(item);
        }
    }
}
