
public class Interaction extends Position {
	public void LaserBeam(Robot r1, Robot r2) {
		if (r1.getAbscisse() == r2.getAbscisse() || r1.getOrdonnes() == r2.getOrdonnes()) {
			r2.setSante(r2.getSante()-r1.getDegats());
		}
		
	}
	
	public Position Collision() {
		Position position = new Position(); 
		return position;
	}

}
