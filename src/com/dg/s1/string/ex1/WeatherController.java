package com.dg.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
		
	}
	
	public void start() {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
				
		WeatherDTO [] weathers = weatherInfo.makeWeather();
		
		while(check) {
			System.out.println("번호를 눌러주세요");
			System.out.println("1. 날씨정보전체출력");
			System.out.println("2. 지역검색정보출력");
			System.out.println("3. 지역정보추가");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			
			
			
			switch(select) {			
			case 1 :
				System.out.println("날씨정보전체출력");
				weatherView.view(weathers);
				break;
				
			case 2 :
				System.out.println("지역검색정보출력");
				WeatherDTO weatherDTO = this.weatherInfo.SearchWeather(weathers);
				if(weatherDTO != null) {
					this.weatherView.viewOne(weatherDTO);
				} else {
					this.weatherView.view("정보가 없어요");
				}
				
				
				break;
				
			case 3 :
				System.out.println("지역정보추가");
				break;
				
			case 4 :
				System.out.println("종료합니다.");
				check = !check;
			
			}
						
		}
				
		System.out.println("Finish");
	}

}
