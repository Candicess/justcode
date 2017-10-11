package com.visitor.element;

import com.visitor.visitor.AwardCheck;

public interface Person {
	
	public void accept(AwardCheck check);

}
