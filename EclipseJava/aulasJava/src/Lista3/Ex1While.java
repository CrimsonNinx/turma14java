package Lista3;

import java.util.Scanner;

public class Ex1While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int somatorio, numero;
        somatorio=0;

        System.out.println("N�mero para o somat�rio ");
        numero = scan.nextInt();

        do{
            somatorio = somatorio + numero;
            numero--;
        }
        while(numero != 0);

        System.out.println("O somat�rio � ");
        System.out.println(somatorio);

    }

}