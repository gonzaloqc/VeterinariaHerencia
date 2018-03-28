/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaherencia;

/**
 *
 * @author utku27
 */
public class Loro extends Animal{
    
//Caracteristicas
    private final int alas = 2;
    private final int patas = 2;
    private boolean hablar;
    String frase ="Hola";
    
    //Comportamientos
    
    public Loro (String raza, String color, String nombre){
        super(raza,color,nombre);
    }
    
    public Loro (String raza, String color){
        super(raza, color);
    }
    
    public void Repetir (){
        System.out.println("Hola");
    }
    
    @Override
     public void EmitirSonido(){
           Repetir();
     }

    /**
     * @return the hablar
     */
    public boolean isHablar() {
        return hablar;
    }

    /**
     * @param hablar the hablar to set
     */
    public void setHablar(boolean hablar) {
        this.hablar = hablar;
    }
}
