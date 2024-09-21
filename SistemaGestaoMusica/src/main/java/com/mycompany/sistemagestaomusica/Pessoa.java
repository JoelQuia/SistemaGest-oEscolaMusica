/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestaomusica;

/**
 *
 * @author Admin
 */
public abstract class Pessoa {
    
    protected String Nome;
    protected int Idade;
    
    public Pessoa(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public abstract void Atividade();
        
    
}
