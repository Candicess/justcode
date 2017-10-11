
public class Main {

	public static void main(String[] args) {
		
		Observer ob1 = new ConcreteObserver("ob1");
		Observer ob2 = new ConcreteObserver("ob2");
		Observer ob3 = new ConcreteObserver("ob3");
		
		Subject subject = new Subject();
		subject.attach(ob1);
		subject.attach(ob2);
		subject.attach(ob3);
		
		subject.setState("new state");
		subject.notifyObservers();
		
	}

}
