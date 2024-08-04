package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		return getPaginas() * palabrasPagina * 1;
	}
	
	@Override
	String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		return getOrigen() + "\n" + 
			   getTitulo() + "\n" +
			   getAutor() + "\n" +
			   getPaginas() + "\n" +
			   ensenanza;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnseñanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
	
	
	
}
