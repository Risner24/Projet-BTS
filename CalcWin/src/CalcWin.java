import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CalcWin extends JFrame implements ActionListener
{
	private JTextField txtNombre = new JTextField(); 
	
	//les boutons chiffres :
	private JButton bt0 = new JButton("0") ; 
	private JButton bt1 = new JButton("1") ; 
	private JButton bt2 = new JButton("2") ; 
	private JButton bt3 = new JButton("3") ; 
	private JButton bt4 = new JButton("4") ; 
	private JButton bt5 = new JButton("5") ; 
	private JButton bt6 = new JButton("6") ; 
	private JButton bt7 = new JButton("7") ;
	private JButton bt8 = new JButton("8") ;
	private JButton bt9 = new JButton("9") ;
	
	//les boutons opérations :
	private JButton btPlus = new JButton("+") ;
	private JButton btMoins= new JButton("-") ;
	private JButton btMult = new JButton("*") ;
	private JButton btDiv = new JButton("/") ;
	private JButton btModulo = new JButton("%") ;
	private JButton btCarre = new JButton("C") ;
	private JButton btRacine = new JButton("R") ;
	private JButton btCE = new JButton("CE") ;
	private JButton btPoint = new JButton(".") ;
	private JButton btInverse = new JButton("1/x") ;
	private JButton btPM = new JButton("-/+") ;
	private JButton btEgal = new JButton("=") ;
	private JButton btEffacer = new JButton("<-") ;
	
	private int nbPoints ; 
	private float nb1, nb2, result ; 
	private String operateur ; 
	
	public CalcWin ()
	{
		//initialisation des attributs de la classe
		this.nbPoints = 0; 
		
		//propriétés de la fenêtre 
		this.setTitle("Ma calc Windows 2023");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(1000, 100, 350, 500);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.cyan);
		
		//placement du champ de saisie 
		this.txtNombre.setBounds(20, 20, 300, 40);
		this.add(this.txtNombre);
		
		//placements des boutons 
		this.bt7.setBounds(10, 200, 50, 50);
		this.add(this.bt7); 
		this.bt8.setBounds(70, 200, 50, 50);
		this.add(this.bt8); 
		this.bt9.setBounds(130, 200, 50, 50);
		this.add(this.bt9); 
		this.btDiv.setBounds(190, 200, 50, 50);
		this.add(this.btDiv); 
		
		
		this.bt4.setBounds(10, 260, 50, 50);
		this.add(this.bt4); 
		this.bt5.setBounds(70, 260, 50, 50);
		this.add(this.bt5); 
		this.bt6.setBounds(130, 260, 50, 50);
		this.add(this.bt6); 
		this.btMult.setBounds(190, 260, 50, 50);
		this.add(this.btMult); 
		
		this.bt1.setBounds(10, 320, 50, 50);
		this.add(this.bt1); 
		this.bt2.setBounds(70, 320, 50, 50);
		this.add(this.bt2); 
		this.bt3.setBounds(130, 320, 50, 50);
		this.add(this.bt3);
		this.btMoins.setBounds(190, 320, 50, 50);
		this.add(this.btMoins); 
		
		this.bt0.setBounds(10, 380, 110, 50);
		this.add(this.bt0); 
		this.btPoint.setBounds(130, 380, 50, 50);
		this.add(this.btPoint); 
		this.btPlus.setBounds(190, 380, 50, 50);
		this.add(this.btPlus); 
		
		this.btEgal.setBounds(250, 320, 50, 110 );
		this.add(this.btEgal); 
		this.btInverse.setBounds(250, 260, 50, 50);
		this.add(this.btInverse); 
		this.btModulo.setBounds (250, 200, 50, 50); 
		this.add(this.btModulo);
		
		this.btRacine.setBounds (250, 140, 50, 50); 
		this.add(this.btRacine);
		this.btPM.setBounds (190, 140, 50, 50); 
		this.add(this.btPM);
		this.btCE.setBounds (130, 140, 50, 50); 
		this.add(this.btCE);
		this.btCarre.setBounds (70, 140, 50, 50); 
		this.add(this.btCarre);
		this.btEffacer.setBounds (10, 140, 50, 50); 
		this.add(this.btEffacer);
		
		//rendre les boutons ecoutables 
		this.bt0.addActionListener(this);
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);
		this.bt3.addActionListener(this);
		this.bt4.addActionListener(this);
		this.bt5.addActionListener(this);
		this.bt6.addActionListener(this);
		this.bt7.addActionListener(this);
		this.bt8.addActionListener(this);
		this.bt9.addActionListener(this);
		
		this.btPoint.addActionListener(this);
		this.btInverse.addActionListener(this);
		this.btCarre.addActionListener(this);
		this.btRacine.addActionListener(this);
		this.btCE.addActionListener(this);
		
		this.btPlus.addActionListener(this);
		this.btMoins.addActionListener(this);
		this.btMult.addActionListener(this);
		this.btDiv.addActionListener(this);
		this.btEgal.addActionListener(this);
		
		this.setVisible(true);
	}
	public static void main (String args[])
	{
		CalcWin uneCalc = new CalcWin(); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == this.bt0) {
			 this.txtNombre.setText( this.txtNombre.getText() + "0");
		 }
		 else if  (e.getSource() == this.bt1) {
			 this.txtNombre.setText( this.txtNombre.getText() + "1");
		 }
		 else if  (e.getSource() == this.bt2) {
			 this.txtNombre.setText( this.txtNombre.getText() + "2");
		 }
		 else if  (e.getSource() == this.bt3) {
			 this.txtNombre.setText( this.txtNombre.getText() + "3");
		 }
		 else if  (e.getSource() == this.bt4) {
			 this.txtNombre.setText( this.txtNombre.getText() + "4");
		 }
		 else if  (e.getSource() == this.bt5) {
			 this.txtNombre.setText( this.txtNombre.getText() + "5");
		 }
		 else if  (e.getSource() == this.bt6) {
			 this.txtNombre.setText( this.txtNombre.getText() + "6");
		 }
		 else if  (e.getSource() == this.bt7) {
			 this.txtNombre.setText( this.txtNombre.getText() + "7");
		 }
		 else if  (e.getSource() == this.bt8) {
			 this.txtNombre.setText( this.txtNombre.getText() + "8");
		 }
		 else if  (e.getSource() == this.bt9) {
			 this.txtNombre.setText( this.txtNombre.getText() + "9");
		 }
		 else if  (e.getSource() == this.btPoint) {
			 if (this.nbPoints == 0)
				 this.txtNombre.setText( this.txtNombre.getText() + ".");
			 	 this.nbPoints ++; 
			 	 this.btPoint.setEnabled(false );	
		 }
		 else if  (e.getSource() == this.btInverse) {
			 float nb ;
			 try {
				 nb = Float.parseFloat(this.txtNombre.getText()) ;
				 if (nb == 0){
					 this.txtNombre.setText("ERROR");
				 }
				 else {
					 nb = 1 / nb ;
					 this.txtNombre.setText(nb + "");
				 }
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
			 
		 }
		 else if  (e.getSource() == this.btCE) {
			 this.txtNombre.setText("");
			 this.nbPoints =0; 
			 this.btPoint.setEnabled(true);
		 }
		 else if  (e.getSource() == this.btCarre) {
			 float nb ;
			 try {
				 nb = Float.parseFloat(this.txtNombre.getText()) ;
				 nb = nb * nb ;
				 this.txtNombre.setText(nb + "");
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
			 
		 }
		 else if  (e.getSource() == this.btRacine) {
			 float nb ;
			 try {
				 nb = Float.parseFloat(this.txtNombre.getText()) ;
				 if (nb>=0) {
					 nb = (float) Math.sqrt(nb); 
					 this.txtNombre.setText(nb + "");
				 }else {
					 this.txtNombre.setText("ERROR");
				 }
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
		 }
		 else if (e.getSource() == this.btPlus)
		 {
			 try {
				 this.nb1 = Float.parseFloat(this.txtNombre.getText()) ;
				 this.operateur ="+"; 
				 this.txtNombre.setText("");
				 this.nbPoints =0; 
				 this.btPoint.setEnabled(true);
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
		 }
		 else if (e.getSource() == this.btMoins)
		 {
			 try {
				 this.nb1 = Float.parseFloat(this.txtNombre.getText()) ;
				 this.operateur ="-"; 
				 this.txtNombre.setText("");
				 this.nbPoints =0; 
				 this.btPoint.setEnabled(true);
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
		 }
		 else if (e.getSource() == this.btMult)
		 {
			 try {
				 this.nb1 = Float.parseFloat(this.txtNombre.getText()) ;
				 this.operateur ="*"; 
				 this.txtNombre.setText("");
				 this.nbPoints =0; 
				 this.btPoint.setEnabled(true);
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
		 }
		 else if (e.getSource() == this.btDiv)
		 {
			 try {
				 this.nb1 = Float.parseFloat(this.txtNombre.getText()) ;
				 this.operateur ="/"; 
				 this.txtNombre.setText("");
				 this.nbPoints =0; 
				 this.btPoint.setEnabled(true);
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
		 }
		 else if (e.getSource() == this.btEgal)
		 {
			 try {
				 this.nb2 = Float.parseFloat(this.txtNombre.getText()) ;
				 switch (operateur)
				 {
				 case "+" : this.result = this.nb1 + this.nb2 ; this.txtNombre.setText(this.result + "");break;
				 case "-" : this.result = this.nb1 - this.nb2 ; this.txtNombre.setText(this.result + "");break;
				 case "*" : this.result = this.nb1 * this.nb2 ; this.txtNombre.setText(this.result + "");break;
				 case "/" : if (this.nb2 != 0 ) {
					 this.result = this.nb1 / this.nb2 ; 
					 this.txtNombre.setText(this.result + "");
				 	}else {
				 		this.txtNombre.setText("ERROR");
				 	}
				 	break;
				 }
				 
			 }
			 catch (NumberFormatException exp)
			 {
				 JOptionPane.showMessageDialog(this, "Veuillez saisir un nombre valide");
				 this.txtNombre.setText("");
			 }
			 this.nbPoints =0; 
			 this.btPoint.setEnabled(true);
		 }
	}
}







