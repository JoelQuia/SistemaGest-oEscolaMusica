/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Aluno extends Pessoa {
    
    protected String matricula;
    
    public Aluno(String Nome, int Idade, String matricula){
        super (Nome,Idade);
        this.matricula = matricula;
    }
    
    @Override
    public void Atividade(){
        System.out.println( Nome + " está aprendendo algum instrumento");
        
    }
    public String getId(){
        return matricula;
    }
    
}