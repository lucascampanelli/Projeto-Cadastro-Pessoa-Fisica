package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;

public class Editar extends JFrame{
	
	 public Editar(){
		 super("Editar");
		 this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		 this.setSize(900, 330);
		 this.setLocationRelativeTo(null);
		 this.setVisible(true);
	 }
}
