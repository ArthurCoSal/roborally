
public class Position {
	private int abscisse = 0;
	private int ordonnes = 0;
	
	public Position(int abscisse, int ordonnes) {
		setAbscisse(abscisse);
		setOrdonnes(ordonnes);
	}
	
	
	public Position() {
		
	}
	
	public Position(Position position) {
		setAbscisse(position.getAbscisse());
		setOrdonnes(position.getOrdonnes());
		
	}
	
	public int getAbscisse() {
		return abscisse;
	}
	
	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}
	
	public int getOrdonnes() {
		return ordonnes;
	}
	
	public void setOrdonnes(int ordonnes) {
		this.ordonnes = ordonnes;
	}
	
	public Position NouvellePosition(Position p , Cartes c) {
		if(c.getDirection().equals("Nord")) {
			p.setAbscisse(abscisse+c.getCases());
		}
		else if(c.getDirection().equals("Est")){
			p.setOrdonnes(ordonnes+c.getCases());
		}
		else if(c.getDirection().equals("Sud")){
			p.setAbscisse(abscisse-c.getCases());
		}
		else {
			p.setOrdonnes(ordonnes-c.getCases());
		}
		
		return p;
		
	}
	
	
	public void ChgmtDirection(Robot r ,Cartes c1) {
		if (r.getOrientation().equals("Nord")){
			//if(c1.getChgmtSens()=0) 
				
			
			
				
			}
		}
	
	
	public String toString() {
		return "la position de votre robot est : " + getAbscisse() + ", " + getOrdonnes();
	}
	
	

}
