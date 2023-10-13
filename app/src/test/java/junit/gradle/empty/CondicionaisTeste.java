package junit.gradle.empty;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


public class CondicionaisTeste {
    @Test
    void validarAlgoSomenteNoUserMatheus(){
        Assumptions.assumeTrue("matheus".equals(System.getenv("USER")));
        
    }
}
