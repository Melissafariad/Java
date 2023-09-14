import java.util.Scanner;

public class Exerciciolivre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura da piscina em metros: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite o comprimento da piscina em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a profundidade média da piscina em metros: ");
        double profundidade = scanner.nextDouble();

        double volume = largura * comprimento * profundidade;

        double volumeEmLitros = volume * 1000;

        System.out.println("A quantidade de água necessária para encher a piscina é de " + volumeEmLitros + " litros.");

        scanner.close();
    }
}
