package bt2;

import java.util.Scanner;

public class MainBT2 {
	public static void main(String[] args) {
//		QLCB qlcb = new QLCB();
//		qlcb.themCanBo();
//		CanBo canBo =new CanBo();
//		//instanceof: dùng để kiểm tra phuhongw thức khởi tạo của biến là gì
//		if (canBo instanceof CanBo)
//			System.out.println("làm gì đó");
//		else if(canBo instanceof KySu)
//			((KySu) canBo).getMajor();
		
		Scanner sc = new Scanner(System.in);
		ChucNangQLCB chucNang = new QLCB();	
		
		while(true)
		{
			chucNang.menuQLCB();
			int num = chucNang.inputIntegerNumber(0, 4, "Vui lòng lựa chọn chức năng:");
		
			switch (num) {
			case 1:
				chucNang.themCanBo();
				break;
			case 2:
				chucNang.timKiemTheoTen();
				break;
			case 3:
				chucNang.hienThiCanBo();
				break;
			case 4:
				chucNang.delete();
				break;
			case 0:
				chucNang.thoatKhoiChuongTrinh();
				break;

			default:
				break;
			}
		}
	}
}
