class Estudiante{
  String nombre;
  int edad;
  String semestre;
  String carrera;
  float promedio;
  boolean hombre;
  boolean depresion;

  public Estudiante(){}
  public Estudiante(String nombre, int edad, String semestre, String carrera, float promedio, boolean hombre, boolean depresion){
    this.nombre = nombre;
    this.edad = edad;
    this.semestre = semestre;
    this.carrera = carrera;
    this.promedio = promedio;
    this.hombre = hombre;
    this.depresion = depresion;
  }

  public void estudiar(boolean estudia){
    if(estudia){
      System.out.println("El estudiante "+nombre+" esta estudiando :)");
    }else{
      System.out.println("El estudiante "+nombre+" no esta estudiando :(");
    }
  }

  public void comer(){
    System.out.println("El estudiante "+nombre+" esta comiendo :9");
  }

  public void estres(boolean estres){
    if(estres){
      System.out.println("El estudiante "+nombre+" esta estresad@ :(");
    }else{
      System.out.println("El estudiante "+nombre+" no esta estresad@ :)");
    }
  }

  public void prom(){
    if(promedio < 9){
      System.out.println("El numero de inscripcion de "+nombre+" va a ser alto ya que tiene bajo promedio :(");
    }else{
      System.out.println("El numero de inscripcion de "+nombre+" va a ser bajo ya que tiene alto promedio :)");
    }
  }

  public void mimir(){
    System.out.println("El estudiante por fin va a dormir");
  }

  @Override
  public String toString(){
    return "Estudiante{"+"nombre="+nombre+" edad="+edad+" semestre="+semestre+" carrera="+carrera+" promedio="+promedio+" hombre="+hombre+" depresion="+depresion+"}";
  }

}
