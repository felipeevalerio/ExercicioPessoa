public class PessoaFisica extends Pessoa {
    
    private String CPF;

    private final int LIMITE_DIGITOS_CPF = 11;

    public PessoaFisica(String nome, String endereço, String telefone, String CEP, String cidade, String UF, String CPF) {
        super(nome, endereço, telefone, CEP, cidade, UF);
        setCPF(CPF);
    }

    public String getCPF() {
        return CPF;
    }

    private void setCPF(String CPF) {
        if(CPF.length() == LIMITE_DIGITOS_CPF) {
            this.CPF = CPF;
        }
    }
}