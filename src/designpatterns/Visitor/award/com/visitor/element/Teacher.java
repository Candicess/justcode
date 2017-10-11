package com.visitor.element;

import com.visitor.visitor.AwardCheck;

public class Teacher implements Person {
	
	private int paperAmount;
	private double feedbackScore;

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

	public double getFeedbackScore() {
		return feedbackScore;
	}

	public void setFeedbackScore(double feedbackScore) {
		this.feedbackScore = feedbackScore;
	}
	
}
