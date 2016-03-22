package lista1lp1;

import java.util.Scanner;

public class Q5 {
    
    public static void main (String[] args){
        Scanner le = new Scanner(System.in);
        double valor;
        byte reajuste;

        System.out.print("Valor do produto: ");
        valor = le.nextDouble();
        
        do{
            System.out.println("Reajuste de:\n"
                                + "1 - 15%\n"
                                + "3 - 20%\n"
                                + "4 - 35%\n"
                                + "8 - 40%\n"
                                + "0 - SAIR");
            reajuste = le.nextByte();

            switch(reajuste){
                case 1: 
                    valor +=(valor*0.15);
                    break;
                case 3:
                    valor +=(valor*0.20);
                    break;
                case 4:
                    valor +=(valor*0.35);
                    break;
                case 8:
                    valor +=(valor*0.40);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente:");
            }
        }while(reajuste != 0);
        
        System.out.println("O valor reajustado é: " + valor);
    }
    
}
