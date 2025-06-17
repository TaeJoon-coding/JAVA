package com.javateam.jse;

import java.sql.Date;
// 日付情報を扱うため、「Date」クラスをインポート。
// 
import java.util.Objects;

public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String email;
	private String phone;
	private String zip;
	private String basicAddress;
	private String detailAddress;
	private Date joindate;
	
	public MemberVO() {
		
	}
	
	/**
	 * @param id
	 * @param pw
	 * @param name
	 * @param gender
	 * @param email
	 * @param phone
	 * @param zip
	 * @param basicAddress
	 * @param detailAddress
	 * @param joindate
	 */
	public MemberVO(String id, String pw, String name, String gender, String email, String phone, String zip,
			String basicAddress, String detailAddress, Date joindate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.zip = zip;
		this.basicAddress = basicAddress;
		this.detailAddress = detailAddress;
		this.joindate = joindate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getBasicAddress() {
		return basicAddress;
	}
	public void setBasicAddress(String basicAddress) {
		this.basicAddress = basicAddress;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", zip=" + zip + ", basicAddress=" + basicAddress + ", detailAddress="
				+ detailAddress + ", joindate=" + joindate + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(basicAddress, detailAddress, email, gender, id, joindate, name, phone, pw, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MemberVO))
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(basicAddress, other.basicAddress) && Objects.equals(detailAddress, other.detailAddress)
				&& Objects.equals(email, other.email) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(joindate, other.joindate)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
				&& Objects.equals(pw, other.pw) && Objects.equals(zip, other.zip);
	}

	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO();
		vo.setId("abcd1234");
		vo.setPw("#Abcd1234");
		vo.setName("자바맨");
		vo.setGender("남");
		vo.setEmail("abcd@abcd.com");
		vo.setPhone("01012345678");
		vo.setZip("13615");
		vo.setBasicAddress("경기도 성남시 분당구 돌마로 47");
		vo.setDetailAddress("4층 그린컴퓨터아카데미 410호");
		vo.setJoindate(Date.valueOf("2000-01-01"));
		
		MemberVO vo2 = new MemberVO();
		vo2.setId("abcd1234");
		vo2.setPw("#Abcd1234");
		vo2.setName("자바맨");
		vo2.setGender("남");
		vo2.setEmail("abcd@abcd.com");
		vo2.setPhone("01012345678");
		vo2.setZip("13615");
		vo2.setBasicAddress("경기도 성남시 분당구 돌마로 47");
		vo2.setDetailAddress("4층 그린컴퓨터아카데미 410호");
		vo2.setJoindate(Date.valueOf("2000-01-01"));
		
		System.out.println("vo : "+ vo);
		
		System.out.println(vo.equals(vo2));
		System.out.println(vo.hashCode());
		System.out.println(vo2.hashCode());
	}
	
}
