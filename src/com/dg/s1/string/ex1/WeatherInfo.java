package com.dg.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {
	
	private String info;
	StringBuffer sb = new StringBuffer();
	
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
	}
	
	public WeatherDTO SearchWeather(WeatherDTO [] weathers) {			
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도시를 입력해주세요");		
		String name = sc.next();
		WeatherDTO weatherDTO =null;
		
		for(int i=0;i<weathers.length;i++) {
			if(name.equals(weathers[i].getCity())){
				weatherDTO = weathers[i];
				break;
			}
		}
		
		return weatherDTO;
		
	}
	
	public WeatherDTO [] makeWeather() {
		//StringBuffer에 있는 Data를 String으로 변환
		
		info = sb.toString();
		System.out.println(info);
		
		//파싱(parsing, 문자열을 자르는 작업)
		String [] strings = info.split(",");
		//System.out.println(strings.length);
		WeatherDTO [] weathers = new WeatherDTO[strings.length/4];
		int j=-1;
		
		for(int i=0;i<weathers.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();	
			weatherDTO.setCity(strings[++j].trim());
			weatherDTO.setTemp(strings[++j].trim());
			weatherDTO.setHum(strings[++j].trim());
			weatherDTO.setState(strings[++j].trim());
			weathers[i] = weatherDTO;			
		}
	
		return weathers;
		
	}
	
}
