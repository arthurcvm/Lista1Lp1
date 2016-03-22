package lista1lp1;

import java.util.Scanner;

public class Q6 {
    public static void main (String[] args){
        Scanner le = new Scanner(System.in);
        double sal, desc;
        
        System.out.print("Valor do salário: ");
        sal = le.nextDouble();
        
        if(sal <= 420){
            desc = (sal*0.08);
            sal -= desc;
        }
        else if(sal > 420 && sal <= 1350){
            desc = (sal*0.09);
            sal -= desc;
        }
        else{
            desc = (sal*0.10);
            sal -= desc;
        }
        
        System.out.println("Valor com desconto do INSS: " + sal
                            + "\nO valor do desconto é: " + desc);
    }
    
}
