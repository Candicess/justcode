package com.visitor.visitor;

import com.visitor.element.Student;
import com.visitor.element.Teacher;

public class ScientificAwardCheck implements AwardCheck {

	// 判断该teacher是否满足要求
	@Override
	public void visit(Teacher teacher) {
		if (teacher.getPaperAmount() > 10) {
			System.out.println("该教师可以评选科研奖");
		}else {
			System.out.println("该教师不可以评选科研奖");
		}
	}

	// 判断该student是否满足要求
	@Override
	public void visit(Student student) {
		if (student.getPaperAmount() > 2) {
			System.out.println("该学生可以评选科研奖");
		}else {
			System.out.println("该学生不可以评选科研奖");
		}
	}

}
