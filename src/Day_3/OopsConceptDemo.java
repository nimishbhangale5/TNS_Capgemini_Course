package Day_3;

public class OopsConceptDemo {
	int SerialNum;
	String Name;
	int Age;
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "OopsConceptDemo [SerialNum= " + SerialNum + ", Name= " + Name + ", Age= " + Age + "]";
	}
	

}
