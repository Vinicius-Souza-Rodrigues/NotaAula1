package Main;

import aluno.aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        aluno aluno1 = new aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(sc.next());
        System.out.println("Digite a sua nota 1: ");
        aluno1.setNota1(sc.nextDouble());
        System.out.println("Digite a sua nota 2: ");
        aluno1.setNota2(sc.nextDouble());
        System.out.println("Digite a sua nota 3: ");
        aluno1.setNota3(sc.nextDouble());
        aluno1.calcularMedia();
        System.out.printf(aluno1.situacao());

        sc.close();
    }
}