import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int soma = 0;
        int sub = 0;
        int mult = 0;
        int div = 0;

        Scanner console = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = console.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = console.nextInt();

        System.out.println("Escolha a operação: ");
        System.out.println("1 = soma");
        System.out.println("2 = subtração");
        System.out.println("3 = multiplicação");
        System.out.println("4 = divisão");
        int operacao = console.nextInt();

        if (operacao == 1) {
            soma = num1 + num2;
            System.out.println("O resultado é: " + soma);
        }
        if (operacao == 2) {
            sub = num1 - num2;
            System.out.println("O resultado é: " + sub);
        }
        if (operacao == 3) {
            mult = num1 * num2;
            System.out.println("O resultado é: " + mult);
        }
        if (operacao == 4) {
            div = num1 / num2;
            System.out.println("O resultado é: " + div);
        }
    }
}
