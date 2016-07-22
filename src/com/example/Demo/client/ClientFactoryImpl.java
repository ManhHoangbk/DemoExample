package com.example.Demo.client;

import com.example.Demo.client.Login.LoginView;
import com.example.Demo.client.Login.LoginViewImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public  class ClientFactoryImpl implements ClientFactory {
	private SimpleEventBus eventBus;
	private PlaceController placeController;
	private LoginView loginView;
	public ClientFactoryImpl (){
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
	}
	
	@Override
	public PlaceController getPlaceController(){
		return placeController;
	}
	
	public EventBus getEventBus(){
		return eventBus;
	}

	@Override
	public LoginView getLoginView() {
		if(loginView==null){
			loginView=new LoginViewImpl();
		}
		return loginView;
	}
	
}
