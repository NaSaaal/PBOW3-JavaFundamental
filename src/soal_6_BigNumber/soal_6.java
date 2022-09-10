package soal_6_BigNumber;

import java.util.*;
import java.math.*;

public class soal_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
    }
}