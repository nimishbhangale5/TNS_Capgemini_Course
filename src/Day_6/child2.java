package Day_6;

class child1 {
	
	void disp() {
		System.out.println("I am in child 1 ");
	}
	
	class child2 extends child1 {
		void disp() {
			System.out.println("I am from child 2 ");
		}
	}
	
	class child3 extends child2 {
		void disp() {
			System.out.println("I a fr.om child 3 ");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

		}
		
	}

}
