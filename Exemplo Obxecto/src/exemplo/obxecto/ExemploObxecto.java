//Ejemplo objecto
package exemplo.obxecto;

public class ExemploObxecto {

    public static void main(String[] args) {
        Semaforo unSemaforo=new Semaforo();//instancio obxecto tipo semaforo
        unSemaforo.darCor("Verde");
        String respuesta=unSemaforo.dimeCor();
        System.out.println("Color semaforo = "+respuesta);
        Semaforo outroSemaforo=new Semaforo();//Otro objecto
        outroSemaforo.darCor("Rojo");
        respuesta = outroSemaforo.dimeCor();
        //String respuesta2=outroSemaforo.dimeCor();
        System.out.println("Color Semaforo 2 = "+respuesta);
        //tamen
        System.out.println("Color Semaforo 3 = "+outroSemaforo.dimeCor());
    
    }
    
}
