import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println(idade + " anos em dias " + idade * 365);

        System.out.println(idade + " anos em meses " + idade * 12);



        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);



        float num1 = 8;
        float num2 = 9;
        float num3 = 7;

        float media1 = (num1 + num2 + num3) / 3;

        float num4 = 4;
        float num5 = 5;
        float num6 = 6;

        float media2 = (num4 + num5 + num6) / 3;

        float somaDasDuasMedias = media1 + media2;

        float mediaDasMedias = somaDasDuasMedias / 2;

        System.out.println("Média do primeiro conjunto: " + media1);
        System.out.println("Média do segundo conjunto: " + media2);
        System.out.println("Soma das duas médias: " + somaDasDuasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);

    }
}
