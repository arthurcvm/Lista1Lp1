package lista1lp1;

import java.util.*;

public class Q14 {
    public static void main (String[] args){
        Random rand = new Random();
        int number;
        Scanner le = new Scanner(System.in);
        int vez;
        int vezes[] = new int [6];
        
        do{
            System.out.print("Digite as vezes à serem jogadas, ou 0 para encerrar: ");
            vez = le.nextInt();
            
            for(int i =0;i < vez; i++){
                number = rand.nextInt(6)+1;
                if(number == 1){
                    vezes[0]++;
                }
                else if(number == 2){
                    vezes[1]++;
                }
                else if(number == 3){
                    vezes[2]++;
                }
                else if(number == 4){
                    vezes[3]++;
                }
                else if(number == 5){
                    vezes[4]++;
                }
                else if(number == 6){
                    vezes[5]++;
                }                
            }
            if(vez != 0){
                System.out.printf("Lado 1: %.2f",((double)vezes[0]/(double)vez)*100); System.out.println("%");
                System.out.printf("Lado 2: %.2f",((double)vezes[1]/(double)vez)*100); System.out.println("%");
                System.out.printf("Lado 3: %.2f",((double)vezes[2]/(double)vez)*100); System.out.println("%");
                System.out.printf("Lado 4: %.2f",((double)vezes[3]/(double)vez)*100); System.out.println("%");
                System.out.printf("Lado 5: %.2f",((double)vezes[4]/(double)vez)*100); System.out.println("%");
                System.out.printf("Lado 6: %.2f",((double)vezes[5]/(double)vez)*100); System.out.println("%");
            }            
            for(int i =0;i < 6; i++){
                vezes[i] = 0;                
            }            
        }while(vez != 0);        
    }    
}
