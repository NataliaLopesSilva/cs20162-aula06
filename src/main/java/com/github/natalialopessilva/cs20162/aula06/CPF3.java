/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula06;

/**
 * Implementação do Algoritmo de CPF 3(forma).
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 6, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 */
public final class CPF3 {

    /**
     * Número que indica o primeiro digito.
     */
    public static final int DIGITO_1 = 1;

    /**
     * Número que indica o segundo digito.
     */
    public static final int DIGITO_2 = 2;

    /**
     * Número que indica o terceiro digito.
     */
    public static final int DIGITO_3 = 3;

    /**
     * Número que indica o quarto digito.
     */
    public static final int DIGITO_4 = 4;

    /**
     * Número que indica o quinto digito.
     */
    public static final int DIGITO_5 = 5;

    /**
     * Número que indica o sexto digito.
     */
    public static final int DIGITO_6 = 6;

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
     * Construtor da classe CPF3 que impede que a mesma seja instanciada ou
     * acessada.
     */
    protected CPF3() {
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

        p = p + d[DIGITO_8 - 1];
        s += p;

        p = p + d[DIGITO_7 - 1];
        s += p;

        p = p + d[DIGITO_6 - 1];
        s += p;

        p = p + d[DIGITO_5 - 1];
        s += p;

        p = p + d[DIGITO_4 - 1];
        s += p;

        p = p + d[DIGITO_3 - 1];
        s += p;

        p = p + d[DIGITO_2 - 1];
        s += p;

        p = p + d[DIGITO_1 - 1];
        s += p;

        int j = ((s % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);
        int k = (((s - p + (DIGITO_9 * j))
                % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);

        return (j == d[DIGITO_10VERIFICADOR - 1]
                && k == d[DIGITO_11VERIFICADOR - 1]);
    }
}
