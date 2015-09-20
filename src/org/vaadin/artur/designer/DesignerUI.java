package org.vaadin.artur.designer;

import javax.servlet.annotation.WebServlet;

import org.vaadin.artur.designer.design.SpreadsheetView;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("designer")
@Widgetset("org.vaadin.artur.designer.widgetset.DesignerWidgetset")
public class DesignerUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DesignerUI.class, widgetset = "org.vaadin.artur.designer.widgetset.DesignerWidgetset")
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

//		layout.addComponent(new LoginForm());
//		Window w = new Window("", new LoginForm());
//		w.center();
//		addWindow(w);

//		setContent(new AddressBookMain());
		
		setContent(new SpreadsheetView());
	}

}