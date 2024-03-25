import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello implements ActionListener{
	JFrame f;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	JTextField t1;

	Hello(){
		f = new JFrame();
		t1 = new JTextField(20);
		f.add(t1);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b10=new JButton("0");
		b11=new JButton("+");
		b12=new JButton("-");
		b13=new JButton("*");
		b14=new JButton("/");
		b15=new JButton("=");
		b16=new JButton("C");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(250,250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			t1.setText(t1.getText().concat("1"));
		}
		if(e.getSource()==b2){
			t1.setText(t1.getText().concat("2"));
		}
		if(e.getSource()==b3){
			t1.setText(t1.getText().concat("3"));
		}
		if(e.getSource()==b4){
			t1.setText(t1.getText().concat("4"));
		}
		if(e.getSource()==b5){
			t1.setText(t1.getText().concat("5"));
		}
		if(e.getSource()==b6){
			t1.setText(t1.getText().concat("6"));
		}
		if(e.getSource()==b7){
			t1.setText(t1.getText().concat("7"));
		}
		if(e.getSource()==b8){
			t1.setText(t1.getText().concat("8"));
		}
		if(e.getSource()==b9){
			t1.setText(t1.getText().concat("9"));
		}
		if(e.getSource()==b10){
			t1.setText(t1.getText().concat("0"));
		}
		if(e.getSource()==b11){
			t1.setText(t1.getText().concat("+"));
		}
		if(e.getSource()==b12){
			t1.setText(t1.getText().concat("-"));
		}
		if(e.getSource()==b13){
			t1.setText(t1.getText().concat("*"));
		}
		if(e.getSource()==b14){
			t1.setText(t1.getText().concat("/"));
		}
		if(e.getSource()==b15){
			if(t1.getText().contains("+")){
				String[] cs = t1.getText().split("\\+");
				String st1=cs[0];
				String st2=cs[1];
				int total = Integer.parseInt(st1)+Integer.parseInt(st2);
				t1.setText(""+total);
			}
			else if(t1.getText().contains("-")){
				String[] cs = t1.getText().split("\\-");
				String st1=cs[0];
				String st2=cs[1];
				int total = Integer.parseInt(st1)-Integer.parseInt(st2);
				t1.setText(""+total);
			}
			else if(t1.getText().contains("*")){
				String[] cs = t1.getText().split("\\*");
				String st1=cs[0];
				String st2=cs[1];
				int total = Integer.parseInt(st1)*Integer.parseInt(st2);
				t1.setText(""+total);
			}
			else if(t1.getText().contains("/")){
				String[] cs = t1.getText().split("\\/");
				String st1=cs[0];
				String st2=cs[1];
				int total = Integer.parseInt(st1)/Integer.parseInt(st2);
				t1.setText(""+total);
			}
		}
		if(e.getSource()==b16){
			t1.setText("");
		}
	}
}
class Calci{
	public static void main(String[] args){
		Hello h = new Hello();
	}
}