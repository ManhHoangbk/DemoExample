package com.example.Demo.client.Login;

import com.example.Demo.client.ClientFactory;
import com.example.Demo.client.Basic.BasicActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class LoginActivity extends BasicActivity{
	protected LoginView view;
	
	public LoginActivity(ClientFactory clientFactory, Place place) {
		super(clientFactory, place);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view = clientFactory.getLoginView();
		panel.setWidget(view);
		super.start(panel, eventBus, view);
	}

}
