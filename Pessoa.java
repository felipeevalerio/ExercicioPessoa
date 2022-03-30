public class Pessoa {
    private String nome; 
    private String endereço; 
    private String telefone; 
    private String cep; 
    private String cidade;
    private String uf;
        
    private final int MAXIMO_DIGITOS_CEP = 8;
    private final int MAXIMO_CARACTERES_UF = 2;
    
    public Pessoa(String nome, String endereço, String telefone, String cep, String cidade, String uf) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        setCep(cep);
        this.cidade = cidade;
        setUF(uf);
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
        return cep;
    }

    private void setCep(String cep) {
        if(cep.length() <= MAXIMO_DIGITOS_CEP) {
            this.cep = cep;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public String getUF() {
        return uf;
    }

    private void setUF(String uf) {
        if(uf.length() <= MAXIMO_CARACTERES_UF) {
            this.uf = uf;
        }
    }
}