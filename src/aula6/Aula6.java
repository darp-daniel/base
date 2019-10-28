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
        
        System.out.println("Digite o e-mail");
        Usuario.email = sc.nextLine();
        
        System.out.println("Digite a senha");
        Usuario.senha = sc.nextLine();
        
        System.out.println("O e-mail é " + Usuario.email);
        System.out.println("A senha é " + Usuario.senha);
        
    }
    
}
