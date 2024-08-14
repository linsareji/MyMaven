package superKeyword;

public class DogMethod extends AnimalMethod{
	public void display() {
		System.out.println("Wild Animal");
		super.display();
	}
	public void print() {
		System.out.println("pet Animal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DogMethod obj=new DogMethod();
obj.display();
obj.print();
	}

}
