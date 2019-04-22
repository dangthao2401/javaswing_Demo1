package javaswing_practice;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class demo extends JFrame  {
	
	public  demo() {
		setSize(200,150);
		setVisible(true);
		setLocation(200,500);
		JLabel label1 = new JLabel("Hello");
		add(label1);
	}
	public static void main(String[] args) {
		demo mydemo = new demo();
	}

}
;