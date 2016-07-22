package com.example.Demo.client;

import com.example.Demo.client.Login.LoginPlace;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort;
import com.googlecode.mgwt.ui.client.widget.animation.AnimationWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DemoExample implements EntryPoint {
	public static final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	public static PhoneGap phoneGap = GWT.create(PhoneGap.class);
	public static ClientFactory clientFactory = new ClientFactoryImpl();

	public void onModuleLoad() {
		phoneGap.addHandler(new PhoneGapAvailableHandler() {
			@Override
			public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
				startApp();
			}
		});

		phoneGap.addHandler(new PhoneGapTimeoutHandler() {
			@Override
			public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
			}
		});

		phoneGap.initializePhoneGap();

	}

	private void startApp() {
		ViewPort viewPort = new MGWTSettings.ViewPort();
		MGWTSettings settings = new MGWTSettings();
		settings.setViewPort(viewPort);
		viewPort.setUserScaleAble(false).setMinimumScale(1.0).setMinimumScale(1.0).setMaximumScale(1.0);
		settings.setFullscreen(true);
		settings.setPreventScrolling(true);
		settings.setViewPort(viewPort);
		MGWT.applySettings(settings);
		createDisplay(clientFactory);
	}

	private void createDisplay(ClientFactory clientFactory) {
		AnimationWidget display = new AnimationWidget();
		PhoneActivityMapper activityMapper = new PhoneActivityMapper(clientFactory);
		PhoneAnimationMapper animationMapper = new PhoneAnimationMapper();
		AnimatingActivityManager activityManager = new AnimatingActivityManager(activityMapper, animationMapper,
				clientFactory.getEventBus());
		activityManager.setDisplay(display);
		display.setStyleName("xxx", true);
		RootPanel.get().add(display);

		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(clientFactory.getPlaceController(), clientFactory.getEventBus(), new LoginPlace());
		historyHandler.handleCurrentHistory();

	}
}
