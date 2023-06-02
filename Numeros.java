public class Numeros {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String numeros(int numero) {
        if (numero == 1) {
            return "Um";
        } else if (numero == 2) {
            return "Dois";
        }
        return "Número não suportado";
        }
    
}
