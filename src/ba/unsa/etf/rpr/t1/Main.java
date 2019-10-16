package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n = ulaz.nextInt();
        sumaCifara(n);
    }
    public static void sumaCifara(int broj) {
        int suma;
        int n = 0;
        for( int i = 1; i < broj + 1; i++) {
            n = i;
            suma = 0;
            while( n != 0) {
                suma = suma + (n % 10);
                n = ( n - (n%10) ) / 10;
            }
            if( i % suma == 0) System.out.println(i);
        }
    }
}
