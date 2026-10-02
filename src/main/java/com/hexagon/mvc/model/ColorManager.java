package com.hexagon.mvc.model;

public class ColorManager {

	public String getAdvice(String color) {
		
		String msg = null;
		
		//out.print("유저가 전송한 색상은 " + color);

		switch (color) {
		case "red":
			msg = "하나미 사키";
			break;
		case "blue":
			msg = "츠키무라 테마리";
			break;
		case "green":
			msg = "시운 스미카";
			break;
		case "yellow":
			msg = "후지타 코토네";
			break;
		default:
			msg = "지원하지않는 아이돌입니다.";
		}
		
		return msg;
	}
}
