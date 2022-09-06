package org.comp;

public class Desktop implements Hardware, Software {

	@Override
	public void softwareResources() {
		System.out.println("Resource:Software");
}
	@Override
	public void hardwareResources() {
		System.out.println("Resource:Hardware");
	}
	public void desktopModel() {
		System.out.println("Model:Desktop");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
		
		Hardware h = new Desktop();
		h.hardwareResources();
		
		Software s = new Desktop();
		s.softwareResources();
	}
}
