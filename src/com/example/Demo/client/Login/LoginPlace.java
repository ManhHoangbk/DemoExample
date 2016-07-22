package com.example.Demo.client.Login;

import com.example.Demo.client.Basic.BasicPlace;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LoginPlace extends BasicPlace {

	public LoginPlace(){
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<LoginPlace> {

		@Override
		public LoginPlace getPlace(String token) {
			return new LoginPlace();
		}

		@Override
		public String getToken(LoginPlace place) {
			return place.getToken();
		}

	}
}
