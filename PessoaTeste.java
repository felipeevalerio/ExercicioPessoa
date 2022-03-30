import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    Pessoa pessoa;

    private final String NOME = "Gabriel";
    private final String ENDERECO = "Rua do porcão";
    private final String TELEFONE = "31932049382";
    private final String CEP = "35500019";
    private final String CIDADE = "Belo Horizonte";
    private final String UF = "MG";

    @BeforeEach
    public void inicializar() {
        pessoa = new Pessoa(NOME, ENDERECO, TELEFONE, CEP, CIDADE, UF);
    }
    
    @Test
    public void testaInicialização(){
        assertNotEquals(null, pessoa);
    }

    @Test 
    public void testeVerificaSeUFValido(){
        assertEquals(CEP, pessoa.getCep());
    }
    
    @Test 
    public void testeVerificaSeUFInvalido(){
        String cepInvalido = "55555555555";
        Pessoa pessoaCepInvalido = new Pessoa(NOME, ENDERECO, TELEFONE, cepInvalido, CIDADE, UF);
        
        assertEquals(null, pessoaCepInvalido.getCep());
    }

    @Test 
    public void testeVerificaSeCEPValido(){
        assertEquals(UF, pessoa.getUF());
    }
    
    @Test 
    public void testeVerificaSeCEPInvalido(){
        String UFInvalido = "MGA";
        Pessoa pessoaUFInvalido = new Pessoa(NOME, ENDERECO, TELEFONE, CEP, CIDADE, UFInvalido);
        
        assertEquals(null, pessoaUFInvalido.getUF());
    }
    
}
