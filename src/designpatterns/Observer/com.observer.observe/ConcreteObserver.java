
public class ConcreteObserver implements Observer {

	private String name;
	
	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String state) {
		System.out.println("观察者 " + name +" 收到了状态 ： " + state);
	}

}
