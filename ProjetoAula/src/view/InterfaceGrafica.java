package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;

public class InterfaceGrafica extends JFrame{
	
	private JMenuItem menuItemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem menuItemExcluir = new JMenuItem("Excluir");
	private JMenuItem menuItemFechar = new JMenuItem("Fechar");
	private JMenuItem menuItemLocalizar = new JMenuItem("Pesquisar");
	private JMenuItem menuItemAtualizar = new JMenuItem("Atualizar");
	
	private JMenu menuArquivo = new JMenu("Arquivo");
	
	private JMenu menuEditar = new JMenu("Editar");
	
	private JMenuBar menuBar = new JMenuBar();
	
	public InterfaceGrafica() {
		super("MENUS"); //Atribuindo nome
		
		// adiciona os JMenuItem no JMenu
		menuArquivo.add(menuItemCadastrar);
		menuItemCadastrar.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
		public void actionPerformed(ActionEvent e) {
			PessoaFisica cadastrar = new PessoaFisica(); //Chamando a classe cadastrar
			}
		});
		
		menuArquivo.add(menuItemExcluir);
		menuItemExcluir.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
		public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir(); //Chamando a classe excluir
			}
		});
		
		menuArquivo.add(menuItemLocalizar);
		menuItemLocalizar.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
		public void actionPerformed(ActionEvent e) {
				Pesquisar pesquisar = new Pesquisar(); //Chamando a classe pesquisar
			}
		});
		
		menuArquivo.add(menuItemFechar);
		menuItemFechar.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
			public void actionPerformed(ActionEvent e) {
				System.exit(2); //Fechando o JFRAME
				}
			});

		menuEditar.addSeparator();
		menuEditar.add(menuItemAtualizar);
		menuItemAtualizar.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
			public void actionPerformed(ActionEvent e) {
					Atualizar atualizar = new Atualizar(); //Chamando a classe atualizar
				}
			});
		
		//Adiciona o JMenu no JMenuBar
		menuBar.add(menuArquivo);
		menuBar.add(menuEditar);
		menuEditar.addActionListener(new java.awt.event.ActionListener() { //Atribuindo função ao botão
		public void actionPerformed(ActionEvent e) {
				Editar editar = new Editar(); //Chamando a classe editar
			}
		});
		
		this.setJMenuBar(menuBar); //atribui um JMenuBar para o frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 330);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		InterfaceGrafica exemplo = new InterfaceGrafica();
		
	}
	
}
