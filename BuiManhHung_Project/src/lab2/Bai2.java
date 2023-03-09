package lab2;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		
		int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen:");
        n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
		
	}

}
