package lista1lp1;

import java.util.Scanner;
public class Q11 {
    public static void main (String[] args){
        Scanner le = new Scanner(System.in);
        int val = 0;
        
        System.out.print("Digite o valor: ");
        val = le.nextInt();
        
        for(int i = 0; i <= val; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
    
}
