/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestaomusica;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa {
    
    protected String cracha;
    
    public Funcionario(String Nome, int Idade, String cracha){
        super(Nome, Idade);
        this.cracha = cracha;
    }
    
    @Override
    public void Atividade(){
        System.out.println("Fiscalizando as informações");
        
    }
    
    public String getId(){
        return cracha;
    }
}
