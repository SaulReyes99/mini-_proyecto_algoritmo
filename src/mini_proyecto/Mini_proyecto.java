/*
* Bienvenido a un programa que trata sobre los clientes de alguna empresa ,
* ya que sirve para ingresar nuevos clientes al sistema, poder elimiminar a los 
* clientes y poder salir de dicho programa.
 */

package mini_proyecto; //Nombre del paquete que identifica a este programa.
import java.util.Scanner;//Import, indica al compilador, busca Scanner y lo asocia con la clase creada.
/**
 *
 * @author Saul
 */
public class Mini_proyecto {//el programa utiliza la clasemini proyecto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inic.main
        // Declar meto Scanner
        Scanner puerta = new Scanner(System.in);
        //Despues de lo metodos declaramos variables.
        /*
        String nombrePrimero1;
        String nombreSegundo1;
        String apellidoPrimero1;
        String apellidoSegundo1;
        int edad1;
        String fecha_Nac1;
        String sexo1;
        String ciudad1;*/
        
        int repetidor = 1;
        while(repetidor==1){//inicio.while
        //Menu Principal
        System.out.println("*****************Menu Principal******************");
        System.out.println("*****************Datos Paciente******************");
         //opciones
         System.out.println("1. Nuevo paciente");
         System.out.println("2.Eliminar paciente ");
         System.out.println("3.Salir ");
         System.out.println(" ");
         System.out.println("Ingresar un codigo");
         
        
         //respuesta  del usuario menu principal
         
         
         int respuesta = puerta.nextInt();
         
         switch(respuesta){//inic.switch
             case 1: 
                 String espacio1 = " "; 
                 String espacio2 = " "; 
                 String espacio3 = " "; 
                 //declaramos un arreglo llamado nombre
                 String [] nombre1 = new String[10];
                 System.out.println("Nuevo paciente");
                 for(int i=0;i<1;i++){//inicio.for
                 System.out.println("Ingresar primer nombre y apellido");
                     System.out.println(" ");
                     System.out.println(" ");
                 nombre1 [i] = puerta.next();
                 
                 /*System.out.println("Ingresar segunto nombre del paciente");
                 String nombreSegundo1 = puerta.next();
                 
                 System.out.println("Ingese Primer apellido del paciente");
                 String apellidoPrimero1 = puerta.next();
                 
                 System.out.println("Ingrese segundo apellido del paciente");
                 String apellidoSegundo1 = puerta.next();
                 
                 System.out.println("Ingrese Edad del paciente");
                 int edad1 = puerta.nextInt ();
                 
                 System.out.println("Ingrese Fecha Nacieminto del pasiente");
                 String fecha_Nac1 = puerta.next();
                 
                 System.out.println("Ingrese el sexo del paciente");
                 String sexo1 = puerta.next();
                 
                 System.out.println("Ingrese la ciudad del paciente");
                 String ciudad1 = puerta.next();*/
                 }//fin.for
                String [] apellido1 = new String[10];//arreglo
                 for(int i=0;i<1;i++){//inicio.for2
                 System.out.println(" ");
                 apellido1 [i] = puerta.next();
                 }//fin.for2
                 System.out.println("");
                 System.out.println("");
                 System.out.println("************Paciente No.1*************");
                  //paciente[1] = nombrePrimero1 + espacio1 + nombreSegundo1 + espacio2 + apellidoPrimero1 + espacio3 + apellidoSegundo1;
                 System.out.println("nombre paciente No.1: "+nombre1[0]); 
                 System.out.println("apellido paciente No.1: "+apellido1[0]);
                 System.out.println(" ");
                 System.out.println(" ");
            
                /* System.out.println("El primer nombre es: "+nombrePrimero1);//ejemplos de como hacer salto de linea
                 System.out.println("El segundo nombre es\n"+nombreSegundo1);//ejemplos de como hacer salto de linea
                 System.out.println("El primer apellido es");//ejemplos de como hacer salto de linea
                 System.out.println(apellidoPrimero1);//ejemplos de como hacer salto de linea
                 System.out.println("El segundo apellido es\n"+apellidoSegundo1);//ejemplos de como hacer salto de linea
                 //
                 System.out.println("La edad del paciente es de\n"+edad1);
                 //
                 System.out.println("La fecha de nacimiento del paciente es\n"+fecha_Nac1);
                 //
                 System.out.println("El sexo del paciente es\n"+sexo1);
                 //
                 System.out.println("La ciudad del paciente es\n"+ciudad1);*/
                
                 break;//para que bucle se detenga 
                 
                
                 //
             case 2:
                 System.out.println("*******Proceso de eliminacion********");//introduccion dela segunda opcion que el usuario eligio
                 System.out.println("Paso No.1");//indicador
                 System.out.println("Digitar solo primer nombre");//instruccion
                 String nameE = puerta.next();//declarar nuevo
                 System.out.println("Digitar solo primer apellido");//instruccion
                 String apellidoE;//declarar nuevo
                 apellidoE = puerta.next();
                 System.out.println("Esta seguro que desea eliminar al paciente");
                 System.out.println("1.si");//accion de usuario
                 System.out.println("Escriba 1");//indicador de accion
                 System.out.println("2.No");//accion de usuario
                 System.out.println("Escriba 2");//indicador de accion
                 String eliminacion = puerta.next();
                 switch(eliminacion){//inic.switch.eliminacion
                     case "1":
                         System.out.println("*****El paciente a sido eliminado*****");//accion realizada
                         System.out.println(" ");
                         System.out.println(" ");
                         System.out.println(" ");
                         break;
                     case "2":
                         System.out.println("****El Paciente no a sido eliminado*****");//accion realizada
                        System.out.println(" ");
                         System.out.println(" ");
                         System.out.println(" ");
                         break;
                     default:
                         System.out.println("********OPCION NO VALIDA********");//accion realizada
                         break;
                 }//Fin.switch.eliminacion
                 break;
              
                 //
             case 3:
                 repetidor=0;
                 
                 System.out.println("**********Gracias :)**********");
                 
                  break;
             
             default:
                 System.out.println("********Opcion invalida********");
                      break;
                 
                 
                }//fin.switch 
                 
        }//fin.while     
 
        
    }//fin.main
    
}
