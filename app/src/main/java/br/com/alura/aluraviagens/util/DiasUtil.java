package br.com.alura.aluraviagens.util;

import br.com.alura.aluraviagens.model.Pacote;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataEmTexto(int quantidadeDeDias) {

        if(quantidadeDeDias > 1) {
            return quantidadeDeDias + PLURAL;
        } else {
            return quantidadeDeDias + SINGULAR;
        }
    }
}
