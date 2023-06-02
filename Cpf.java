public class Cpf {
    private String numeroCpf;

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }
    public String formatar(String cpf) {
        if (cpf.length() != 11) {
            return "Número inválido";
        } else {
            return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9, 11));
    }
    }
    
    }

