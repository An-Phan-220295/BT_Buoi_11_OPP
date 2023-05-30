package bt3;

public class GroupA extends Examinee{
	private double mathScore;
	private double physScore;
	private double chemScore;
	public GroupA(String id, String fullName, String address, int priority, String group, double mathScore, double physScore,
			double chemScore) {
		super(id, fullName, address, priority,group);
		this.mathScore = mathScore;
		this.physScore = physScore;
		this.chemScore = chemScore;
	}
	public double getMathScore() {
		return mathScore;
	}
	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}
	public double getPhysScore() {
		return physScore;
	}
	public void setPhysScore(double physScore) {
		this.physScore = physScore;
	}
	public double getChemScore() {
		return chemScore;
	}
	public void setChemScore(double chemScore) {
		this.chemScore = chemScore;
	}
	
}
