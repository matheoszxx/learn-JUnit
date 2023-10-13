package junit.gradle.empty;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    
    public Pessoa(String nome, LocalDate nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
        
    }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNome() { return nome; }
    
    public LocalDate getNascimento() { return nascimento; }
    
    public int getIdade() { return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());}
    
}