import java.util.ArrayList;
import java.util.List;


public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String state;
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(getState());
		}
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}
