package questao_54;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    private static final Locale LOCALE_BRAZIL = Locale.of("pt", "BR");

    public static String toReal(double value) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BRAZIL);

        return nf.format(value);
    }

    public static String toDollar(double value) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        return nf.format(value);
    }
}
