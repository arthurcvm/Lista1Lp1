package lista1lp1;

import java.util.*;

public class Q13 {
    public static void main (String[] args){
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        Scanner le = new Scanner(System.in);
        int num;
        
        System.out.print("Advinhe um número: ");
        num = le.nextInt();
        
        while(num != number){
            if(num > number){
                System.out.println("Muito alto, tente novamente: ");
                num = le.nextInt();
            }
            else if(num < number){
                System.out.println("Muito baixo, tente novamente: ");
                num = le.nextInt();
            }
        }
        System.out.println("Parabéns, você advinhou");
        
    }
    
}
