package com.visitor.visitor;

import com.visitor.element.Student;
import com.visitor.element.Teacher;

public class ExcellenceAwardCheck implements AwardCheck {

	@Override
	public void visit(Teacher teacher) {
		if (teacher.getFeedbackScore() >= 90) {
			System.out.println("该教师可以评选成绩优秀奖");
		}else {
			System.out.println("该教师不可以评选成绩优秀奖");
		}
	}

	@Override
	public void visit(Student student) {
		if (student.getScore() >= 90) {
			System.out.println("该学生可以评选成绩优秀奖");
		}else {
			System.out.println("该学生不可以评选成绩优秀奖");
		}
	}

}
