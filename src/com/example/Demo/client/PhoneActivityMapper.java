package com.example.Demo.client;

import org.eclipse.jdt.core.compiler.IScanner;

import com.example.Demo.client.Login.LoginActivity;
import com.example.Demo.client.Login.LoginPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class PhoneActivityMapper implements ActivityMapper{
	private ClientFactory clientFactory;
	
	public PhoneActivityMapper(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
//		if(place instanceof ApplicationPlace){
//			return new ApplicationActivity(clientFactory, place);
//		}
		if(place instanceof LoginPlace){
			return new LoginActivity(clientFactory, place);
		}
		return null;
	}
}
