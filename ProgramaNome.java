import java.util.Scanner;

public class ProgramaNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nome nome = new Nome();
        
        System.out.println("Inversor de Nomes");
        
        System.out.println("Digite o seu nome:");
        String nomePessoa = sc.nextLine();
                
        String nomeInvertido = nome.inversor(nomePessoa);
        
        System.out.println("Nome invertido: " + nomeInvertido.toUpperCase());
        sc.close();
        
    }
}
