package br.senai.sp.jandira.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.senai.sp.jandira.model.Jogo;


import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Zerado;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;
import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;

import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import br.senai.sp.jandira.model.QuantidadesZeradas;

public class GestãoDeJogosFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtcaixinhadotitulodojogo;
	private JTextField txtcaixavalorestimado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestãoDeJogosFrame frame = new GestãoDeJogosFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private int posicao = 0;
	public GestãoDeJogosFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtcaixinhadotitulodojogo = new JTextField();
		txtcaixinhadotitulodojogo.setBounds(130, 25, 150, 20);
		contentPane.add(txtcaixinhadotitulodojogo);
		txtcaixinhadotitulodojogo.setColumns(10);
		String p = txtcaixinhadotitulodojogo.getText();
		
		
		JLabel lblTituloDoJogo = new JLabel("Titulo Do Jogo");
		lblTituloDoJogo.setBounds(10, 28, 110, 14);
		contentPane.add(lblTituloDoJogo);
		
		
		
				
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(35, 359, 89, 23);
		contentPane.add(btnSalvar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 53, 202, 230);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		DefaultListModel<String> listamodel = 
				new DefaultListModel<String>();
		list.setModel(listamodel);
		
		
		
		JLabel lblFabricante = new JLabel("Fabricante : ");
		lblFabricante.setBounds(10, 53, 110, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblZerado = new JLabel("Zerado");
		lblZerado.setBounds(10, 91, 46, 14);
		contentPane.add(lblZerado);
		
		JComboBox comboBoxzerado = new JComboBox();
		DefaultComboBoxModel<String> modelZerado =
				new DefaultComboBoxModel<String>();
		comboBoxzerado.setModel(new DefaultComboBoxModel(Zerado.values()));
		comboBoxzerado.setBounds(54, 87, 66, 22);
		contentPane.add(comboBoxzerado);
		for (Console combozerado : Console.values()) {
			modelZerado.addElement(combozerado.getDescricao());
		}
		JComboBox comboBoxConsole = new JComboBox();
		DefaultComboBoxModel<String> Consolee = 
				new DefaultComboBoxModel<String>();
		comboBoxConsole.setModel(new DefaultComboBoxModel(Console.values()));
		for (Console comboConsole : Console.values()) {
			Consolee.addElement(comboConsole.getDescricao());
		}
		
		comboBoxConsole.setBounds(85, 131, 146, 22);
		contentPane.add(comboBoxConsole);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(10, 135, 65, 14);
		contentPane.add(lblConsole);
		
		JLabel lblValorestimado = new JLabel("Valor Estimado:");
		lblValorestimado.setBounds(10, 175, 89, 14);
		contentPane.add(lblValorestimado);
		
		JTextPane txtobservaçoes = new JTextPane();
		txtobservaçoes.setBounds(95, 216, 121, 117);
		contentPane.add(txtobservaçoes);
		
		txtcaixavalorestimado = new JTextField();
		txtcaixavalorestimado.setBounds(118, 172, 86, 20);
		contentPane.add(txtcaixavalorestimado);
		txtcaixavalorestimado.setColumns(10);
		
		JLabel lblObservaçoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaçoes.setBounds(10, 216, 89, 14);
		contentPane.add(lblObservaçoes);
		
		JComboBox comboBoxFabricante = new JComboBox();
		comboBoxFabricante.setBounds(119, 49, 161, 22);
		Fabricante fabricante = new Fabricante();
		DefaultComboBoxModel<String>combofabricante = 
				new DefaultComboBoxModel<String>();
		comboBoxFabricante.setModel(combofabricante);
		contentPane.add(comboBoxFabricante);
		Fabricante vetorFabricante = new Fabricante();
		
		JComboBox comboBoxquantidaDeVezesZeradas = new JComboBox();
		DefaultComboBoxModel<String>comboVezesZeradas = 
				new DefaultComboBoxModel<String>();
		comboBoxquantidaDeVezesZeradas.setModel(new DefaultComboBoxModel(QuantidadesZeradas.values()));
		comboBoxquantidaDeVezesZeradas.setBounds(258, 87, 80, 22);
		contentPane.add(comboBoxquantidaDeVezesZeradas);
		for (QuantidadesZeradas vezesZeradas : QuantidadesZeradas.values()) {
			Consolee.addElement(vezesZeradas.getDescricao());
		}
		
		String vetor[] = vetorFabricante.getFabricantes();
		
		for (int contador = 0; contador < vetor.length; contador++) {
			combofabricante.addElement(vetor[contador]);
		}
		
		FabricanteRepository fabricanteRepository = new FabricanteRepository(10);
		
		DefaultListModel listModel = new DefaultListModel();
		
		JogoRepository jogos = new JogoRepository();
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogo jogo = new Jogo();
				jogo.setTitulodojogo(txtcaixinhadotitulodojogo.getText());
				jogo.setObservaçoes(txtobservaçoes.getText());	
				jogo.setValorestimado(txtcaixavalorestimado.getText());	
				// Parte do salvamento dos consoles !! 
				jogo.setConsole(determinarConsole(comboBoxConsole.getSelectedIndex()));
				jogo.setZerado(determinarZerado(comboBoxzerado.getSelectedIndex()));
				jogo.setquantidadeDojogoszerados(DeterminarQuantidadesZeradas
				(comboBoxquantidaDeVezesZeradas.getSelectedIndex()));
				jogos.gravar(jogo, posicao);
				posicao++;
				listamodel.addElement(jogo.getTitulodojogo());
			}
		});
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = jogos.listarjogos(list.getSelectedIndex());
				txtcaixinhadotitulodojogo.setText(jogo.getTitulodojogo());
				txtobservaçoes.setText(jogo.getObservaçoes());
				txtcaixavalorestimado.setText(jogo.getValorestimado());
				
				
				//parte da seleção dos comboboxs
				comboBoxConsole.setSelectedIndex(jogo.getConsole().ordinal());
				comboBoxzerado.setSelectedIndex(jogo.getZerado().ordinal());
				comboBoxquantidaDeVezesZeradas.setSelectedIndex
				(jogo.getquantidadeDojogoszerados().ordinal());
			}
		});
		
	
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(153, 359, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnesquerdo = new JButton("<");
		btnesquerdo.setBounds(367, 299, 77, 34);
		contentPane.add(btnesquerdo);
		
		btnesquerdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Faça uma seleção no Jlist primeiro", "Selecione Algo!", JOptionPane.WARNING_MESSAGE);
				} else {
					list.setSelectedIndex(list.getSelectedIndex()-1);
				}
			}
				
			
		});
		
		JButton btndireito = new JButton(">");
		btndireito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Faça uma seleção no Jlist primeiro", "Selecione Algo!", JOptionPane.WARNING_MESSAGE);
				} else {
					list.setSelectedIndex(list.getSelectedIndex()+1);
				}
			
			}
		});
		
		
		btndireito.setBounds(454, 299, 77, 34);
		contentPane.add(btndireito);
		
		JLabel lblQuantidadesZeradas = new JLabel("Quantidades Zeradas");
		lblQuantidadesZeradas.setBounds(129, 91, 132, 14);
		contentPane.add(lblQuantidadesZeradas);
		
		JButton btnLimparListar = new JButton("Limpar Lista");
		btnLimparListar.setBounds(385, 353, 121, 34);
		contentPane.add(btnLimparListar);
		
		 
		btnLimparListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listamodel.removeAllElements();
				
			}
		});
	
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			listModel.removeElement(txtcaixinhadotitulodojogo);
			txtcaixinhadotitulodojogo.setText(null);
			txtcaixinhadotitulodojogo.requestFocus();
			listModel.removeElement(txtobservaçoes);
			txtobservaçoes.setText(null);
			txtobservaçoes.requestFocus();
			listModel.removeElement(txtcaixavalorestimado);
			txtcaixavalorestimado.setText(null);
			txtcaixavalorestimado.requestFocus();
			listModel.ensureCapacity(100);
			
			
			
			}
		});
	}
		//para o combobox não bugar e trocar de lugar tem que estar na mesma
	//ordem do enum se não vai trocar as palavras assim que você salvar.
		private Console determinarConsole(int consoleSelecionado) {
			 if (consoleSelecionado == 0) {
			    	return Console.NINTENDOSWITCH;
			    } else if (consoleSelecionado == 1) {
			    	return  Console.PLAYSTATION4;
			    } else {
			    	return Console.XBOX;
			    }
	}
		private Zerado determinarZerado(int consoleZeradoSelecionado) {
			 if (consoleZeradoSelecionado == 0) {
			    	return Zerado.SIM;
			    }  else {
			    	return Zerado.NÃO;
			    }
	}
		private  QuantidadesZeradas  DeterminarQuantidadesZeradas(int QuantidadedevezesZeradas) {
			 if (QuantidadedevezesZeradas == 0) {
			    	return QuantidadesZeradas.UMA;
			    } else if (QuantidadedevezesZeradas == 1) { 
			    	return QuantidadesZeradas.DUAS;
			    }else if (QuantidadedevezesZeradas == 2) {
			    	return QuantidadesZeradas.TRES;
			    }else {
			    	return QuantidadesZeradas.QUATRO;
			    }
	}
}
