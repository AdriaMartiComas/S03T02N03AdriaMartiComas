package s03t02n03adriamarticomas;


public class Main {

	public static void main(String[] args) {
		
		// dependencies
		ConversorMoneda cm = ConversorMoneda.getInstancia();

		// Injections
		Article article1 = new Article("Pa", 1.3f, cm);
		Article article2 = new Article("Oli", 7.45f, cm);
		Article article3 = new Article("Aigua", 1f, cm);

		// Print productes per veure preus inicials
		System.out.println(article1);
		System.out.println(article2);
		System.out.println(article3);

		System.out.println("El preu de: " + article1.getNom() + " en euros és de: "
				+ article1.getCm().correccioPreu(article1, "euro"));
		System.out.println("El preu de: " + article1.getNom() + " en lliures és de: "
				+ article1.getCm().correccioPreu(article1, "lliura"));
		System.out.println("El preu de: " + article1.getNom() + " en dolars és de: "
				+ article1.getCm().correccioPreu(article1, "dolar"));
		System.out.println();
		
		System.out.println("El preu de: " + article2.getNom() + " en euros és de: "
				+ article2.getCm().correccioPreu(article2, "euro"));
		System.out.println("El preu de: " + article2.getNom() + " en lliures és de: "
				+ article2.getCm().correccioPreu(article2, "lliura"));
		System.out.println("El preu de: " + article2.getNom() + " en dolars és de: "
				+ article2.getCm().correccioPreu(article2, "dolar"));
		System.out.println();
		
		System.out.println("El preu de: " + article3.getNom() + " en euros és de: "
				+ article3.getCm().correccioPreu(article3, "euro"));
		System.out.println("El preu de: " + article3.getNom() + " en lliures és de: "
				+ article3.getCm().correccioPreu(article3, "lliura"));
		System.out.println("El preu de: " + article1.getNom() + " en dolars és de: "
				+ article3.getCm().correccioPreu(article3, "dolar"));

	}

}

/*
 * Dependency Injection
 * 
 * Dissenya una classe que mostri en pantalla el preu de diversos articles. Ja
 * que haurà de mostrar-los també en diversos tipus de moneda.
 * 
 * Important Assegura't d'afegir-li com a Injecció de Dependència una classe
 * Convertidor de Moneda que efectuï la correcció del preu en funció del canvi
 * de divisa.
 * 
 * 
 */
