package lista1lp1;

import java.util.Scanner;

public class Q8 {
    public static void main (String[] args){
        int soma = 0;
        Scanner le = new Scanner(System.in);
        
        for(int i = 0 ; i < 50 ; i++){
            System.out.print("Digite o valor: ");
            soma += le.nextInt();
        }
        
        soma /= 50;
        
        System.out.println("A média dos valores é: " + soma);
    }
    
}
