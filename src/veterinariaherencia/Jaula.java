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
public class Jaula extends Hogar {
        private boolean incluyeAccesorios;
    
    //Comportamiento
      public Jaula (Material material,  Tamano tamano, Color color, boolean ocupado,
            String dueno,boolean limpio, boolean accesorios) {
           
        super(material, tamano, color, ocupado, dueno, limpio);
        incluyeAccesorios=accesorios;
        }

        @Override
    public void Limpiar(){
      if(isIncluyeAccesorios()){
          SacarAccesorios();
          Aspirar();
          PonerAccesorios();
        }else{
            Aspirar();
        }
       limpio = true;
       System.out.println("La Jaula esta limpia");
      }  
      
    public void PonerAccesorios(){
        setIncluyeAccesorios(true);
        System.out.println("Accesorios colocados");
    }

   public void SacarAccesorios(){  
       setIncluyeAccesorios(false);
        System.out.println("Accesorios retirados");
    }
    
   public void Aspirar(){
       System.out.println("Se aspiro la Jaula");
   }
      
    /**
     * @return the incluyeAccesorios
     */
    public boolean isIncluyeAccesorios() {
        return incluyeAccesorios;
    }

    /**
     * @param incluyeAccesorios the incluyeAccesorios to set
     */
    public void setIncluyeAccesorios(boolean incluyeAccesorios) {
        this.incluyeAccesorios = incluyeAccesorios;
    }
      
}
