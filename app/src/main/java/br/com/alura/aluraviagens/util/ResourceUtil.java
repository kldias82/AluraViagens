package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.com.alura.aluraviagens.model.Pacote;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, Pacote pacote) {
        Resources resources = context.getResources();
        int iddDoDrawable = resources.getIdentifier(pacote.getImagem(),
                DRAWABLE, context.getPackageName());
        return resources.getDrawable(iddDoDrawable);
    }

}
