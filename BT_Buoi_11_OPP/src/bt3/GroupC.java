package bt3;

public class GroupC extends Examinee{
	private double literaScore;
	private double hisScore;
	private double geoScore;
	public GroupC(String id, String fullName, String address, int priority,String group , double literaScore, double hisScore,
			double geoScore) {
		super(id, fullName, address, priority, group);
		this.literaScore = literaScore;
		this.hisScore = hisScore;
		this.geoScore = geoScore;
	}
	public double getLiteraScore() {
		return literaScore;
	}
	public void setLiteraScore(double literaScore) {
		this.literaScore = literaScore;
	}
	public double getHisScore() {
		return hisScore;
	}
	public void setHisScore(double hisScore) {
		this.hisScore = hisScore;
	}
	public double getGeoScore() {
		return geoScore;
	}
	public void setGeoScore(double geoScore) {
		this.geoScore = geoScore;
	}
	

}
