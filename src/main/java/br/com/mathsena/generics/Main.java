package br.com.mathsena.generics;

import java.util.Scanner;

public class Main {

    public void runProgram(Scanner sc) {
        PrintService<String> ps = new PrintService<>();

        System.out.println("Quantos nomes?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("O primeiro é: " + x);
    }
}
