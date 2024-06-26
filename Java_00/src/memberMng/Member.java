package memberMng;

public class Member {

	//회원 데이터 객체 생성
	private String memberId;	// 회원 아이디
	private String memberPw;	// 회원 비밀번호
	private String memberName;	// 회원 이름
	private String email;		// 이메일
	private String phone;		// 연락처

	//기본 생성자
	public Member() {

	}

	//매개변수를 가진 생성자
	public Member(String memberId,String memberPw, String memberName, String email,  String phone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
	}


	//GETTER/SETTER 생성
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
