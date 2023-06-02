public class Nome {
    private String nomePessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String inversor(String nomePessoa) {
        StringBuilder reversedStr = new StringBuilder(nomePessoa).reverse();
        return reversedStr.toString();
         
    }

    
}
