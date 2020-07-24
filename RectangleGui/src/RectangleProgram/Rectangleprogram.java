package RectangleProgram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rectangleprogram extends JFrame {
	
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	
	
	
	private JLabel LengthL,WidthL,AreaL,PerimeterL;
	private JTextField lengthTF,WidthTF,AreaTF,PerimeterTF;
	private JButton calc, exit;
	
	private CalculateButtonHandler cbHandler;
	private exitButtonHandler ebHandler;
	
	public Rectangleprogram() {
		//set the title of the frame
		setTitle("Area and Perimeter of a Rectangle");
		
		
		//set the lebels and their alighnment 
		LengthL = new JLabel("Enter The Length:" , SwingConstants.LEFT );
		WidthL = new JLabel("Enter the Width:",SwingConstants.LEFT);
		AreaL = new JLabel("Area: ",SwingConstants.LEFT);
		PerimeterL=new JLabel("Perimeter: ",SwingConstants.LEFT);
		
			
		// set the text fields 
		
		lengthTF =new JTextField(10);
		WidthTF = new JTextField(10);
		AreaTF = new JTextField(10);
		PerimeterTF = new JTextField(10);
		
		//Add buttons and their action hundlers
		calc = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calc.addActionListener(cbHandler);
		
		
		exit = new JButton("Exit");
		ebHandler = new exitButtonHandler();
		exit.addActionListener(ebHandler);
		
		
			
		//set the sontainer for the window and the layout
			Container pane = getContentPane();
			pane.setLayout(new GridLayout(5,2));
			
			pane.add(LengthL);
			pane.add(lengthTF);
			pane.add(WidthL);
			pane.add(WidthTF);
			pane.add(AreaL);
			pane.add(AreaTF);
			pane.add(PerimeterL);
			pane.add(PerimeterTF);
			pane.add(calc);
			pane.add(exit);
			
			
		
		// frame settings 
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String args[]) {
		Rectangleprogram rect = new Rectangleprogram();
		
	}
	
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			double width,length,area,perimeter;
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(WidthTF.getText());
			area = length * width;
			perimeter = 2 * (length + width);
			
			AreaTF.setText(""+area);
			PerimeterTF.setText(""+ perimeter);
		}
	}
	
	
	private class exitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

}
