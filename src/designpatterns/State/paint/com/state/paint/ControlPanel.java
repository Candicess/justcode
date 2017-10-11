package com.state.paint;

public class ControlPanel {
	
	private State state;
	
	public ControlPanel() {
	}

	public ControlPanel(State state) {
		this.state = state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void draw(){
		state.draw();
	}

}
