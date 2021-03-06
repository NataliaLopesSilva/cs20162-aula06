/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula06;

/**
 * Implementação do Algoritmo de CPF 2 (forma).
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 6, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class CPF2 {

    /**
     * Número que indica o oitavo digito.
     */
    public static final int DIGITO_8 = 8;

    /**
     * Número que indica o nono digito.
     */
    public static final int DIGITO_9 = 9;

    /**
     * Número que indica o décimo digito.
     */
    public static final int DIGITO_10VERIFICADOR = 10;

    /**
     * Número que indica o décimo primeiro digito.
     */
    public static final int DIGITO_11VERIFICADOR = 11;

    /**
     * Número que indica o tamanho do CPF.
     */
    public static final int TAMANHO_CPF = 11;

    /**
     * Construtor da classe CPF2 que impede que a mesma seja instanciada ou
     * acessada.
     */
    private CPF2() {
    }

    /**
     * Verifica se os dois últimos digitos estão válidos (DigitosVerificadores).
     *
     * @param d Um cpf de entrada para verificação.
     *
     * @return true para válido ou false para inválido.
     *
     * @throws IllegalArgumentException Se o tamanho d[], ou seja quantidade de
     * carácteres for diferentes de 11.
     */
    public static boolean verificaDigitosVerificadores(final int[] d) {

        if (d.length != TAMANHO_CPF) {
            throw new IllegalArgumentException("A entrada deve possuir 11 "
                    + "dígitos");
        }

        int c = DIGITO_8;
        int p = d[DIGITO_9 - 1];
        int s = d[DIGITO_9 - 1];

        while (c >= 1) {
            p = p + d[c - 1];
            s += p;
            c--;
        }

        int j = ((s % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);
        int k = (((s - p + (DIGITO_9 * j)) % DIGITO_11VERIFICADOR)
                % DIGITO_10VERIFICADOR);

        return (j == d[DIGITO_10VERIFICADOR - 1]
                && k == d[DIGITO_11VERIFICADOR - 1]);
    }

}
