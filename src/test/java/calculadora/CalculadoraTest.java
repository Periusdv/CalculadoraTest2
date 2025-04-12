package calculadora;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Davi Dias Perius
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraTest {

    //Referência a uma instância
    Calculadora calculadora;

    @BeforeAll
    void inicializacao() {
        //Instancia um objeto da classe Calculadora
        calculadora = new Calculadora(4.0, 2.0);
    }
    @Test 
    void testGetSomaValorVazio() {
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 0.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);    
    }        
            
    @Test
    void testGetSoma() {
        //Define o valor esperado para a operação 
        double retornoEsperado = 5.0;
        //Chama a operacao getSoma()
        double retornoFeito = calculadora.getSoma();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 2);
    }

    @Test
    void testGetDiferenca() {
        //Define o valor esperado para a operação 
        double retornoEsperado = 2.0;
        //Chama a operacao getDiferenca()
        double retornoFeito = calculadora.getDiferenca();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetProduto() {
        //Define o valor esperado para a operação 
        double retornoEsperado = 8.0;
        //Chama a operacao getProduto()
        double retornoFeito = calculadora.getProduto();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetQuociente() {
        //Define o valor esperado para a operação 
        double retornoEsperado = 2.0;
        //Chama a operacao getQuociente()
        double retornoFeito = calculadora.getQuociente();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @AfterAll
    public void finalizacao() {
        calculadora = null;
    }
}
