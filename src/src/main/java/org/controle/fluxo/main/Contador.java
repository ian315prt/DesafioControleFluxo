package org.controle.fluxo.main;

import org.controle.fluxo.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o segundo parametro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("parametro um nao pode ser maior que parametro dois");

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}