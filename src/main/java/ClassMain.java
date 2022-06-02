/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ClassMain {
    public static void main(String[]args){
        persona p1;
        int EdadPersona;
        String Nompersona;
        String Genero;
        int Estrato;
        boolean entrada=false;
        do{
            int op;
op=Integer.parseInt(JOptionPane.showInputDialog(null,"te ayudare a saber cual es el salario al mes "
+ "\n ejige una opcion"
+ "\n dame nombre y edad"
+ "\n registra nombre,edad,estrato y genero"));

switch(op){
    case 1:
        Nompersona=JOptionPane.showInputDialog(null,"dame tu nombre");
        EdadPersona=Integer.parseInt(JOptionPane.showInputDialog(null,"dame tu edad"));
        P1=new persona(EdadPersona,Nompersona);
        p1.MostrarDatos();
        JOptionPane.showMessageDialog(null,p1.SalarioAPagar(EdadPersona));
        break;
        
    case 2:
        Nompersona=JOptionPane.showInputDialog(null,"dame tu nombre");
        EdadPersona=Integer.parseInt(JOptionPane.showInputDialog(null,"dame tu edad"));
        Genero=JOptionPane.showInputDialog(null,"por favor dame tu genero");
        Estrato=Integer.parseInt(JOptionPane.showInputDialog(null,"a que estrato perteneces de 1 a 4"
        + "\n elige una opcion"
        + "\n grupa A"
        + "\n grupo B"
        + "\n grupo c"
        + "\n grupo D"));
        
        
        p1=new persona(EdadPersona, Nompersona, Estrato, Genero);
        p1.MostrarDatos1();
        
        JOptionPane.showMessageDialog(null,p1.SalarioAPagar(EdadPersona));
        break;
        
    case 3:
        int Op;
        
        Op=Integer.parseInt(JOptionPane.showInputDialog(null,"desea salir"
        + "\n1 .si"
        + "\n2.no"));
        
        if (Op==1){
        entrada=true;
        }else{
        entrada=false;
        break;
        
        
        
        }
        default;
        JOptionPane.showMessageDialog(null,"opcion no valida");
        
        
        
        
        
}

        }
    }
    
}
