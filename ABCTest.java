
abstract public interface A {
	abstract public void disp1(); 
}

public interface B extends A  {
	public void disp2(); 
}

public class C implements B {
	public void disp1() {
		System.out.println("This is class A");
	}
	public void disp2() {
		System.out.println("This is class B");
	}
	
	public void disp3() {
		System.out.println("This is class C");
	}
}

public class ABCTest {
	public static void main(String args[]) {
		C c = new C();
		c.disp1();
		c.disp2();
		c.disp3();
	}
}
