package almacenamientotransacciones;

import java.util.Scanner;

public class AlmacenamientoTransacciones {
   
    public static void main(String[] args) {
  
        //ZONA DE CREACION DE SCANNER
         Scanner sc= new Scanner(System.in);
         TransaccionesBasicas calculadora = new TransaccionesBasicas();
         CalculadoraEspecial nuevoPrograma = new CalculadoraEspecial();
        
         //ZONA DE DECLARACION DE VARIABLES.
          int opcion;
          
         do{   //REPETIR CADENA DE OPCIONES.
             
             //MENU PARA QUE EL USUARIO PUEDA ELEGIR LA OPCION DE LA OPERACION A REALIZAR.
             System.out.println("-----Bienvenido a la calculadora-----");
             System.out.println("Querido usuario porfavor seleccione el tipo de operacion a realizar.");
              System.out.println("1.Sumar"); 
              System.out.println("2.Restar"); 
              System.out.println("3.Multiplicar"); 
              System.out.println("4.Dividir"); 
              System.out.println("5.Raiz"); 
              System.out.println("6.Potencia"); 
              System.out.println("7.Redondear"); 
              System.out.println("8.NumeroAleatorioRandom"); 
              System.out.println("9.MostrarHistorialTransacciones");
              System.out.println("10.Salir");
              System.out.println("Ingrese la opcion que desea usar: ");
             
              opcion =sc.nextInt(); //ENTRADA DE DATOS.
              
              switch(opcion){
                 
                 case 1:
                      //PRIMERA OPERACION EN ESTE CASO ES SUMA.
                     System.out.println("Usuario porfavor ingrese el primer numero para sumar: ");
                      double primerNumero = sc.nextDouble();
         
                      System.out.println("Usuario porfavor ingrese el segundo numero para sumar: ");
                      double segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadora.sumar(primerNumero, segundoNumero));
                      System.out.println("La suma total es de:  "+calculadora.sumar1);
                     
                 break;
                 
                case 2:
                    
                      System.out.println("Usuario porfavor ingrese el primer numero para restar: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Usuario porfavor ingrese el segundo numero para restar: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadora.restar(primerNumero, segundoNumero));  
                      System.out.println("Su resta total es de:  "+calculadora.resta1);
                     
                 break;
                 
                case 3:
                      
                      System.out.println("Usuario porfavor ingrese el primer numero para multiplicar: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Usuario porfavor ingrese el segundo numero para multiplicar: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadora.multiplicar(primerNumero, segundoNumero));  
                      System.out.println("El total de su multiplicacion es de:  "+calculadora.multi1);
                     
                 break;
                 
                case 4:
                      
                      System.out.println("Usuario porfavor ingrese el primer numero para dividir: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Usuario porfavor ingrese el segundo numero para dividir: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadora.dividir(primerNumero, segundoNumero));  
                      System.out.println("El total de su division es de:  "+calculadora.div1);
                     
                 break;

                 case 5:
                     
                     System.out.println("Usuario porfavor ingrese un digito para realizar la raiz cuadrada: ");
                     primerNumero = sc.nextDouble();
                     System.out.println(calculadora.raiz(primerNumero) );
                     System.out.println("El resultado de la raiz es:  "+calculadora.raiz);
                 
                 break;

                 case 6:
                     
                      System.out.println("Ingrese el Primer Numero: ");
                      int primerNumeroB = sc.nextInt();
         
                      System.out.println("Ingrese el Segundo Numero: ");
                      int segundoNumeroB = sc.nextInt();
                      System.out.println(calculadora.potencia(primerNumeroB, segundoNumeroB));
                      System.out.println("El resultado de la potencia es:  "+calculadora.potencia);
                     
                     
                 break;
                
                 case 7:
                        System.out.println("Ingrese un Numero: ");
                        primerNumero = sc.nextDouble();
                        
                        System.out.println(calculadora.redondear(primerNumero));
                        System.out.println("El redondeo de la aproximacion es de:  "+calculadora.redondear);
          
                     
                 break;
                 
                case 8:
                      
                      System.out.println(calculadora.numeroAleatorio());
                      System.out.println("El numero creado al azar fue:  "+calculadora.numeroAleatorio);
                     
                 break;
                 
                  case 9:
        
                       calculadora.mostrarTransaccionesRealizadas();
           
                 break;
                 
                case 10:
                    
                 break;
                 
              }
         
         }while(opcion!=10);        
    
         System.out.println("El programa finalizo.");
    }
}


    
