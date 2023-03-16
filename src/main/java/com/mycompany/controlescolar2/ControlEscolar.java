package controlescolar;
/**
 *
 * @author barre
 */
import javax.swing.JOptionPane;
public class ControlEscolar {


 public static void main informacionalumno {
  // TODO code application logic her
        Scanner leer = new Scanner(System.in);
        int computacion;
        int calculo;
        int programacion;
        int ingles;
        int promedio;
        
        
        JOptionPane.showMessageDialog(null, "Dame la calificacion");
        System.out.println("Computacion: ");
        computacion=leer.nextInt();
        System.out.println("Calculo: ");
        calculo=leer.nextInt();
        System.out.println("Programacion: ");
        programacion=leer.nextInt();
        System.out.println("Ingles: ");
        ingles=leer.nextInt();
        promedio=computacion+calculo+programacion+ingles;
        JOptionPane.showMessageDialog(null, promedio);
        JOptionPane.showMessageDialog(null, "Este es el promedio: ");
    
}
}
