package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;

public class Fechar extends JFrame{
	
	 public Fechar(){
		 super("Fechar");
		 this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		 this.setSize(300, 200);
		 this.setVisible(true);
	 }
	 
}
