package principal;

import javax.swing.JFrame;

import org.jvnet.substance.SubstanceLookAndFeel;

	public class TemaVentana 
	{
		public void tema(){
			
			try {
				JFrame.setDefaultLookAndFeelDecorated(true);
				SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.SaharaSkin");
				SubstanceLookAndFeel.setCurrentTheme( "org.jvnet.substance.theme.SubstanceAquaTheme" );
				SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.3));
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


