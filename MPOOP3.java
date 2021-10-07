import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
class Main {
  public static void main(String[] args) {
    System.out.println("*****************Arreglos******************");
    int num[]; //heredada de c
    int[] num1; //recomendada

    num1 = new int [10];
    int[] num2 = {1,2,3,4,5};

    System.out.println("*****************For each******************");
    for(int o : num2){
      System.out.println(o);
    }
    System.out.println("*****************Concatenar cadenas******************");
    String s = new String("Hola Mundo");//Objeto
    String s1 = "Hola Mundo s1"; //Primitiva -> recomendada
    System.out.println(s);
    System.out.println(s1);

    String nombre = "Sebastian";
    String apellido = "Vazquez";

    String nombreCompleto = nombre + " " + apellido;
    System.out.println(nombreCompleto);

    System.out.println("*****************Operador punto******************");
    System.out.println("Numero de elementos del arreglo: "+ num2.length);
    System.out.println("Elementos de apellido "+apellido.length());

    System.out.println(nombreCompleto.toUpperCase());
    System.out.println(nombreCompleto);

    System.out.println("*****************Wrapper y Autoboxing******************");
    int l = 25; //Primitivo
    Integer k = new Integer(50); //Wrapper
    Integer m = 66; //Primitivo

    String s3 = k.toString();
    System.out.println(s3);
    int r = m;
    String s4 = r +"";
    System.out.println(s4);

    System.out.println("*****************Colecciones******************");



    System.out.println("*****************ArrayList******************");

    ArrayList<Integer> miArrayList = new ArrayList<Integer>();
    miArrayList.add(99);
    miArrayList.add(6);
    System.out.println(miArrayList.size());
    System.out.println(miArrayList.get(0));
    miArrayList.add(77);
    miArrayList.add(0,-9);
    System.out.println("***");
    for(Integer e : miArrayList)
      System.out.println(e);

    System.out.println("*****************Hashtable******************");
    Hashtable<String,Integer> miTabla = new Hashtable<String,Integer>();
    miTabla.put("Sebastian",22222222);
    miTabla.put("Legle",6666666);
    miTabla.put("Gus",99999999);
    System.out.println("Numero de elementos en tabla " + miTabla.size());
    
    System.out.println("*****************Enumeration******************");
    String clave;
    Integer valor;

    Enumeration<String> iteraClaves = miTabla.keys();
    while(iteraClaves.hasMoreElements()){
      clave = iteraClaves.nextElement();
      valor = miTabla.get(clave);
      System.out.println("Clave: "+clave+" Valor: "+valor);
    }
    System.out.println("*******Math********");
    System.out.println(Math.PI);
    System.out.println(Math.abs(-9));
    System.out.println(Math.pow(2.5,3));
    System.out.println(Math.sqrt(9));
    System.out.println(Math.max(6,99));

    System.out.println("*******Date********");
    Date hoy = new Date();
    System.out.println(hoy); 

    System.out.println("*******Formato Date********");
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println(formatoFecha.format(hoy));

    System.out.println("*******Calendar********");
    Calendar calendarioHoy = Calendar.getInstance();
    System.out.println(calendarioHoy);

    System.out.println("*******Formato Calendar********");
    String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
    fechaActual += (calendarioHoy.get(Calendar.MONTH)+1) + " de ";
    fechaActual += calendarioHoy.get(Calendar.YEAR);
    System.out.println(fechaActual);

  }
}
