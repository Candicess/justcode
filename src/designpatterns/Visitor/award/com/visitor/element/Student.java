package com.visitor.element;

import com.visitor.visitor.AwardCheck;

public class Student implements Person {
	
	private int paperAmount;
	private double score;

	@Override
	public void accept(AwardCheck check) {
		check.visit(this);
	}

	public int getPaperAmount() {
		return paperAmount;
	}

	public void setPaperAmount(int paperAmount) {
		this.paperAmount = paperAmount;
	}

	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
