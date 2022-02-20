package br.com.capgemini.controller;

import br.com.capgemini.service.EscadaService;
import br.com.capgemini.service.SenhaService;

import java.util.Scanner;

public class DesafioController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o desafio  1-Escada 2-Senha 3-Anagrama");
        int  desafio = scanner.nextInt();

        if (desafio == 1)
        {
            EscadaService escadaService = new EscadaService();
            System.out.println("Digite o tamanho da escada");
            int tamanho = scanner.nextInt();

            escadaService.criaEscada(tamanho);
        } else if (desafio == 2){
            SenhaService senhaService = new SenhaService();
            System.out.println("Digite o Nome");
            String nome = scanner.next();
            System.out.println("Digite a Senha");
            String senha = scanner.next();

            System.out.println(senhaService.validaSenha(senha));
        } else if (desafio == 3)
        {
            System.out.println("Digite o texto a ser verificado");
            String texto = scanner.next();

        }

    }
}
