package cuadriculas;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class dibujo extends javax.swing.JPanel {

	public dibujo()
	{
       
 	}

 	public void paint(Graphics g)
    {
 		Color c;
 		int i; 

 		c = new Color(255,255,255);
 		g.setColor(c);
 		g.fillRect(0, 0, 900, 600);        
 		c = new Color(180,180,180);
 		g.setColor(c);
 		
 		for(i=20; i<900; i+=20)
 		{
 			g.drawLine(i, 0, i, 600);
 		}
 		for(i=20; i<600; i+=20)
 		{
 			g.drawLine(0, i, 900, i);
 		}
 		
 		
			Graphics2D g2d = (Graphics2D) g;
 			g.setColor(Color.blue);
			g.drawRect(220, 320, 20, 20);
		
		//g.setColor(Color.RED);
		//int valoresX[] =  {100,100,300,100};
		//int valoresY[] =  {100,200,200,100};
		//g.drawPolyline(valoresX, valoresY, 4);
		
		g.setColor(Color.RED);
		int valoresX1[] =  {220,220,440,220};
		int valoresY1[] =  {220,340,340,220};
		g.drawPolyline(valoresX1, valoresY1, 4);
		
		
		

 	}
 	
}
