package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	public void mul() {
		int m=a*b;
		System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild2 obj=new HierarchicalChild2();
		obj.mul();
		obj.display();
	}

}
