package soal_3_Berhitung;

import java.util.*;


public class soal_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int jmlh = 0;
        int x0=s.nextInt();
        String a = s.next();
        int x1 = s.nextInt();
        switch(a){
            case "+":
                jmlh = x0 + x1;
                break;
            
            case "-":
                jmlh = x0 - x1;
                break;
                
            case "/":
                jmlh = x0 / x1;
                break;
            
            case "*":
                jmlh = x0 * x1;
                break;
            
            default:
                System.out.println("Tidak ada operasi aritmatika tersebut");
                break;
        } 
//        System.out.printf("%d %s %d\n",x0,a,x1);
        System.out.println(jmlh);
	}
}

