package bt2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QLCB implements ChucNangQLCB{
	private List<CanBo> list;
	
	public QLCB() {
		list = new ArrayList<CanBo>();
	}

	@Override
	public void themCanBo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("1. Thêm cán bộ.");
			System.out.println("2. Thêm kỹ sư.");
			System.out.println("3. Thêm công nhân.");
			System.out.println("4. Thêm nhân viên.");
			System.out.println("5. Thoát.");
			menu = inputIntegerNumber(1, 5, "");
			
			switch (menu) {
			case 1:
				CanBo canBo = new CanBo();
				canBo.add();
				list.add(canBo);
				break;
			case 2:
				CanBo kySu = new KySu();
				kySu.add();
				list.add(kySu);
				break;
			case 3:
				CanBo congNhan = new CongNhan();
				congNhan.add();
				list.add(congNhan);
				break;
			case 4:
				CanBo nhanVien = new NhanVien();
				nhanVien.add();
				list.add(nhanVien);
				break;

			default:
				break;
			}
		} while (menu != 5);
		System.out.println(list.size());
	}

	@Override
	public void timKiemTheoTen() {
		// TODO Auto-generated method stub
		int menu = 0;
		do {
			System.out.println("1. Tìm cán bộ.");
			System.out.println("2. Thoát.");
			menu = inputIntegerNumber(1, 2, "");
			
			switch (menu) {
			case 1:
				String name1 = fillingRequesst("Vui lòng nhập họ tên CB cần tìm: ");
				int temp = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name1)) {
						System.out.println(list.get(i).toString());
						temp++;
						}
				}
				if (temp == 0)
					System.out.print("Khng tìm thấy cán bộ có tên "+ name1);
				break;

			default:
				break;
			}
		} while (menu != 2);
	}

	@Override
	public void hienThiCanBo() {
		// TODO Auto-generated method stub
		//foreach: tự duyệt từng phần tử của mảng hoặc list, tới khi duyệt hết thì tự thoát khỏi vòng lặp.
		//Cú pháp: for(Kiểu_dữ_liệu tenbien : list_muốn_duyệt)
		for (CanBo canBo : list) {
			System.out.println(canBo.toString());
		}
	}
	@Override
	public void thoatKhoiChuongTrinh() {
		// TODO Auto-generated method stub
		System.exit(0);	
	}

	@Override
	public void menuQLCB() {
		// TODO Auto-generated method stub
		System.out.println("1. Thêm mới cán bộ.");
		System.out.println("2. Tìm kiếm theo họ tên.");
		System.out.println("3. Hiện thị thông tin về danh sách các cán bộ.");
		System.out.println("4. Xóa cán bộ theo tên và tuổi.");
		System.out.println("0. Thoát khỏi chương trình.");
	}
	public int inputIntegerNumber(int lowerLimit,int upperLimit, String Text) {
		Scanner scan = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.print(Text);
				number = scan.nextInt();
				while (number < lowerLimit || number > upperLimit) {
					System.out.println("Vui lòng nhập một số nguyên trong khoản "+ lowerLimit+" đến "+upperLimit);
					number = scan.nextInt();
				}
				break;
			} catch (InputMismatchException mme) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập một số nguyên.");
				scan.nextLine();
			}
		}
		return number;
	}
	public String genderRequest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập giới tính(nam, nữ hoặc khác): ");
		String gender = "";
		do {
			gender =sc.next();
			gender = gender.toLowerCase();
			if (!gender.equals("nam") && !gender.equals("nữ") && !gender.equals("khác"))
				System.out.println("Vui lòng nhập lại thông tin chính xác là nam, nữ hoặc khác.");
				sc.nextLine();
		} while (!gender.equals("nam") && !gender.equals("nữ") && !gender.equals("khác"));
		return gender;
	}
	public String fillingRequesst(String announcement) {
		Scanner sc = new Scanner(System.in);
		System.out.print(announcement);
		String text = sc.nextLine();
		while(text.isEmpty()){
			System.out.println("Vui lòng không bỏ trống.");
			text = sc.nextLine();
		}
		return text;
	}

	@Override
	public void delete() {
		int menu = 0;
		do {
			System.out.println("1. Xóa cán bộ.");
			System.out.println("2. Thoát.");
			menu = inputIntegerNumber(1, 2, "");
			
			switch (menu) {
			case 1:
				String deleteName = fillingRequesst("Vui lòng nhập tên cán bộ cần xóa: ");
				int deleteAge = inputIntegerNumber(0, 100, "Vui lòng nhập tuổi cán bộ cần xóa: ");
				int temp = 0;
				
				for (CanBo canBo : list) {
					if (canBo.getName().equals(deleteName) && canBo.getAge() == deleteAge ) {
						list.remove(canBo);
						temp++;
						}
				}
				if (temp == 0)
					System.out.print("Không tìm cán bộ.");
				break;

			default:
				break;
			}
		} while (menu != 2);
	}
}