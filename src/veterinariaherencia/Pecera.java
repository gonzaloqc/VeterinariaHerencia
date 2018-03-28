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
public class Pecera extends Hogar{
    
        private boolean incluyeAccesorios;
    
         //Comportamiento
     public Pecera (Material material,  Tamano tamano, Color color, boolean ocupado,
            String dueno, boolean limpio) {
           
        super(material, tamano, color, ocupado, dueno, limpio);
        }
       
        @Override
    public void Limpiar(){
        if(isIncluyeAccesorios()){
          Vaciar();
          SacarAccesorios();
          Lavar();
          PonerAccesorios();
          Llenar();
        }else{
          Vaciar();
          Lavar();
          Llenar();
        }
        limpio = true;
         System.out.println("La Pecera esta limpia");
      }  
      
    public void PonerAccesorios(){
        setIncluyeAccesorios(true);
        System.out.println("Accesorios colocados");
    }

   public void SacarAccesorios(){  
       setIncluyeAccesorios(false);
        System.out.println("Accesorios retirados");
    }
   
   public void Vaciar(){
       System.out.println("Se vacio la pecera");
   }
  
   public void Llenar(){
       System.out.println("Se lleno la pecera");
   }
    
   public void Lavar(){
       System.out.println("Se lavo la Pecera");
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
