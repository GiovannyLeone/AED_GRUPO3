import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i == 0) {

        System.out.println("Qual exercicio você quer executar?: ( 3 , 5 , 7 )");
        String exercicio = scanner.nextLine();


            if (Objects.equals(exercicio, "3")) {
                exercicio3();
                i++;

            } else if (Objects.equals(exercicio, "5")) {
                exercicio5();
                i++;

            } else if (Objects.equals(exercicio, "7")){
                exercicio7();
                i++;

            } else {
                System.out.println("Você não digitou uma opção válida!:");
                System.out.println("\n");

            }
        }


    }

//---------------------------------------------------------------------------------------

/**
 * Exercício 3: Salário de Funcionário
 * Este programa lê o nome e o salário de um funcionário, depois exibe uma mensagem com essas informações.
 */
    public static void exercicio3() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome do Funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Salário: R$");
            double salario = scanner.nextDouble();
            System.out.printf("O funcionário %s tem um salário de R$%.2f em junho.%n", nome, salario);
        }
    }

    /**
     * Exercício 5: Média de Notas
     * Este programa lê duas notas de uma disciplina e calcula a média.
     */
    public static void exercicio5() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            double media = (nota1 + nota2) / 2;
            System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
        }
    }

    //---------------------------------------------------------------------------------------

    /**
     * Exercício 7: Dobro e Terça Parte
     * Este programa lê um número real, depois calcula e exibe seu dobro e a terça parte.
     */
    public static void exercicio7() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            double dobro = numero * 2;
            double tercaParte = numero / 3;
            System.out.println("O dobro de " + numero + " é " + dobro);
            System.out.println("A terça parte de " + numero + " é " + tercaParte);
        }
    }


}
