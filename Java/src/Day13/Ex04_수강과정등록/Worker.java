package Day13.Ex04_수강과정등록;

public class Worker extends Person{

	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker ["+ getName() + "]";
	}
	

}
