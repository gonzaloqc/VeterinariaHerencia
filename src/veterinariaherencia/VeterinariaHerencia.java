package veterinariaherencia;

import java.util.ArrayList;

/**
 *
 * @author utku30
 */
public class VeterinariaHerencia {
    
    private ArrayList<Perro> perros;
    private ArrayList<Gato> gatos;
    private ArrayList<Jaula> jaulas;
    private ArrayList<Pecera> peceras;
    private ArrayList<Plato> platos;
    private ArrayList<Animal> animales;
    
    public static void main(String[] args) {
   
        VeterinariaHerencia vet = new VeterinariaHerencia();
        
        vet.ListarPerros();
        vet.ListarGatos();
    }

       public VeterinariaHerencia (){
           perros = new ArrayList<>();
           gatos = new ArrayList<>();
           jaulas = new ArrayList<>();
           peceras = new ArrayList<>();
           platos = new ArrayList<>();
           animales = new ArrayList<>();
           InicializarVeterinaria();
       }
           
      public void InicializarVeterinaria(){
          perros.add(new Perro("terrabald", "marron","Toby"));
          perros.add(new Perro("cordubensis", "negro"));
          perros.add(new Perro("setter", "gris","Picante"));
          
          gatos.add(new Gato("siames","crema","Daisy"));
          gatos.add(new Gato("comun","marron"));
          
          jaulas.add(new Jaula(Material.METAL,Tamano.MEDIANO,Color.BLANCO,false,"Jose",false,false));
          jaulas.add(new Jaula(Material.MADERA,Tamano.GRANDE,Color.PLATEADO,false,"Marcos",true,true));
          
          peceras.add(new Pecera(Material.Vidrio,Tamano.CHICO,Color.TRASPARENTE,true,"Adriana",false));
          peceras.add(new Pecera(Material.Vidrio,Tamano.CHICO,Color.TRASPARENTE,true,"Marcos",true));
          
          platos.add(new Plato(Material.METAL,"Chino",Color.PLATEADO,Tamano.CHICO,100.50));
          
                
               }
      
    
    public void ListarPerros(){
            System.out.println("Perros registrados: ");
            for (Perro p: perros){
            System.out.println(p);
           }
    /*for (Perro p: perro){
        p.Ladrar();
        System.out.println(p.getRaza());
        System.out.println(p.getColor());
        System.out.println(p.getNombre());
        }
    */   }
    public void ListarGatos(){
        System.out.println("Gatos registrados: ");
        for (Gato p: gatos){
            System.out.println(p);
           }
        
    /*for (Gato p: gato){
        p.Maullar();
        System.out.println(p.getRaza());
        System.out.println(p.getColor());
        System.out.println(p.getNombre());
         }
     */  }
    
    public void ListarJaulas(){
    System.out.println("Cuchas registrados: ");
    for (Jaula p: jaulas){
        System.out.println(p);
    }
    
    }
    
    public void ListarAnimales(){
        System.out.println("Animales Registrados:");
        for(Animal a: animales){
            System.out.println(a);
        
        }
    
    }
    
    public void AnimalesEmitenSonido(){
        for(Animal a : animales){
            a.EmitirSonido();
        }
    
    } 
            
       
}

