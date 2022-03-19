package jogodefutebol;

public class Placar {
	private String timeCasa;
	private String timeVisitante;
	private int placacasa;
	private int placaVisitante;
	
	public Placar() {
		timeCasa = "Time da casa";
		timeVisitante = "Visitante";
        
		
	}
		

	public Placar(String timeCasa, String timeVisitante, int placacasa, int placaVisitante) {
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		setPlacacasa(placacasa);
		setPlacaVisitante(placaVisitante);
	}

	public void setPlacaVisitante(int placaVisitante) {
		if(placaVisitante > 0) {
			this.placaVisitante = placaVisitante;
		}
	}

	public void setPlacacasa(int placacasa) {
		if( placacasa > 0) {
			this.placacasa = placacasa;
		}
	}
	
	

	public Placar(String timeCasa, String timeVisitante) {
		super();
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
	}


	public String getPlacar() {
        return timeCasa + " " + placacasa + " X " +
        		timeVisitante + " "+ placaVisitante;
		
	}
	
}
	
	
