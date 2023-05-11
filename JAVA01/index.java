package com.mycompany.aula01;

/**
 *
 * @author rodri
 */
import java.util.Scanner;

public class Aula01 {

    //Brincando com condiçoes logicas.
    public static void main(String[] args) {
        //Declarar dois objetos do tipo texto
        String nome1, nome2;
        //Dois objetos do tipo idade
        int idade1, idade2;
        
        //Pessoa1
        Scanner entrada1 = new Scanner(System.in);
        nome1 = entrada1.nextLine();
        idade1 = entrada1.nextInt();
        
        //Pessoa2
        Scanner entrada2 = new Scanner(System.in);
        nome2 = entrada2.nextLine();
        idade2 = entrada2.nextInt();
        
        //Agora a condicional para identificar qual e o mais velho
        if(idade1 > idade2){
            System.out.println(nome1 + " é mais velho(a) do que " + nome2);
        }else if(idade2 > idade1){
            System.out.println(nome2 + " é mais velho(a) do que " + nome1);
        }else{
            System.out.println("Os dois possuem a mesma idade.");
            }
        scanner.close();
    }
}