package com.zpkj.project4;

public class CurrentConditionsDisplay implements ObserverInter,DisplayElementInter{
	
	private SubjectInter weatherData;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public CurrentConditionsDisplay(SubjectInter subjectInter){
		super();
		this.weatherData = subjectInter;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("气温:"+temperature+" 湿度:"+humidity+" 压力:"+pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
