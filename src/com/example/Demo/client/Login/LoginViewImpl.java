package com.example.Demo.client.Login;

import com.example.Demo.client.Basic.BasicViewImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class LoginViewImpl extends BasicViewImpl implements LoginView {

	private static LoginViewImplUiBinder uiBinder = GWT.create(LoginViewImplUiBinder.class);

	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {
	}

	public LoginViewImpl() {
		this.layout.getFlowPanel().add(uiBinder.createAndBindUi(this));
		Button button=new Button("asdda");
		this.layout.getHeaderPanel().add(button);
		this.layout.getFlowPanel().add(button);
	}


}
