package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel lblInserisciCittDi;
	private JLabel lblInserisciCittDi_1;
	private JLabel lblScegliereMezzoDi;
	private JComboBox comboBox;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblGoogleMapsApis;
	private JButton btnInviaDati;
	private JPanel panel_1;
	private JLabel label_2;
	private JLabel label_3;

	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.contentPane.setLayout(null);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.tabbedPane.setBounds(0, 0, 821, 411);
		this.contentPane.add(this.tabbedPane);
		
		this.panel = new JPanel();
		this.panel.setBackground(new Color(204, 204, 255));
		this.panel.setForeground(new Color(255, 153, 51));
		this.tabbedPane.addTab("Informazioni percorso", null, this.panel, null);
		this.panel.setLayout(null);
		
		this.lblInserisciCittDi = new JLabel("Inserisci citt\u00E0 di partenza:");
		lblInserisciCittDi.setFont(new Font("High Tower Text", Font.ITALIC, 18));
		this.lblInserisciCittDi.setBounds(150, 81, 209, 28);
		this.panel.add(this.lblInserisciCittDi);
		
		this.lblInserisciCittDi_1 = new JLabel("Inserisci citt\u00E0 di destinazione:");
		lblInserisciCittDi_1.setFont(new Font("High Tower Text", Font.ITALIC, 18));
		this.lblInserisciCittDi_1.setBounds(150, 120, 224, 30);
		this.panel.add(this.lblInserisciCittDi_1);
		
		this.lblScegliereMezzoDi = new JLabel("Scegliere mezzo di trasporto:");
		lblScegliereMezzoDi.setFont(new Font("High Tower Text", Font.ITALIC, 18));
		this.lblScegliereMezzoDi.setBounds(150, 154, 209, 37);
		this.panel.add(this.lblScegliereMezzoDi);
		
		this.comboBox = new JComboBox();
		this.comboBox.setModel(new DefaultComboBoxModel(new String[] {"Macchina ", "A piedi"}));
		this.comboBox.setBounds(444, 162, 106, 20);
		this.panel.add(this.comboBox);
		
		this.textField = new JTextField();
		this.textField.setBounds(444, 85, 106, 20);
		this.panel.add(this.textField);
		this.textField.setColumns(10);
		
		this.textField_1 = new JTextField();
		this.textField_1.setBounds(444, 125, 106, 20);
		this.panel.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		this.lblGoogleMapsApis = new JLabel("Google Maps");
		this.lblGoogleMapsApis.setForeground(new Color(0, 0, 204));
		this.lblGoogleMapsApis.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 35));
		this.lblGoogleMapsApis.setBounds(270, 11, 275, 49);
		this.panel.add(this.lblGoogleMapsApis);
		
		this.btnInviaDati = new JButton("Invia dati");
		this.btnInviaDati.setBounds(595, 161, 89, 23);
		this.panel.add(this.btnInviaDati);
		
		this.panel_1 = new JPanel();
		this.panel_1.setLayout(null);
		this.panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		this.panel_1.setBounds(150, 227, 534, 107);
		this.panel.add(this.panel_1);
		
		this.label_2 = new JLabel("");
		this.label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.label_2.setBounds(12, 28, 510, 27);
		this.panel_1.add(this.label_2);
		
		this.label_3 = new JLabel("");
		this.label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.label_3.setBounds(12, 68, 462, 26);
		this.panel_1.add(this.label_3);
	}

	
	
	public void ascoltatoreBottoni(ActionListener a) {
		btnInviaDati.addActionListener(a);
	}

	public JPanel getPanel_1() {
		return panel_1;
	}



	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}



	public JLabel getLabel_2() {
		return label_2;
	}



	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}



	public JLabel getLabel_3() {
		return label_3;
	}



	public void setLabel_3(JLabel label_3) {
		this.label_3 = label_3;
	}



	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLblInserisciCittDi() {
		return lblInserisciCittDi;
	}

	public void setLblInserisciCittDi(JLabel lblInserisciCittDi) {
		this.lblInserisciCittDi = lblInserisciCittDi;
	}

	public JLabel getLblInserisciCittDi_1() {
		return lblInserisciCittDi_1;
	}

	public void setLblInserisciCittDi_1(JLabel lblInserisciCittDi_1) {
		this.lblInserisciCittDi_1 = lblInserisciCittDi_1;
	}

	public JLabel getLblScegliereMezzoDi() {
		return lblScegliereMezzoDi;
	}

	public void setLblScegliereMezzoDi(JLabel lblScegliereMezzoDi) {
		this.lblScegliereMezzoDi = lblScegliereMezzoDi;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JLabel getLblGoogleMapsApis() {
		return lblGoogleMapsApis;
	}

	public void setLblGoogleMapsApis(JLabel lblGoogleMapsApis) {
		this.lblGoogleMapsApis = lblGoogleMapsApis;
	}

	public JButton getBtnInviaDati() {
		return btnInviaDati;
	}

	public void setBtnInviaDati(JButton btnInviaDati) {
		this.btnInviaDati = btnInviaDati;
	}
}
