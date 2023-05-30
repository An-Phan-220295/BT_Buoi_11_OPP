package bt2;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int level;
	
	@Override
	public void add() {
		super.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cấp bậc: ");
		level = sc.nextInt();
		sc.nextLine();
	}
	
	public CongNhan() {}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
