
public class Cartes {
	private String direction = "Nord";
	private int chgmt_sens = -90;
	private int cases;
	private int vitesse = 100;
	
	public Cartes(String direction, int cases) {
		setDirection(direction);
		setCases(cases);
	}
	
	
	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
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public int getCases() {
		return cases;
	}
	
	public void setCases(int cases) {
		this.cases =cases;
	}

	public int getChgmtSens() {
		return chgmt_sens;
	}

	public void setChgmtSens(int chgmt_sens) {
		this.chgmt_sens = chgmt_sens;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	

}
