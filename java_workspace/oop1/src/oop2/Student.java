package oop2;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotalScore( ) {
		return kor+eng+math;
	}
	int getAverage() {
		int totalScore = getTotalScore();
		return totalScore/3;
	}
	void displayStudentInfo() {
		System.out.println("--------- 학생정보 ---------");
		System.out.println("학생이름: " + name);
		System.out.println("	반: " + ban);
		System.out.println("번      호: " + no);
		System.out.println("국점점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총      점: " + getTotalScore());
		System.out.println("평      균: " + getAverage());
		System.out.println("-------------------------");
	}
	
	void displayStudentInForRow() {
		System.out.print(name+"\t");
		System.out.print(ban+"\t");
		System.out.print(no+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(math+"\t");
		System.out.print(getTotalScore()+"\t");
		System.out.println(getAverage()+"\t");
	}

}
