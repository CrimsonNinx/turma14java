package Lista3;

import java.util.Scanner;

public class Lista3Ex2 {

	public static void main(String[] args) {
        int num;
        int soma = 0;

        for (num = 1; num <= 500; num++) {
            if ((num % 2 == 1) && (num % 3 == 0)) {
                soma = soma + num;
            }
        }

        System.out.println(soma);
    }

}