package collection.recruit.repo;

import java.util.ArrayList;
import java.util.Iterator;

import collection.recruit.vo.Recruitment;


public class RecruitmentRepository {

	private ArrayList<Recruitment> db = new ArrayList<Recruitment>();
	private int sequence = 100;
	
	// 구직신청을 등록하고, 구직신청 번호를 반환한다.
	public int addRecuitment(Recruitment recruitment) {
		recruitment.setNo(sequence++);
		db.add(recruitment);
		return sequence - 1;
	}
	
	// 나의 구직신청 현황 조회하기
	public Recruitment getRecruitmentByNo(int recruitmentNo) {
		for (Recruitment recruitment : db ) {
			if (recruitment.getNo() == recruitmentNo) {
				return recruitment;
			}
		}
		return null;
	}
	
	// 나의 구직신청 삭제하기
	public void deleteRecruitmentByNo(int recruitmentNo) {
		Iterator<Recruitment> rec =  db.iterator();
		while (rec.hasNext()) {
			Recruitment delResume = rec.next();
			if(recruitmentNo == delResume.getNo()) {
				rec.remove();
			}
		}
		
	}
	
	// 전체 구직현황 조회하기
	public ArrayList<Recruitment> getAllRecruitments() {
		System.out.println("### 채용신청서 조회");
		for (Recruitment recruitment : db) {
			if(recruitment!=null) {
				recruitment.getResume().getName();
				recruitment.getResume().getTel();
				recruitment.getResume().getDept();
				System.out.println("----------------------");
				System.out.println("이      름 : " + recruitment.getResume().getName());
				System.out.println("전화번호 : " + recruitment.getResume().getTel());
				System.out.println("지원부서 : " + recruitment.getResume().getDept());
				System.out.println("----------------------");
			}
		}
		return db;
	}
}