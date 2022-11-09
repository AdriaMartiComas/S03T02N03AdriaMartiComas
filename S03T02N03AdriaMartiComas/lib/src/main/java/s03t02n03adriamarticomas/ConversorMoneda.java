package s03t02n03adriamarticomas;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//He usat singleton en aquesta classe ja que només necessito una unica instancia de Conversor Moneda
public class ConversorMoneda {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	private final float euro = 1;
	private final float lliura = 1.8f;
	private final float dolar = 0.9f;

	private static ConversorMoneda instancia;

	private ConversorMoneda() {

	}

	public static ConversorMoneda getInstancia() {
		if (instancia == null) {
			instancia = new ConversorMoneda();
		}
		return instancia;
	}

	public String correccioPreu(Article article, String moneda) {
		df.setRoundingMode(RoundingMode.UP);
		float preuModificat = 0f;
		if (moneda.equalsIgnoreCase("euro")) {
			preuModificat = article.getPreu() * this.euro;
		} else if (moneda.equalsIgnoreCase("lliura")) {
			preuModificat = article.getPreu() * this.lliura;
		} else if (moneda.equalsIgnoreCase("dolar")) {
			preuModificat = article.getPreu() * this.dolar;
		} else {
			preuModificat = article.getPreu();
			System.out.println("Moneda mal introduida");
		}

		return df.format(preuModificat);

	}

}
