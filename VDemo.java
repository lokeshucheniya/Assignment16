
abstract public interface Vehicle {
	abstract void start();
}

public class TwoWheeler implements Vehicle {
	public void start() {
		System.out.println("TwoWheeler is started");
	}
}

public class ThreeWheeler implements Vehicle {
	public void start() {
		System.out.println("ThreeWheeler is started");
	}
}

public class FourWheeler implements Vehicle {
	public void start() {
		System.out.println("FourWheeler is started");
	}
}


public class VDemo {
	public static void main(String args[]) {
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();
		for(int i=0;i<3;i++) {
			if(i==1) {
				vehicle[i].start();
				break;
			}
			
		}
		
	}
}
