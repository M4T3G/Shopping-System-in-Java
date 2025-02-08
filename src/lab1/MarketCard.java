package lab1;

public class MarketCard {
	private int cardNo;
	private double points;
	public MarketCard(int cardNo) {
		this.cardNo = cardNo;
	}
	
	public void addPoints(double point) {
		this.points+=point*0.1;
	}

	public double getPoints() {
		return points;
	}
	
	
}