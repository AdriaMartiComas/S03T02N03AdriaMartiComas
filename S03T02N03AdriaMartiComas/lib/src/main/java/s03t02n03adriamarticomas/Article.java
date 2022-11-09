package s03t02n03adriamarticomas;

public class Article {

	private String nom;
	private float preu;
	private ConversorMoneda cm;

	public Article(String nom, float preu, ConversorMoneda cm) {
		this.nom = nom;
		this.preu = preu;
		this.cm = cm;
	}

	public ConversorMoneda getCm() {
		return cm;
	}

	public void setCm(ConversorMoneda cm) {
		this.cm = cm;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Article [nom=" + nom + ", preu=" + preu + "]";
	}

}
