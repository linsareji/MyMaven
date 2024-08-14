package inheritance;

public class MutltilevelChild extends MultilevelParent{

	public void mul()
	{
		int m=a*b;
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutltilevelChild obj=new MutltilevelChild();
		obj.sub();
		obj.mul();
		obj.display();

	}

}
