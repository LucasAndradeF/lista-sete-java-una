public class Telefone {
    private String numeroTelefone;

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String ajustar() {
        String numeroLimpo = numeroTelefone.replace("-", "").replace(" ", "");

        if (numeroLimpo.length() == 8) {
            String numeroCorrigido = "9" + numeroLimpo;
            return numeroCorrigido;
        } else {
            return null;
        }
    }
}