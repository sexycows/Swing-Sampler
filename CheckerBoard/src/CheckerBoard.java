import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;


public class CheckerBoard extends Canvas 
	{

		public static void main(String[] args)
			{			
				CheckerBoard canvas = new CheckerBoard();
		        JFrame frame = new JFrame();
		        frame.setSize(800, 800);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); 
		        frame.setResizable(true);
		        frame.setVisible(true);
		       
			}
		public void paint(Graphics graphics) 
    		{   					
//	    		for (int h=0; h<4; h++)
//	    			{
	    				for (int u=0; u<800; u=u+100)
		    				{
				    			for (int i=0; i<800; i=i+200)
									{
											    							
										graphics.setColor(Color.black);
										graphics.fillRect(i,u,100,100);	   
										 delay();
										
									}	 
		    				}
		    			for (int b=100; b<800; b=b+100)
		    				{
				    			for (int g=100; g<800; g=g+200)
										{										    					
											graphics.setColor(Color.black);
											graphics.fillRect(g,b,100,100);	   
											 delay();										
										}	    							    			
							    	}		    			
						    	}		    	
//						    }
		public static void delay()
			{
					try
						{
						Thread.sleep(150);
						} 
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}
			}
	}
