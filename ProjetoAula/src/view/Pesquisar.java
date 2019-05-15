package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;

import java.awt.Container;
import java.awt.event.ActionEvent;

public class Pesquisar extends JFrame{
	
	String[] coluna = {"Nome", "Cidade", "Estado", "Bairro", "Endereço", "CEP", "Telefone", "Celular", "RG", "CPF", "Sexo"};
	String[][] dados = {{"Eduardo Jorge", "Salvador", "Bahia", "Caititu", "Rua dos Alverais 15", "1596787", "(21)2054-9877", "(21)85667-8754", "54.587.456.7", "425.654.789-52", "Masculino"}, {"Gustavo Neres", "Caetité", "Bahia", "Amoreiras", "Rua Setenta", "1746783", "(23)2132-7854", "(23)85658-6432", "85.125.548.1", "070.632.777-80", "Masculino"}, {"Tarcísio Araújo", "Mutuípe", "Bahia", "Vilas Boas", "Rua das Novas Vilas", "2184787", "(23)2172-8974", "(23)84167-7552", "43.587.878.3", "080.677.745-53", "Masculino"}, {"Rafael", "Campinas", "São Paulo", "Vila Novo Império", "Rua das Nogueiras", "1784642", "(11)3124-8741", "(11)98533-7711", "62.782.454.1", "241.742.214-32", "Masculino"}};
	
	private JTable listEstados = new JTable(dados, coluna);
	private JScrollPane scrollpane = new JScrollPane(listEstados);
	
	 public Pesquisar(){
		 super("Pesquisar");
		 
		 Container paine = this.getContentPane();
		 paine.add(scrollpane);
		 scrollpane.setBounds(0, 0, 600, 330);
		 
		 this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		 this.setSize(900, 330);
		 this.setLocationRelativeTo(null);
		 this.setVisible(true);
	 }
	 
}
