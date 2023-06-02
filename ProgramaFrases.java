import java.util.Scanner;

public class ProgramaFrases {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Frases frases = new Frases();

      System.out.println("Comparador de Strings");

      System.out.println("Informe a primeira frase:");
      String fraseUm = sc.nextLine();

      System.out.println("Informe a segunda frase:");
      String fraseDois = sc.nextLine();
      
      frases.tamanhoFrase(fraseUm, fraseDois);
      sc.close();
          
    }
}