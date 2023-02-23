package metodlar;

import java.util.Scanner;

public class DesenMetod {
    
    static void desen(int n) {
        if(n<=0) {
            System.out.println(n + " ");
            n += 5;
            System.out.println(n + " ");
            return;
        }
        
        System.out.println(n + " ");
        desen(n-5);
        System.out.println(n + " ");
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n = scanner.nextInt();
        
        desen(n);
    }
}

