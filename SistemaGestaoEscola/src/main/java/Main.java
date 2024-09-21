/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Pessoa>pessoas = new ArrayList<>();
        
        Aluno aluno1 = new Aluno ("Joel", 18, "123");
        Professor professor1 = new Professor ("Wagner", 37, "456");
        Funcionario funcionario1 = new Funcionario ("Bagriel", 20, "F678");
        
        pessoas.add(aluno1);
        pessoas.add(professor1);
        pessoas.add(funcionario1);
        
         for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Identificavel identificavel) {
                System.out.println("Identificador:  "  + identificavel.getId());
            }
            pessoa.Atividade();
        }
        
    }
    }
    

