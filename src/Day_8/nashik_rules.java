package Day_8;

class rules {
	int maxspeed = 60;
}

class seltos extends rules {
	int maxspeed = 170;
	void disp() {
		System.out.println("speed is " + super.maxspeed);
	}
}

public class nashik_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seltos obj = new seltos();
		obj.disp();

	}

}
