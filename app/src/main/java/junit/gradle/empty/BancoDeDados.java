package junit.gradle.empty;

import java.util.logging.Logger;

public class BancoDeDados {
    //Criar um Logger para fins didáticos
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");  
    }
    
    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("finalizou conexao");  
    }
    
    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no banco de dado
        LOGGER.info("Inseriu Dados");
    }
    
    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no banco de dado
        LOGGER.info("removeu Dados");
    }
    
}
