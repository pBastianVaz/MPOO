class Main {
  public static void main(String[] args) {
    
    Coche coche1 = new Coche();
    coche1.anio = 2020;
    coche1.automatico = true;
    coche1.color = "blanco";
    coche1.marca = "Nissan";
    coche1.numPuertas = 5;
    coche1.potencia = 150;
    coche1.encender();
    coche1.avanzar(true);
    coche1.frenar(true);
    coche1.apagar();
    coche1.abrirPuertas(4);
    System.out.println("#######################");
    Coche coche2 = new Coche("Mazda", 2021, "negro", 3, false, 200);
    coche2.encender();
    coche2.avanzar(false);
    coche2.frenar(false);
    coche2.apagar();
    coche2.abrirPuertas(5);
    System.out.println("#######################");
    System.out.println(coche1);
    System.out.println(coche2);
    System.out.println("#######################");
    Perro perro1 = new Perro("Rex",(float) 5.8,2,6,"Chihuahua",false);//-> to cast / casteo
    Perro perro2 = new Perro("Firulais",6.4f,6,10,"Puddle",true);
    System.out.println(perro1);
    System.out.println(perro2);
    System.out.println("#######################");
    Estudiante estudiante1 = new Estudiante("Legle",19,"tercero","Ingenieria electrica electronica",9.3f,true,false);
    Estudiante estudiante2 = new Estudiante("Pamela",19,"tercero","Ingenieria en computacion",8.6f,false,true);
    System.out.println(estudiante1);
    System.out.println(estudiante2);
    estudiante1.estudiar(true);
    estudiante1.comer();
    estudiante1.estres(false);
    estudiante1.prom();
    estudiante1.mimir();
    estudiante2.estudiar(false);
    estudiante2.comer();
    estudiante2.estres(true);
    estudiante2.prom();
    estudiante2.mimir();
    System.out.println("#######################");
    Profesor profesor1 = new Profesor("Miguel",65,"Quimica",true,false);
    Profesor profesor2 = new Profesor("Regina",27,"Calculo",false,true);
    System.out.println(profesor1);
    System.out.println(profesor2);
    profesor1.darClase(false);
    profesor1.califica();
    profesor1.egreso(false);
    profesor1.zoom();
    profesor1.descanso();
    profesor2.darClase(true);
    profesor2.califica();
    profesor2.egreso(true);
    profesor2.zoom();
    profesor2.descanso();
  }
}
