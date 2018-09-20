package com.zpkj.project;

import java.util.ArrayList;
import java.util.List;

public class Wechat implements SubjectInter{
	
	private List<ObserverInter> observerInter;
	
	private String message;
	
	public Wechat() {
		observerInter = new ArrayList<ObserverInter>();
	}

	@Override
	public void registerObserver(ObserverInter o) {
		observerInter.add(o);
	}
	
	@Override
	public void removeObserver(ObserverInter o) {
		if(observerInter.contains(o)){
			observerInter.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i=0;i<observerInter.size();i++){
			ObserverInter o = observerInter.get(i);
			o.update(message);
		}
	}
	public void setInfomation(String msg){
		this.message = msg;
		System.out.println("微信服务更新消息");
		//消息更新,通知所有观察者
		notifyObserver();
	}

}
