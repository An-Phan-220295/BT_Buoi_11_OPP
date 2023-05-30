package bt3;

public class Examinee {
	private String id;
	private String fullName;
	private String address;
	private int priority;
	private String group;
	public Examinee(String id, String fullName, String address, int priority,String group ) {
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.priority = priority;
		this.group = group;
	}
	public Examinee() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Examinee [id=" + id + ", fullName=" + fullName + ", address=" + address + ", priority=" + priority
				+ ", group=" + group.toUpperCase() + "]";
	}
	
	
}
