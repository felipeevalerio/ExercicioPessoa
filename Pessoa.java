public class Pessoa {
    private String nome; 
    private String endereço; 
    private String telefone; 
    private String CEP; 
    private String cidade;
    private String UF;
        
    private final int MAXIMO_DIGITOS_CEP = 8;
    private final int TAMANHO_CARACTERES_UF = 2;
    
    public Pessoa(String nome, String endereço, String telefone, String CEP, String cidade, String UF) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        setCep(CEP);
        this.cidade = cidade;
        setUF(UF);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return CEP;
    }

    private void setCep(String CEP) {
        if(CEP.length() == MAXIMO_DIGITOS_CEP) {
            this.CEP = CEP;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public String getUF() {
        return UF;
    }

    private void setUF(String UF) {
        if(UF.length() == TAMANHO_CARACTERES_UF) {
            this.UF = UF;
        }
    }
}