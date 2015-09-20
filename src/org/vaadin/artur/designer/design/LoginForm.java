package org.vaadin.artur.designer.design;

import com.vaadin.ui.Notification;

public class LoginForm extends LoginFormDesign {

	public LoginForm() {
		super();

		// Add logic
		signIn.addClickListener(e -> {
			Notification.show(
					"Successfully logged in as " + email.getValue() + " using password " + password.getValue());
		});

	}
}
