package com.dg.s1.string.ex1;

public class WeatherView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(WeatherDTO [] weathers){
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("================================");
		
		for(int i=0;i<weathers.length;i++) {
			System.out.print(weathers[i].getCity()+"\t");
			System.out.print(weathers[i].getTemp()+"\t");
			System.out.print(weathers[i].getHum()+"\t");
			System.out.println(weathers[i].getState()+"\t");
			System.out.println("------------------------------");
		}
	}
	
	public void viewOne(WeatherDTO weathers) {
		
			System.out.println("------------------------------");	 
			System.out.print(weathers.getCity()+"\t");
			System.out.print(weathers.getTemp()+"\t");
			System.out.print(weathers.getHum()+"\t");
			System.out.println(weathers.getState()+"\t");
			System.out.println("------------------------------");
		
		
	}

}
