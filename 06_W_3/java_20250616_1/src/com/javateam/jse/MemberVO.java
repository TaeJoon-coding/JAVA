package com.javateam.jse;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class MemberVO {

	private String name;
	private String address;
	private Date joindate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO member = MemberVO.builder()
								  .name("abcd")
								  .address("高松市")
								  .joindate(Date.valueOf("2025-06-16"))
								  .build();
		System.out.println(member);

	}

}
