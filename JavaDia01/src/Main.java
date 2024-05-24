//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sextou = false;
       char letra = 'a';
       String nome = "souUmaClasseEstatica";
       int idade = 1;
       float salarioLiquido = 18.444f;
       System.out.println("Sextou: " + sextou);
       System.out.println("Caracter: " + letra);
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Salario: " + salarioLiquido);
       System.out.println("=========================");

       System.out.printf("O valor do salario é %.2f", salarioLiquido);
       System.out.println("\n=========================");

       float media = 6f;
       System.out.println("");
       System.out.printf("\nA média de %s foi %.1f", nome, media);
       System.out.format("\nA média de %s foi %.1f", nome, media);

       Scanner teclado = new Scanner(System.in);
       System.out.print("\nDigite o nome do aluno: ");
       String nomeAluno = teclado.nextLine();
       System.out.println(nomeAluno);
       System.out.println("Nota do aluno: ");
       float  nota = teclado.nextFloat();
       System.out.printf("Nome: %s\nNota: %.1f", nomeAluno, nota);

    }
}