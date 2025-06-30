package código;

import java.util.Scanner;

public class geometria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário a base do triângulo
        System.out.print("Digite o valor da base do triângulo: ");
        double base = entrada.nextDouble();

        // Solicita ao usuário a altura do triângulo
        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = entrada.nextDouble();

        // Calcula a área do triângulo retângulo
        double area = (base * altura) / 2;

        // Exibe o resultado
        System.out.println("A área do triângulo retângulo é: " + area);

        entrada.close();
    }
    
}
