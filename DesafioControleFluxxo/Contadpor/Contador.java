package DesafioControleFluxxo.Contadpor;

import java.util.InputMismatchException;
import java.util.Scanner;

import DesafioControleFluxxo.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        
     
       
            Scanner scanner = new Scanner(System.in);
           int num1 = lerNumeroInteiro(scanner, "Digite o primeiro número: ");
            int num2 = lerNumeroInteiro(scanner, "Digite o segundo número: ");
            try {

            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo número " + i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Ambos os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


private static int lerNumeroInteiro(Scanner scanner, String mensagem) {
    int numero = 0;
    boolean validInput = false;

    while (!validInput) {
        try {
            System.out.print(mensagem);
            numero = scanner.nextInt();
            validInput = true; // Sai do loop se a entrada for válida
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa o buffer de entrada
        }
    }
    return numero;
}
}