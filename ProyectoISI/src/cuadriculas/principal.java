package cuadriculas;




import java.awt.BorderLayout;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class principal extends javax.swing.JFrame {
 private dibujo pDibujo;
 private JPanel PContenedorDibujo;

 public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    principal inst = new principal();
    inst.setLocationRelativeTo(null);
    inst.setVisible(true);
   }
  });
 }
 
 public principal() {
  super();
  initGUI();
 }
 
 private void initGUI() {
  try {
   setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   BorderLayout thisLayout = new BorderLayout();
   getContentPane().setLayout(thisLayout);
   this.setTitle("Graficacion");
   {
    PContenedorDibujo = new JPanel();
    BorderLayout PContenedorDibujoLayout = new BorderLayout();
    PContenedorDibujo.setLayout(PContenedorDibujoLayout);
    getContentPane().add(PContenedorDibujo, BorderLayout.CENTER);
    this.pDibujo = new dibujo();
    PContenedorDibujo.add(this.pDibujo);
   }
   pack();
   setSize(400, 300);
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}