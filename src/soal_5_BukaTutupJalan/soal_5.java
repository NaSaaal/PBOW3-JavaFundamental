package soal_5_BukaTutupJalan;
import java.util.Scanner;

public class soal_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String car1 = s.next();
		String car2 = s.next();
		String car3 = s.next();
		String car4 = s.next();
		s.close();
		
		String car5 = (car1 + "" + car2 + "" + car3 + "" + car4);
		double num = ((Double.parseDouble(car5)) - 999999) % 5;
		
    if(num == 0) {
    	System.out.println("Jalan");
    }else {
    	System.out.println("Berhenti");
    }
}
}
