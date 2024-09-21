/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Professor extends Pessoa {
    protected String RegistroFuncional;
    
    public Professor (String Nome, int Idade, String RegistroFuncional){
        super (Nome, Idade);
        this.RegistroFuncional = RegistroFuncional;
    }
    
    @Override
    public void Atividade (){
        System.out.println(Nome + " está dando aula");
    }
    
    public String getId(){
        return RegistroFuncional;
    }
}