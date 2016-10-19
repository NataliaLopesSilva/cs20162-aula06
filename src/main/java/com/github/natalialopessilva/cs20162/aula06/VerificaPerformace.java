/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula06;

/**
 * Implementação do Algoritmo de Verificação de performace das demais classes.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 6, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class VerificaPerformace {

    /**
     * Construtor da classe VerificaPerformace.
     */
    protected VerificaPerformace() {
    }

    /**
     * Método que acessa o construtor.
     */
    public static void setVerificaPerformace() {
        VerificaPerformace verificaPerformace = new VerificaPerformace();
        String[] args = null;
        verificaPerformace.main(args);
    }

    /**
     * Número que indica o segundo digito.
     */
    public static final int DIGITO_2 = 2;

    /**
     * Número que indica o quinto digito.
     */
    public static final int DIGITO_5 = 5;

    /**
     * Número que indica o primeiro digito.
     */
    public static final int DIGITO_7 = 7;

    /**
     * Número que indica o oitavo digito.
     */
    public static final int DIGITO_8 = 8;

    /**
     * Número que indica o nono digito.
     */
    public static final int DIGITO_9 = 9;

    /**
     * Número que indica o tamanho DO laço.
     */
    public static final int TAMANHO_LACO = 1000000;

    /**
     * Verifica a difirença em nanosegundos de um algoritmo para o outro.
     *
     * @param args Como Argumentos da classe principal.
     */
    public static void main(final String[] args) {

        int[] d = {0, DIGITO_5, DIGITO_7, DIGITO_2, DIGITO_5, 1, DIGITO_5,
            DIGITO_9, 1, 0, DIGITO_8};

        long inicio = 0, fim = 0;

        //Execução de CPF.
        inicio = System.nanoTime();

        for (int i = 0; i < TAMANHO_LACO; i++) {
            CPF.verificaDigitosVerificadores(d);
        }

        fim = System.nanoTime();

        System.out.println("O tempo do programa CPF é: " + (fim - inicio));

        //Execução de CPF2.
        inicio = System.nanoTime();

        for (int i = 0; i < TAMANHO_LACO; i++) {
            CPF2.verificaDigitosVerificadores(d);
        }

        fim = System.nanoTime();

        System.out.println("O tempo do programa CPF2 é: " + (fim - inicio));

        //Execução de CPF3.
        inicio = System.nanoTime();

        for (int i = 0; i < TAMANHO_LACO; i++) {
            CPF3.verificaDigitosVerificadores(d);
        }

        fim = System.nanoTime();

        System.out.println("O tempo do programa CPF3 é: " + (fim - inicio));
    }
}
