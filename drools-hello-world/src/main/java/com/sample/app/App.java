package com.sample.app;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.app.model.Student;

public class App {

	public static void main(String args[]) {
		System.out.println("Bootstrapping the Rule Engine ...");

		// Get a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession();

		Student stud1 = new Student(1, "Krishna", 59, true);
		Student stud2 = new Student(2, "Ram", 61, true);
		Student stud3 = new Student(3, "Chamu", 79, true);

		// Provide information to the Rule Engine Context
		kSession.insert(stud1);
		kSession.insert(stud2);
		kSession.insert(stud3);

		// Execute the rules that are matching
		int fired = kSession.fireAllRules();

		System.out.println("Number of Rules executed = " + fired);
		System.out.println("Name : " + stud1.getName() + ", Grade: " + stud1.getGrade());
		System.out.println("Name : " + stud2.getName() + ", Grade: " + stud2.getGrade());
		System.out.println("Name : " + stud3.getName() + ", Grade: " + stud3.getGrade());

	}

}
