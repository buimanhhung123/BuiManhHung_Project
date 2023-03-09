package lab2;
import java.text.DecimalFormat;

import java.util.Scanner;
 
public class Bai1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int s1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int s2 = scanner.nextInt();
         
        
        int tong = s1 + s2;
        System.out.println(s1 + " + " + s2 + " = " + tong);
         
        int hieu = s1 - s2;
        System.out.println(s1 + " - " + s2 + " = " + hieu);
         
        int tich = s1 * s2;
        System.out.println(s1 + " * " + s2 + " = " + tich);
         
        float thuong = (float) s1 / s2;
        System.out.println(s1 + " / " + s2 + " = " + 
                decimalFormat.format(thuong));  
         
        int phanDu = s1 % s2;
        System.out.println(s1 + " % " + s2 + " = " + phanDu);
         
        
        System.out.println("Kết quả so sánh bằng 2 số " + s1 + " và " + 
                s2 + " là " + (s1 == s2));
        System.out.println("Kết quả so sánh không bằng 2 số " + s1 + " và " + 
                s2 + " là " + (s1 != s2));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + s1 + " và " + 
                s2 + " là " + (s1 > s2));
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + s1 + " và " + 
                s2 + " là " + (s1 >= s2));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + s1 + " và " + 
                s2 + " là " + (s1 < s2));
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + s1 + " và " + 
                s2 + " là " + (s1 <= s2));
    }
 
}