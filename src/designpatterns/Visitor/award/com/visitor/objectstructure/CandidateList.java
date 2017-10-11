package com.visitor.objectstructure;

import java.util.ArrayList;
import java.util.List;

import com.visitor.element.Person;
import com.visitor.visitor.AwardCheck;

public class CandidateList {
	
	List<Person> list = new ArrayList<Person>();
	
	public void accept(AwardCheck check){
		for (Person person : list) {
			person.accept(check);
		}
	}
	
	public void addPerson(Person person){
		list.add(person);
	}
	
	public void removePerson(Person person){
		list.remove(person);
	}

}
