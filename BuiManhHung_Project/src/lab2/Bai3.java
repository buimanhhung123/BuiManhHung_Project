package lab2;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		
		String name;
        int year;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên của bạn: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh của bạn: ");
        year = scanner.nextInt();
		int t = 2023 - year;
        if (t < 16) {
            System.out.println("Bạn "+name+ " ở tuổi vị thành niên");
        } else if (t>=18) {
            System.out.println("Bạn "+name+" đã già");
        } else {
            System.out.println("Bạn "+name+" ở độ tuổi trưởng thành");
        }
        
		
	}

}
