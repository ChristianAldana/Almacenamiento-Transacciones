package almacenamientotransacciones;


public class TransaccionesBasicas extends CalculadoraEspecial{
    
 //Area de atributos
    String tipoCalculadora;
    int cantidadDeTeclas;
    int anchoPantalla;
    String color;
    String marca;
    int ancho;
    int alto;
    
    
    //Atributos agregados
     double raiz;
     int potencia;
     long redondear;
     double numeroAleatorio;
     double sumar1;
     double resta1;
     double multi1;
     double div1;
     private String [] vectorTransacciones;
     private int indiceVector;
     double resultado;
     private String[] registrarTransaccion;
    
    //Constructor - Funciona para inicializar variables y recursos de clase
    public TransaccionesBasicas(){
        this.tipoCalculadora="Calculadora Basica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
        vectorTransacciones= new String [100];
         this.indiceVector=0;  
         this.registrarTransaccion(color, numeroAleatorio, sumar1, resta1);
                
    }
    //metodos
    
    public double sumar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("suma", primerNumero, segundoNumeroB, primerNumero+segundoNumeroB);
        return sumar1 =primerNumero+segundoNumeroB;
    }

    public double restar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("resta", primerNumero, segundoNumeroB, primerNumero-segundoNumeroB);
        return resta1 = primerNumero-segundoNumeroB;
    }

    public double dividir(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("dividir", primerNumero, segundoNumeroB, primerNumero/segundoNumeroB);
        return div1 = primerNumero/segundoNumeroB;
    }

    public double multiplicar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("multipplicar", primerNumero, segundoNumeroB, primerNumero*segundoNumeroB);
        return multi1 = primerNumero*segundoNumeroB;
    }
   
    public double raiz(double primerNumero){
      this.registrarTransaccion2("raiz", primerNumero, (double)Math.sqrt (primerNumero) );
      return raiz =(double)Math.sqrt (primerNumero);   
    }
    public int potencia(int primerNumeroB, int segundoNumeroB){
        this.registrarTransaccion("Potencia", primerNumeroB, segundoNumeroB, (int) Math.pow (primerNumeroB, segundoNumeroB) );
        return potencia = (int) Math.pow (primerNumeroB, segundoNumeroB);
    }
    public double redondear(double primerNumero){
         this.registrarTransaccion2("redondear", primerNumero, (long) Math.round (primerNumero) );
         return redondear = (long) Math.round (primerNumero);
    }
     public double numeroAleatorio(){
         return numeroAleatorio =(double) Math.random ();
    } 
     
     
     //get and set
    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return this.tipoCalculadora;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setColor(String cualquierColor){
        this.color=cualquierColor;
    }

    public String getColor(){
        return this.color;
    }
    
    //Arreglos  
    public void registrarTransaccion2(String tipo, double primerParametro, double resultado){
      indiceVector=indiceVector+1;
      vectorTransacciones[indiceVector]= primerParametro+""+ tipo+""+" resultado: "+resultado;
        
    }
     public void registrarTransaccion(String tipo, double primerParametro, double segundoParametro, double resultado){
      indiceVector=indiceVector+1;
      vectorTransacciones[indiceVector]= primerParametro+""+ tipo+""+segundoParametro+" resultado: "+resultado;
        
    }
     
     public void mostrarTransaccionesRealizadas(){
          try{   
              System.out.println(vectorTransacciones.length);
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i]!=null){
                    System.out.println(vectorTransacciones[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }
     
       public void almacenarNumero(int numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }

    public void  mostrarNumeros(){
        for(int i=0; i<this.vector.length; i++){
            if(this.vector[i]!=0){
                System.out.println(vector[i]);
    }
            
            
}
}
}
    
    
   