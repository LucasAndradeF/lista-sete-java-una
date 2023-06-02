public class Frases {
    
    private String frase;
        
    public void setFrase(String frase) {
        this.frase = frase;
    }
        
    public void tamanhoFrase (String fraseUm, String fraseDois) { {
        int tamanhoFraseUm = fraseUm.length();
        int tamanhoFraseDois = fraseDois.length();

        System.out.println("Tamanho de: " + fraseUm + ": " + tamanhoFraseUm + " caracteres.");
        System.out.println("Tamanho de: " + fraseDois + ": " + tamanhoFraseDois + " caracteres.");
            if (tamanhoFraseUm == tamanhoFraseDois) {
                System.out.println("As Strings possuem o mesmo tamanho");
            } else {
                System.out.println("As duas strings são de tamanhos diferentes.");
            }
            if (fraseUm.equals(fraseDois)) {
                System.out.println("As duas strings possuem o mesmo conteúdo.");
            } else {
                System.out.println("As duas strings possuem conteúdo diferente.");
            } 
        }
    }
}
    

