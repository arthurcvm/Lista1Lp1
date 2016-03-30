package lista1lp1;

import java.util.Scanner;

public class Q15 {
    public static void main (String[] args){
        Scanner le = new Scanner(System.in);
        int opc,total = 0, maior=0;
        int joga[] = new int [23];
        
        System.out.println("Enquete: Quem foi o melhor jogador?");
        
        do{            
            System.out.print("Número do jogador (0=fim): ");
            opc = le.nextInt();   
            
            if(opc != 0){
                total++;
                joga[opc-1]++;
                if(maior < joga[opc-1]){
                    maior = opc;
                }
            }
            if(opc > 23 || opc < 0){
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
            }
        }while(opc != 0);
        
        System.out.println("Resultado da votação:");
        System.out.println("Foram computados "+total+" votos");
        System.out.println("Jogador\tVotos\t\t%");
        for(int i=0;i<23;i++){
            if(joga[i] != 0){
                System.out.printf("%d\t%d\t\t%.2f%%\n",i+1,joga[i],(((double)joga[i]/(double)total)*100));
            }            
        }
        System.out.printf("O melhor jogador foi o número %d, com %d votos, correspondendo a %.2f%% "
                        + "do total de votos\n",maior,joga[maior-1],(((double)joga[maior-1]/(double)total)*100));
        
                       
        
    }
    
}
