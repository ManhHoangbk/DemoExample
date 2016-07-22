package com.example.Demo.client.Basic;

import com.example.Demo.client.Basic.BasicViewImpl.Layout;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public interface BasicView extends IsWidget {

	Widget asWidget();
	Layout getLayout();
}
