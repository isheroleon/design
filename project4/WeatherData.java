package com.zpkj.project4;

import java.util.ArrayList;

public class WeatherData implements SubjectInter{
	
	private ArrayList<ObserverInter> observerInters;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	
	public WeatherData() {
		super();
		observerInters  =new ArrayList<ObserverInter>();
	}
	

	@Override
	public void registerObserver(ObserverInter observerInter) {
		observerInters.add(observerInter);
		
	}

	@Override
	public void removeObserver(ObserverInter observerInter) {
		int num = observerInters.indexOf(observerInter);
		if(num>=0){
			observerInters.remove(num);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0;i < observerInters.size();i++){
			ObserverInter observerInter = observerInters.get(i);
			observerInter.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
