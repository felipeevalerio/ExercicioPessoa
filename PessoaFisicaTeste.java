import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaFisicaTeste {
    PessoaFisica pessoaFisica;

    private final String NOME = "Gabriel";
    private final String ENDERECO = "Rua do porcão";
    private final String TELEFONE = "31932049382";
    private final String CEP = "35500019";
    private final String CIDADE = "Belo Horizonte";
    private final String UF = "MG";
    private final String CPF = "21393281273";

    @BeforeEach
    public void inicializar() {
        pessoaFisica = new PessoaFisica(NOME, ENDERECO, TELEFONE, CEP, CIDADE, UF, CPF);
    }
    
    @Test
    public void testaInicialização(){
        assertNotEquals(null, pessoaFisica);
    }

    @Test 
    public void testeVerificaSeCPFValido(){
        assertEquals(CPF, pessoaFisica.getCPF());
    }
    
    @Test 
    public void testeVerificaSeCPFInvalido(){
        String cpfInvalido = "5555555555512";
        PessoaFisica pessoaFisicaCpfInvalido = new PessoaFisica(NOME, ENDERECO, TELEFONE, CEP, CIDADE, UF, cpfInvalido);
        
        assertEquals(null, pessoaFisicaCpfInvalido.getCPF());
    }
}
