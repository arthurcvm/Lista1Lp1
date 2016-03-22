package lista1lp1;

import java.util.Scanner;

public class Q7 {
    public static void main (String[] args){
        Scanner le = new Scanner (System.in);
        double n1,n2,n3,nt;
        char con = 0;
        
        System.out.print("Digite a primeira nota: ");
        n1 = le.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        n2 = le.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        n3 = le.nextDouble();
        
        nt = ((n1+n2+n3)/3);
        
        if(nt >= 9){
            con = 'A';
        }
        else if(nt >= 7.5){
            con = 'B';
        }
        else if(nt >= 6){
            con = 'C';
        }
        else if(nt >= 4){
            con = 'D';
        }
        else if(nt < 4){
            con = 'E';
        }
        
        if(con != 'D' || con != 'E'){
            System.out.println("APROVADO\n"
                               +"Conceito: "+con);
        }
        else{
            System.out.println("REPROVADO\n"
                               +"Conceito: "+con);
        }
    }
    
}
