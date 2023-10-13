package junit.gradle.empty;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PessoaTest {
    
    @Test
    void validarCalculoDeIdade(){
        
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }

}
