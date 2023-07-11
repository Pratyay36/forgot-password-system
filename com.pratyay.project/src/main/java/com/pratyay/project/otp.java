package com.pratyay.project;

import java.util.Random;

public class otp {
	public static String generateotp(int otplength) {
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<otplength;i++) {
			sb.append(random.nextInt(10));
		}
		String otp=sb.toString();
		return otp;
	}
}
