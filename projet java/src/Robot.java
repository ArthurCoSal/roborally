
public class Robot extends Position {
	private int sante = 10;
	private final int nb_vie = 3;
	private int degats = 1;
	private Position p1;
	private String orientation = "Nord";
		
	
	public Robot(int sante, int degats, int nb_vie, Position position, String orientation) {
		setSante(sante);
		setDegats(degats);
		setOrientation(orientation);
		Position p1 = new Position();
		
	}
	
	public Robot() {
		
	}
	
	public int getSante() {
		return sante;
	}
	
	public void setSante(int vie) {
		this.sante = vie;
	}
	
	public int getDegats() {
		return degats;
	}
	
	public void setDegats(int degats) {
		this.degats = degats;
	}
	
	public String getOrientation() {
		return orientation;
	}
	
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	
	
	
	
	
	

}



