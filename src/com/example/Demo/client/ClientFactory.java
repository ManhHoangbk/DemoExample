package com.example.Demo.client;

import com.example.Demo.client.Login.LoginView;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory {

	PlaceController getPlaceController();
	EventBus getEventBus();
	LoginView getLoginView();
}
