package bt3;
import bt2.ChucNangQLCB;
import bt2.QLCB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admission implements ExamnineeManage{
	private List<Examinee> listExaminee;

	public Admission() {
		listExaminee = new ArrayList<Examinee>();
	}
	@Override
	public void addExaminee() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ChucNangQLCB temp = new QLCB();
		int menu = 0;
		do {
			System.out.println("1. Thêm thí sinh.");
			System.out.println("2. Thoát.");
			menu = temp.inputIntegerNumber(1, 2, "");
			
			switch (menu) {
			case 1:
				String id = temp.fillingRequesst("Vui lòng nhập số báo danh: ");
				
				String name = temp.fillingRequesst("Vui lòng nhập họ tên thí sinh: ");
			
				String address = temp.fillingRequesst("Vui lòng nhập địa chỉ thí sinh: ");
				
				int priority = temp.inputIntegerNumber(0, 3, "Vui lòng nhập mức ưu tiên: ");
				
				System.out.println("Vui lòng nhập khối thi(A,B,C): ");
				String group = "";
				do {
					group =sc.next();
					group = group.toLowerCase();
					if (!group.equals("a") && !group.equals("b") && !group.equals("c"))
						System.out.println("Vui lòng nhập lại thông tin chính xác là A,B hoặc C.");
						sc.nextLine();
				} while (!group.equals("a") && !group.equals("b") && !group.equals("c"));
				
				Examinee examinee = new Examinee(id,name,address, priority, group);
				this.listExaminee.add(examinee);
				
				System.out.println();
				break;

			default:
				break;
			}
		} while (menu != 2);
	}

	@Override
	public void examineeInfo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.listExaminee.size(); i++) 
			System.out.println(this.listExaminee.get(i).toString());
	}

	@Override
	public void findId() {
		// TODO Auto-generated method stub
		ChucNangQLCB temp = new QLCB();
		int menu = 0;
		do {
			System.out.println("1. Tìm thí sinh.");
			System.out.println("2. Thoát.");
			menu = temp.inputIntegerNumber(1, 2, "");
			
			switch (menu) {
			case 1:
				String id = temp.fillingRequesst("Vui lòng nhập số báo danh của thí sinh cần tìm: ");
				int count = 0;
				for (int i = 0; i < this.listExaminee.size(); i++) {
					if (this.listExaminee.get(i).getId().equals(id)) {
						System.out.println(this.listExaminee.get(i).toString());
						count++;
						}
				}
				if (count == 0)
					System.out.print("Không tìm thấy thí sinh có số báo danh "+ id);
				break;

			default:
				break;
			}
		} while (menu != 2);
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	public void menu() {
		System.out.println("1. Thêm thí sinh mới.");
		System.out.println("2. Hiển thị thông tin của các thí sinh và khối thi.");
		System.out.println("3. Tìm kiếm thông tin theo số báo danh.");
		System.out.println("Thoát.");
		
	}
	
}
