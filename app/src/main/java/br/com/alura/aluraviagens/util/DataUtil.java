package br.com.alura.aluraviagens.util;

import android.icu.util.Calendar;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.text.SimpleDateFormat;

import br.com.alura.aluraviagens.model.Pacote;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    public static String periodoEmTexto(Pacote pacote) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, pacote.getDias());
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormatadaIda = formatoBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formatoBrasileiro.format(dataVolta.getTime());
        String dataFormatadaDaViagem = dataFormatadaIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);
        return dataFormatadaDaViagem;
    }

}
