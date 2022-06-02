/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class parcial3corte {
   private int Edadpersona;
   private String Nompersona;
   private String Genero;
   private int Estrato;
   
   parcial3corte(int idPersona, String Nompersona){
   this.Nompersona=Nompersona;
   this.Edadpersona=idPersona;
   this.Estrato=Estrato;
   
   }
   parcial3corte(int idpersona, String Nompersona, int Estrato, String Genero){
   this.Nompersona=Nompersona;
   this.Edadpersona=idpersona;
   this.Estrato=Estrato;
   this.Genero=Genero;
      
   }
   public String SalarioAPagar(int Edadpersona){
   String cadena="";
   this.Edadpersona=Edadpersona;
   if(Edadpersona>50){
       cadena+="su salario es de 60000 debido a su edad";
       
   }else if (Edadpersona<50){
       cadena+="su salario es de 50000 ´por falta de experiencia";
       
   }
   return cadena;
       }
           
   
}

