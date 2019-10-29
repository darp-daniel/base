/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario u = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        
        System.out.println("Digite o e-mail");
        u.email = sc.nextLine();
        
        System.out.println("Digite a senha");
        u.senha = sc.nextLine();
        
        System.out.println("Confirme a senha");
        u.confirmacaoSenha = sc.nextLine();
        boolean b;
        if(u.senha.equals(u.confirmacaoSenha)){
            b = true;
            System.out.println("Digite seu nome");
            u.nome = sc.nextLine();
            
            System.out.println("O e-mail é " + u.email);
            System.out.println("A senha é " + u.senha);
            System.out.println("O seu nome é " + u.nome);
        }else
            System.out.println("Error, as senhas não batem");
    }
    
}
