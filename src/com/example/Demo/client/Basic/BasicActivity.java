package com.example.Demo.client.Basic;

import com.example.Demo.client.ClientFactory;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

public class BasicActivity extends MGWTAbstractActivity{
	protected final ClientFactory clientFactory;
	protected EventBus eventBus;
	protected Place place = null;
	protected BasicView basicView = null;
	public BasicActivity(ClientFactory clientFactory, Place place) {
		this.clientFactory = clientFactory;
		this.place = place;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus) {
		super.start(panel, eventBus);
		this.eventBus = eventBus;
		
		
	}
	
	public void start(AcceptsOneWidget panel, final EventBus eventBus, final BasicView basicView) { 
		this.eventBus = eventBus;
		this.basicView = basicView;
		loadData();
		bind();
	}
	
	
	
	protected void loadData() {
		
	}
	protected void bind() {
		
	}
	protected void goTo(Place newPlace) {
		clientFactory.getPlaceController().goTo(newPlace);
	}
}
