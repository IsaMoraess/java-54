import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
-30
10
SOMA = -20 */
    Scanner sc = new Scanner(System.in);
    int numero1, numero2, soma;
    System.out.println("Soma de dois Números!");

    System.out.println("Digite um Número:");
    numero1 = sc.nextInt();
    System.out.println("Digite outro Número:");
    numero2 = sc.nextInt();
    soma = numero1 + numero2;
    System.out.println("Soma = " + soma);
    }
}
