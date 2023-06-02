import java.util.Scanner;

public class ProgramaTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Telefone tel = new Telefone();

        System.out.println("Valida e corrige número de telefone");
        System.out.println("Telefone: ");
        tel.setNumeroTelefone(sc.nextLine());

        String telefone = tel.ajustar();
        if (telefone != null) {
            System.out.println("Telefone possui 8 dígitos.");
            System.out.println("Vou acrescentar o dígito '9' na frente.");
            System.out.println("Telefone corrigido sem formatação: " + telefone);
            System.out.println("Telefone corrigido com formatação: " + formatarTelefone(telefone));
        } else {
            System.out.println("Número de telefone inválido");
        }
    }

    private static String formatarTelefone(String numeroTelefone) {
        return numeroTelefone.substring(0, 5) + "-" + numeroTelefone.substring(5);
    }
}