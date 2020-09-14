package demo3;

public class ScoreGradeDemo {
	
	public static void main(String[] args) {
		ScoreGrade grade1 = ScoreGrade.A;
		ScoreGrade grade2 = ScoreGrade.B;
		
		System.out.println(grade1.name() +"최저점수: " + grade1.getlow() + " 최고점수: "+ grade1.gethigh() );
		System.out.println(grade2.name() +"최저점수: " + grade2.getlow() + " 최고점수: "+ grade2.gethigh() );
		
		
		
	}

}
