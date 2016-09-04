package ee_t01_arrays;
import java.util.*;
import java.io.*;
public class ee_t01_arrays {
	 static ArrayList<Integer>numeros = new ArrayList<Integer>();
	    static ArrayList<Integer>ordenados= new ArrayList<Integer>();
	  public void leer(String archivo){
	    try{
	     FileReader fr= new FileReader(archivo);
	     BufferedReader br= new  BufferedReader(fr);
	     String linea;
	     while((linea=br.readLine())!=null){
	        int num= Integer.parseInt(linea);
	        numeros.add(num);
	        }
	    }
	    catch(Exception e){
	     System.out.println("error");
	    }
	    }
	  public void mostrar(){
	    for(int i=0;i<ordenados.size();i++){
	     System.out.println(ordenados.get(i));
	    }
	    } 
	  public void ordena(){
	    
	    int x=numeros.get(0);
	    int mayor;
	    int t=0;
	    for(int j=1;j<=x;j++){
	        mayor=0;
	      for(int l=1;l<numeros.size();l++){
	        if(numeros.get(l)>mayor){
	         mayor=numeros.get(l);
	         t=l;
	        }
	        }
	        ordenados.add(numeros.get(t));
	        numeros.remove(t);
	    }
	    }  
	  public static void main (String args[]){
		  ee_t01_arrays a= new ee_t01_arrays();
	    a.leer("archivo.txt");
	    if(numeros.size()!=(numeros.get(0)+1)){
	     System.out.println("El archivo no tiene el formato esperado");
	    }
	    a.ordena();
	    a.mostrar();
	    }  
}
