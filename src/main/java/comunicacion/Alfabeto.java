package comunicacion;

public class Alfabeto extends Pictograma {
	
	//Atributos
	private String[] letras;
	private String interpretacion;
	
	//Constructores
	public Alfabeto(String origen) {
		super(origen);
		// TODO Auto-generated constructor stub
	}
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		this.letras = letras;
	}

	//Methods
	public int cantidadLetras() {
		return letras.length;
	}

	@Override
	String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		
		StringBuilder resultado = new StringBuilder();
		
		for (int i = 0; i < letras.length; i++) {
			resultado.append(letras[i]);
			
			if (i < letras.length - 1) {
				resultado.append(", ");
			}
			
		}
		
		return resultado.toString();
	}
	
	//getters y setters
	public String getInterpretacion() {
		return interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
