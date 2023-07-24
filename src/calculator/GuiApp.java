package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.PublicKey;

public class GuiApp extends JFrame implements ActionListener{
	
	private JButton btnKareKok,btnTopla, btnCikar, btnBol, btnCarp, btnEsit, BtnCos, btnSin , btnKare , btnClear,btnZero, btnOne, btnTwo,btnThree,btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
	private JTextField txt1;
	private JPanel pnl1,pnl2;
	private String islem1,opt;
	private double sonuc;
	
	public Double getSonuc() {
		return sonuc;
	}
	public void setSonuc(double d) {
		this.sonuc = d;
	}
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	
	public String getIslem1() {
		return islem1;
	}
	public void setIslem1(String islem1) {
		this.islem1 = islem1;
	}
	public GuiApp() {
		super("Hesap Makinesi");
		setLayout(new BorderLayout());
		
		btnTopla=new JButton("+");
		btnCikar=new JButton("-");
		btnBol=new JButton("/");
		btnCarp=new JButton("*");
		btnClear=new JButton("C");
		btnEsit=new JButton("=");
		BtnCos=new JButton("Cos");
		btnSin=new JButton("Sin");
		btnKare=new JButton("^");
		btnZero=new JButton("0");
		btnOne=new JButton("1");
		btnTwo=new JButton("2");
		btnThree=new JButton("3");
		btnKareKok=new JButton("√");
		
		btnFour=new JButton("4");
		btnFive=new JButton("5");
		btnSix=new JButton("6");
		btnSeven=new JButton("7");
		btnEight=new JButton("8");
		btnNine=new JButton("9");


		
		pnl1= new JPanel();
		pnl2= new JPanel();
		
		txt1=new JTextField(); 

		
		btnTopla.addActionListener(this);
		btnCikar.addActionListener(this);
		btnBol.addActionListener(this);
		btnCarp.addActionListener(this);
		btnClear.addActionListener(this);
		btnEsit.addActionListener(this);
		BtnCos.addActionListener(this);
		btnSin.addActionListener(this);
		btnKare.addActionListener(this);
		btnZero.addActionListener(this);
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		btnEight.addActionListener(this);
		btnNine.addActionListener(this);
		btnKareKok.addActionListener(this);
		
		pnl1.setLayout(new GridLayout(1,1));
		pnl2.setLayout(new GridLayout(5,4));
		
		
		pnl1.add(txt1);
		
		
		pnl2.add(BtnCos);
		pnl2.add(btnSin);
		pnl2.add(btnKare);
		pnl2.add(btnBol);
		
		pnl2.add(btnSeven);
		pnl2.add(btnEight);
		pnl2.add(btnNine);
		pnl2.add(btnCarp);
		
		pnl2.add(btnFour);
		pnl2.add(btnFive);
		pnl2.add(btnSix);
		pnl2.add(btnCikar);
		
		pnl2.add(btnOne);
		pnl2.add(btnTwo);
		pnl2.add(btnThree);
		pnl2.add(btnTopla);
		
		pnl2.add(btnClear);
		pnl2.add(btnZero);
		pnl2.add(btnKareKok);
		pnl2.add(btnEsit);

		
		add(pnl1, BorderLayout.CENTER);
		add(pnl2, BorderLayout.SOUTH);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,400);
	}
	public static void main(String[] args) {
		new GuiApp();	
	}
	public String hesap(String x) {
		if(x.contains("+")) {
			String[] h=x.split("+");
			int h0=Integer.parseInt(h[0]);
			int h1=Integer.parseInt(h[1]);
			int toplam=h0+h1;
			String yeni1 = String.valueOf(toplam);
			return yeni1;
		}
		return "0";
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnOne) {
			txt1.setText(txt1.getText()+"1");
		}
		if(e.getSource()==btnTwo) {
			txt1.setText(txt1.getText()+"2");
		}
		if(e.getSource()==btnThree) {
			txt1.setText(txt1.getText()+"3");
		}
		if(e.getSource()==btnFour) {
			txt1.setText(txt1.getText()+"4");
		}
		if(e.getSource()==btnFive) {
			txt1.setText(txt1.getText()+"5");
		}
		if(e.getSource()==btnSix) {
			txt1.setText(txt1.getText()+"6");
		}
		if(e.getSource()==btnSeven) {
			txt1.setText(txt1.getText()+"7");
		}
		if(e.getSource()==btnEight) {
			txt1.setText(txt1.getText()+"8");
		}
		if(e.getSource()==btnNine) {
			txt1.setText(txt1.getText()+"9");
		}
		if(e.getSource()==btnZero) {
			txt1.setText(txt1.getText()+"0");
		}
		if(e.getSource()==btnCikar) {
			setIslem1(txt1.getText());
			setOpt("-");
			txt1.setText("");
		}
		if(e.getSource()==btnTopla) {
			setIslem1(txt1.getText());
			setOpt("+");
			txt1.setText("");
		}
		if(e.getSource()==btnCarp) {
			setIslem1(txt1.getText());
			setOpt("*");
			txt1.setText("");
		}
		if(e.getSource()==btnBol) {
			setIslem1(txt1.getText());
			setOpt("/");
			txt1.setText("");
		}
		if(e.getSource()==BtnCos) {
			double islem1 =Double.valueOf(txt1.getText());
			String yeni1 = String.valueOf(Math.cos(islem1));
			txt1.setText(yeni1);
		}
		if(e.getSource()==btnSin) {
			double islem1 =Double.valueOf(txt1.getText());
			String yeni1 = String.valueOf(Math.sin(islem1));
			txt1.setText(yeni1);
			
		}
		if(e.getSource()==btnKareKok) {
			double islem1 =Double.valueOf(txt1.getText());
			String yeni1 = String.valueOf(Math.sqrt(islem1));
			txt1.setText(yeni1);
			
		}
		if(e.getSource()==btnKare) {
			setIslem1(txt1.getText());
			setOpt("kare");
			txt1.setText("");
			

		}
		if(e.getSource()==btnClear) {
			txt1.setText("");
		}
		if(e.getSource()==btnEsit) {
			double islem1 =Double.valueOf(getIslem1());
			double islem2 =Double.valueOf(txt1.getText());
			String opt=getOpt();
			if(opt=="+") {
				setSonuc(islem1+islem2);
				String yeni1 = String.valueOf(getSonuc());
				txt1.setText(yeni1);
			}
			if(opt=="-") {
				setSonuc(islem1-islem2);
				String yeni1 = String.valueOf(getSonuc());
				txt1.setText(yeni1);
			}
			if(opt=="*") {
				setSonuc(islem1*islem2);
				String yeni1 = String.valueOf(getSonuc());
				txt1.setText(yeni1);
			}
			if(opt=="/") {
				setSonuc(islem1/islem2);
				String yeni1 = String.valueOf(getSonuc());
				txt1.setText(yeni1);
			}
			if(opt=="kare") {
				setSonuc(Math.pow(islem1,islem2));
				String yeni1 = String.valueOf(getSonuc());
				txt1.setText(yeni1);
			}
	
		}
		
	}
	


	
}
