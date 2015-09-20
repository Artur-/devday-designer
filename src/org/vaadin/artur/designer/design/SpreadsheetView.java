package org.vaadin.artur.designer.design;

public class SpreadsheetView extends SpreadsheetViewDesign {

	public SpreadsheetView() {
		file.addValueChangeListener(e -> {
			try {
				spreadsheet.read(getClass().getClassLoader().getResourceAsStream(file.getValue()));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
}
