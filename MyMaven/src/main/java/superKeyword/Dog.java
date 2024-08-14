package superKeyword;

public class Dog extends Animal {
	String color="White";
	public  void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog obj=new Dog();
obj.print();
	}

}
