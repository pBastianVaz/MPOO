class Profesor{
  String nombre;
  int edad;
  String materia;
  boolean hombre;
  boolean buenProfe;

  public Profesor(){}
  public Profesor(String nombre, int edad, String materia, boolean hombre, boolean buenProfe){
    this.nombre = nombre;
    this.edad = edad;
    this.materia = materia;
    this.hombre = hombre;
    this.buenProfe = buenProfe;
  }

  public void darClase(boolean clase){
    if(clase){
      System.out.println("El profesor "+nombre+" esta dando clase.");
    }else{
      System.out.println("El profesor "+nombre+" no esta dando clase");
    }
  }

  public void califica(){
    System.out.println("El profesor "+nombre+" esta calificando examenes");
  }

  public void egreso(boolean egresoFi){
    if(egresoFi){
      System.out.println("El profesor "+nombre+" es egresado de la FI");
    }else{
      System.out.println("El profesor "+nombre+" no es egresado de la FI");
    }
  }

  public void zoom(){
    if(edad > 60){
      System.out.println("El profesor "+nombre+" es lo suficientemente mayor para no saber usar zoom");
    }else{
      System.out.println("El profesor "+nombre+" es lo suficientemente joven para saber usar zoom");
    }
  }

  public void descanso(){
    System.out.println("El profesor esta muy cansado pero no puede ir a dormir porque no ha acabado de calificar tareas :(");
  }

  @Override
  public String toString(){
    return "Profesor{"+"nombre="+nombre+" edad="+edad+" materia="+materia+" hombre="+hombre+" Es bueno="+buenProfe+"}";
  }
  
  
}
