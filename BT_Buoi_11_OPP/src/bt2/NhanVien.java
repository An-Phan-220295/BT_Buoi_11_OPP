package bt2;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String job;
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		super.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Công việc: ");
		job = sc.nextLine();
	}

	public NhanVien(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		this.job = job;
	}
	public NhanVien() {}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
