package Examen;

import java.io.*;
import java.util.Scanner;
import java.util.function.Predicate;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.DPI;

import javax.sound.midi.MidiDevice.Info;
import javax.xml.soap.Node;



public class TiendaD {
	
	static Predicate DPI;
	public char elemento;
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		File datos =new File("datos.txt");
		
		if(!datos.exists()){
            try{
            FileWriter escribir=new FileWriter(datos,true);

		
		System.out.println("Bienvenidos a tienda ");
		System.out.println("Ingrese Nombre");
		String Nombre=sc.nextLine();
		System.out.println("ingres numero de DPI");
		int DPI=sc.nextInt();
		
	
		escribir.write(Nombre+"\r\n");
		escribir.write(DPI+"\r\n");
		
		
	
            }catch(IOException e){
                System.out.println("Error de Archivo");
}catch(Exception e){
                System.out.println("Error de tipo de dato o nulo");
}
	}

		
		
		
	 sc=new Scanner(System.in);
	 
		
	System.out.println("1.Agregar");
	System.out.println("2. Quitar");
	System.out.println("3.listar");
	System.out.println("4.Colas");
	
	 int dec=0;
     dec=sc.nextInt();
     switch(dec){
         case 1:
            if (agregar()){
            	System.out.println("Se agregaron datos");
            }
         break;
         case 2:
            if ( quitar()){
            	System.out.println("se borraron los datos");
            }
         break;
         case 3:
           if ( listar ()){
        	   System.out.println("se listo ");
           }
         case 4:
              colas ();
         default:
	   				
	
     while(dec!=9);
		}
         break;
        
         
     }

	private static boolean agregar() {
		private Node DPI1;
		void pila (){
			DPI = null;
		
		}
		Public boolean PilaVacia1(){
			if(DPI ==null){
				return true ;
				
			}else{
				return false;
			}
		}

	public void insertar (int dato){
		Nodo nuevo = new Nodo (dato);
		nuevo.siguiente=DPI;
		DPI = nuevo;
		
		  int dato=100;
			public Object siguiente;
		     nodo.siguiente;
		     
		     
		     nodo(int dato){
		    	   
		    	 
		    	 this.dato=dato;
		    	 this.siguiente=null;
		     }
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

	private static void colas() {
private static nodo Nombre;
private nodo DPI1;
		
		public void cola(){
			Nombre = null;
			DPI= null;
			
		}
	public static boolean colaVacia(){
		if (Nombre ==null ){
			return true;
			
		}else{
			return false;
	}
	}
	public void insertar  (){
		
		nodo nuevo =new nodo(0);
		nuevo.siguiente = null;
		if (colaVacia ()){
			Nombre = nuevo;
			DPI = nuevo;
			
		}else{
			DPI.siguiente = nuevo;
			DPI = nuevo;
			
			
		}
	}
	
		
		
	

	private static  quitar() {
		if (colaVacia()){
			System.out.println("cola vacia");
		} aux = Nombre.dato;
		
		if (Nombre == DPI ){
		    Nombre = null;
			DPI = null;
		}else{
			Nombre = (nodo) Nombre.siguiente;
		}
		System.out.println("Eliminado"+ aux);
		return aux;
	}
	if (PilaVacia()){
		System.out.println("la pila esta vacia");
		
	}else{
		Node DPI_;
		int aux= DPI.dato:
			DPI_=DPI.siguiente:
				System.out.println("el dato eliminado es ;"+aux);
	}
}

	
	public static boolean  listar (){ 
		nodo t = Nombre;
		int aux;
		while (t!= null){
			System.out.println(t.elemento);
			t=(nodo) t.siguiente;
		}

		return false;
	}
	
	}


