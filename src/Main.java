import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int valor = 10;

        byte numero2 = 54;

        short numero3 = 3265;

        float numero4 = 10;

        double numero5 = 6;

        long numero6 = 1000000000L;

        boolean numero7 = true;

        char numero8 = 'e';

        System.out.println("o valor da variavel int é:" + valor);
        System.out.println("o valor da variavel byte é:" + numero2);
        System.out.println("o valor da variavel short é:" + numero3);
        System.out.println("o valor da variavel float é:" + numero4);
        System.out.println("o valor da variavel double é:" + numero5);
        System.out.println("o valor da variavel long é:" + numero6);
        System.out.println("o valor da variavel boolean é:" + numero7);
        System.out.println("o valor da variavel char é:" + numero8);



        int numero1 = 10;
        int num2 = 54;

        int soma = numero1 + num2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a: " + soma);



        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite primeiro numero: ");
        int numero123 = scanner.nextInt();

        System.out.printf("Digite segundo numero: ");
        int numero1234 = scanner.nextInt();

        int somatotal = numero1234 + numero123;
        System.out.println("A soma é: " + somatotal);



        System.out.printf("Digite primeiro numero: ");
        int numero567 = scanner.nextInt();

        System.out.printf("Digite segundo numero: ");
        int numero89 = scanner.nextInt();

        int subtracaototal = numero567 - numero89;
        System.out.println("A subtração é: " + subtracaototal);



        int valor2 = 4;
        int multiplicacao = 6;

        int resultado = valor2 * multiplicacao;

        System.out.println("O resultado da multiplicação é: " + resultado);



        int valor3 = 18;
        int divisao = 9;

        int result = valor3 / divisao;

        System.out.println("O result da divisão é: " + result);



        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor inteiro: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.print("O numero é par");
        }
        else{
            System.out.print("O numero é impar");
        }

        System.exit(0);

      }
    }

