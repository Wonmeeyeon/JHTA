package collection.recruit.service;

import java.util.ArrayList;

import collection.recruit.repo.RecruitmentRepository;
import collection.recruit.vo.Career;
import collection.recruit.vo.Recruitment;
import collection.recruit.vo.Resume;

public class RecruitmentService {

	private RecruitmentRepository repo = new RecruitmentRepository();
	
	// 이력서 등록기능
	public void addNewResume(Resume resume) {
		// 구직신청객체 생성
		// 구직신청객체에 전달받은 이력서 객체 저장
		// 레포지토리객체를 사용해서 db에 저장하고, 자신의 구직신청번호를 반환받는다.
		// 구직신청번호를 출력한다.
		Recruitment recruitment = new Recruitment();
		recruitment.setResume(resume);
		
		int no = repo.addRecuitment(recruitment);
		System.out.println("구직신청 번호: " + no);
	}
	
	// 경력사항 등록기능
	public void addCareer(int recruitmentNo, Career career) {
		Recruitment recruitment = repo.getRecruitmentByNo(recruitmentNo);
		if (recruitment == null) {
			System.out.println("구직번호가 존재하지 않습니다.");
			return;
		}
		recruitment.addCareer(career);

		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 구직신청객체의 경력사항에 전달받은 경력사항객체를 추가한다.
	}
	
	// 구직신청 상태 조회 기능
	public void printRecruitmentDetail(int recruitmentNo) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회해서 화면에 출력한다. 
		// 신청번호, 이름 , 전화번호 , 지원부서, 합격여부
		// 회사, 부서, 직위, 년수
		Recruitment recruitment = repo.getRecruitmentByNo(recruitmentNo); 
		if (recruitment == null) {
			System.out.println("구직번호가 존재하지 않습니다.");
			return;
		}
				
		print(recruitment);
	}
	
	// 이력서 수정 기능
	public void updateResume(int recruitmentNo, Resume newResume) {
		Recruitment recruitment = repo.getRecruitmentByNo(recruitmentNo); 
		if (recruitment == null) {
			System.out.println("구직번호가 존재하지 않습니다.");
			return;
		}
		recruitment.setResume(newResume);
		
		
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 구직신청객체의 이력서정보를 전달받은 이력서 정보로 교체한다.
	}
	
	// 구직신청 삭제하기
	public void deleteRecruitment(int recruitmentNo) {
		Recruitment recruitment = repo.getRecruitmentByNo(recruitmentNo); 
		if (recruitment == null) {
			System.out.println("구직번호가 존재하지 않습니다.");
			return;
		}
		repo.deleteRecruitmentByNo(recruitmentNo);
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 삭제한다.
	}
	
	// 전체 구직신청정보 간단 조회
	public void printAllRecruitment() {
		repo.getAllRecruitments();
		// 레포지토리에서 모든 구직신청 정보를 조회해서 화면에 출력한다.
	}
	
	// 구직신청 심사하기
	public void checkRecruitment(int recruitmentNo, boolean passed) {
		Recruitment recruitment = repo.getRecruitmentByNo(recruitmentNo);
		recruitment.setPassed(passed);
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 합격/불합격여부를 결정한다.
	}
	private void print(Recruitment recruitment) {
		
		System.out.println("구직신청번호 : " + recruitment.getNo());
		System.out.println("합격 여부: " + recruitment.isPassed());
		
		Resume resume = recruitment.getResume();
		System.out.println("이름      : " + resume.getName());
		System.out.println("전화번호: " + resume.getTel());
		System.out.println("지원부서: " + resume.getDept());
		ArrayList<Career> careers = recruitment.getCareer();
		System.out.println("### 경력사항");
		for (Career career : careers) {
			System.out.println("재직회사: " + career.getCompanyName());
			System.out.println("재직파트: " + career.getDept());
			System.out.println("최종직급: " + career.getPosition());
			System.out.println("재직년수: " + career.getYear());
		}
		
	}
}