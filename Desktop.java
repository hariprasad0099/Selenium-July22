package org.system;


public class Desktop extends Computer {
	public void deskSize() {
		System.out.println("The size of the desktop is large");
	}
	public static void main(String[] args) {
		Computer myMode = new Computer();
		Desktop mySize = new Desktop();
		 myMode.computerModel();
		 mySize.deskSize();
		
	}
	
	
	
}
