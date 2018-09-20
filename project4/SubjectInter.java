package com.zpkj.project4;
/**
 * 观察者模式
 */
public interface SubjectInter {
	
	void registerObserver(ObserverInter observerInter);
	
	void removeObserver(ObserverInter observerInter);
	
	void notifyObserver();
}
