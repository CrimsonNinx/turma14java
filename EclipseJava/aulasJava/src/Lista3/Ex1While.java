package Lista3;

import java.util.Scanner;

public class Ex1While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int somatorio, numero;
        somatorio=0;

        System.out.println("Número para o somatório ");
        numero = scan.nextInt();

        do{
            somatorio = somatorio + numero;
            numero--;
        }
        while(numero != 0);

        System.out.println("O somatório é ");
        System.out.println(somatorio);

    }

}