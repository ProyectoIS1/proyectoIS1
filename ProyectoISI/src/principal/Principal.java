package principal;

import interfaz.VentanaMenu;
import ModuloIdentificacion.Login;

	public class Principal

	{
		static Login login;
		//static VentanaMenu login;
		static TemaVentana temaVe = new TemaVentana();
		
		public static void main(String[] args)
		{
			temaVe.tema();
			login = new Login();
			login.setOpacity(0.94f);
			login.setVisible(true);
		}
	}
