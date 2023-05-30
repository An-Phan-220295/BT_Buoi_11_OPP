package bt2;

import java.util.Scanner;

public class KySu extends CanBo{
	private String major;
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		super.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ngành đào tạo: ");
		major = sc.nextLine();
	}
	public KySu(String name, int age, String gender, String address, String major) {
		super(name, age, gender, address);
		this.major = major;
	}
	public KySu() {}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
