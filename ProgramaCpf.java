import java.util.Scanner;

public class ProgramaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cpf cpf = new Cpf();

        System.out.println("Validação de CPF");

        System.out.println("Informe o número do seu CPF:");
        String numeroDeCpf = sc.nextLine();
        sc.close();
        
        String format = cpf.formatar(numeroDeCpf);;
        System.out.println("CPF Formatado: " + format);
    }
    
}
