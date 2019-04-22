package javaswing_practice;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {
	public  LabelDemo() {
		setSize(200,150);
		setLocation(200,500);
		JLabel label1 = new JLabel("Hello Label");
		label1.setText("Nhat");
		label1.setToolTipText("Dung a lam gi");
		add(label1);
	}
	public static void main(String[] args) {
		LabelDemo mylabel = new LabelDemo();
		mylabel.setVisible(true);
	}
}
