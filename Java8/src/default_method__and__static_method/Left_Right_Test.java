package default_method__and__static_method;

public class Left_Right_Test implements Left, Right {

	@Override
	public void m1() {

		// System.out.println("My own M1 methood");

		Left.super.m1();

		// Right.super.m1();

	}

	public static void main(String[] args) {
		Left_Right_Test t = new Left_Right_Test();
		t.m1();
	}

}
