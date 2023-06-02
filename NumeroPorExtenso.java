import java.util.Scanner;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros num = new Numeros();
        
        
        System.out.println("Números por Extenso");

        System.out.println("Informe um número");
        int valorUm = sc.nextInt();

        String valorUmInvertido = num.numeros(valorUm);
        System.out.println("Número por extenso: " + valorUmInvertido);
        sc.close();

    }
}
