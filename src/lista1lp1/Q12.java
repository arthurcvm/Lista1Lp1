
package lista1lp1;

import java.io.IOException;
import java.util.Scanner;

public class Q12 {
    static int tam = 3;
    public static void main (String[] args) throws IOException{
        char sexo[] = new char [tam];
        double altura[] = new double [tam];
        double mxAlt = 0, mnAlt = 99, mdSF = 0, mdSM = 0;
        int maior = 0, menor = 0, qF = 0, qM = 0;
        
        Scanner le = new Scanner(System.in);
        
        for(int i = 0; i < tam; i++){
            System.out.print("Altura: ");
            altura[i] = le.nextDouble();
            
            System.out.print("Sexo (F/M): ");
            sexo[i] = le.next().charAt(0);
        }
        
        for(int i = 0; i<tam;i++){
            if(altura[i] > mxAlt){
                mxAlt = altura[i];
                maior = i;
            }
            if(altura[i] < mnAlt){
                mnAlt = altura[i];
                menor = i;
            }
        }
        for(int i = 0; i < tam; i++){
            if(sexo[i] == 'F'){
                mdSF += altura[i];
                qF++;
            }
            if(sexo[i] == 'M'){
                mdSM += altura[i];
                qM++;
            }
        }
        mdSF /= qF;
        mdSM /= qM;
        
        System.out.println("A maior altura é: " + mxAlt
                           + "\nCom o sexo: " + sexo[maior]);
        System.out.println("A menor altura é: " + mnAlt
                           + "\nCom o sexo: " + sexo[menor]);
        System.out.println("A média de altura entre o sexo feminino é: " + mdSF
                           + "\nE entre o sexo masculino: " + mdSM);
        System.out.println("O número total de indivíduos do sexo feminino é: " + qF
                           + "\nMasculino: " + qM);
    }
}
