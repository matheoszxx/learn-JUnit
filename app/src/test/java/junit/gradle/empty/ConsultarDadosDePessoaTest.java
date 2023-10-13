package junit.gradle.empty;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConsultarDadosDePessoaTest {
    
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    
    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }
    //é uma execução unica no fim e no iniciou do teste (serve para o AfterAll)
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }
    //executa antes e depois de cada teste que existir na classe (serve para o AfterEach)
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }
    
    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }
    
    
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
        
}
    
    
