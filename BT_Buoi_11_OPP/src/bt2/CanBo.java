package bt2;

public class CanBo {
	private String name;
	private int age;
	private String gender;
	private String address;
	
	public void add() {
		ChucNangQLCB temp = new QLCB();
		name = temp.fillingRequesst("Vui lòng nhập họ tên CB: ");
		
		age = temp.inputIntegerNumber(0, 1000,"Vui lòng nhập tuổi CB: ");
		
		gender = temp.genderRequest();
		
		address = temp.fillingRequesst("Vui lòng nhập địa chỉ CB: ");
	}
	public CanBo(String name, int age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public CanBo() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CanBo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
}
