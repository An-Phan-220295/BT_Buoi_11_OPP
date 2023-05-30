package bt3;

public class GroupB extends Examinee{
	private double mathScore;
	private double chemScore;
	private double bioScore;
	public GroupB(String id, String fullName, String address, int priority, String group, double mathScore, double chemScore,
			double bioScore) {
		super(id, fullName, address, priority, group);
		this.mathScore = mathScore;
		this.chemScore = chemScore;
		this.bioScore = bioScore;
	}
	public double getMathScore() {
		return mathScore;
	}
	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}
	public double getChemScore() {
		return chemScore;
	}
	public void setChemScore(double chemScore) {
		this.chemScore = chemScore;
	}
	public double getBioScore() {
		return bioScore;
	}
	public void setBioScore(double bioScore) {
		this.bioScore = bioScore;
	}
	
	

}
