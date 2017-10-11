package com.visitor.main;

import com.visitor.element.Person;
import com.visitor.element.Student;
import com.visitor.element.Teacher;
import com.visitor.objectstructure.CandidateList;
import com.visitor.visitor.AwardCheck;
import com.visitor.visitor.ExcellenceAwardCheck;
import com.visitor.visitor.ScientificAwardCheck;

public class Main {

	public static void main(String[] args) {

		// 定义 ObjectStructure
		CandidateList candidateList = new CandidateList();
		
		// 定义 Element
		Person teacher = new Teacher();
		Person student = new Student();
		((Teacher)teacher).setPaperAmount(9);
		((Teacher)teacher).setFeedbackScore(95);
		((Student)student).setPaperAmount(3);
		((Student)student).setScore(88);
		
		// 将 Element 加入对象结构中
		candidateList.addPerson(teacher);
		candidateList.addPerson(student);
		
		// 定义 Visitor
		AwardCheck check = null;
		
		check = new ScientificAwardCheck();
		candidateList.accept(check);
		
		check = new ExcellenceAwardCheck();
		candidateList.accept(check);
		
	}

}
