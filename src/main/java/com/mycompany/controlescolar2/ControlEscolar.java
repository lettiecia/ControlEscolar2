package controlescolar;
/**
 *
 * @author barre
 */
import javax.swing.JOptionPane;
public class ControlEscolar {
    String nombre, fecha, cuenta, semestre, direccion, telefono, horario
}package informacionalumno;


 public static void main informacionalumno {
   public static String  fecha ="";
   public static String nombre ="";
   public static String cuenta ="";
   public static String semestre ="";
   public static String direccion ="";
   public static String telefono ="";
   public static String horario ="";
   
     public static void main informacionpersonal(String fecha, String nombre, String cuenta, String semestre ){ 
        
    
    JOptionPane.showMessageDialog("fecha:");
    fecha =lectura.nextLine();
    JOptionPane.showMessageDialog("nombre del alumno:");
    nombre =lectura.nextLine();
    JOptionPane.showMessageDialog("cuenta del alumno:");
     cuenta =lectura.nextLine();
    JOptionPane.showMessageDialog("semestre del alumno:");
     semestre =lectura.nextLine();
    System.out.println("datos del alumno: " + fecha + nombre + cuenta + semestre );
    }
     public void InformacionAcademica(String cuenta, String semestre){ 
         
    System.out.println("direccion del alumno:");
    direccion =lectura.nextLine();
    System.out.println("telefono del alumno:");
    telefono =lectura.nextLine();
    System.out.println("informacion academica:  " + direccion + telefono);
     }
     
     public void Horarios(String nombre){ 
    JOptionPane.showMessageDialog("materias que cursa alumno:");
     horario =lectura.nextLine();
    JOptionPane.showMessageDialog("sus materias son:  " + horario);
    }
     
import javax.swing.JOptionPane;
public class Calificaciones {
     
           int promedio;
           int circuitos= 0;
           int ingles= 0;
           int calculo = 0;
           int programacion = 0;
           int computacion = 0;
           
           public void Materias (int circuitos, int ingles, int calculo, int programacion, int computacion){
                JOptionPane.showMessageDialog("calificacion de circuitos: " + circuitos); 
                 JOptionPane.showMessageDialog("calificacion de ingles: " + ingles);
                  JOptionPane.showMessageDialog("calificacion de calculo: " + calculo);
                   JOptionPane.showMessageDialog("calificacion de programacion de programacion: " + programacion );
                    JOptionPane.showMessageDialog"calificacion de computacion: " + computacion);
                
           }
           public void Promedio (int promedio) {
               JOptionPane.showMessageDialog("promedio de sus materias:"+ circuitos + ingles + calculo + programacion + computacion /5 + promedio);
           }
           
          
      }
      public static void main(String[] args) {
          
InformacionAlumno alumno = new InformacionAlumno();

 alumno.InformacionPersonal(nombre, fecha, telefono, direccion);
alumno.InformacionAcademica (cuenta, semestre);
alumno.Horarios(horario);
Calificaciones cali = new Calificaciones();
cali.Calificaciones(circuitos, ingles,calculo, programacion, computacion);


       
       
    }
    
}