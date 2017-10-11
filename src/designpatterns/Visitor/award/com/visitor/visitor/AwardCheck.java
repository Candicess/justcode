package com.visitor.visitor;

import com.visitor.element.Student;
import com.visitor.element.Teacher;

public interface AwardCheck {
	
	public void visit(Teacher teacher);
	
	public void visit(Student student);
	

}
