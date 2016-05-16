package edd;

public class Cola{

 public Nodo primero; 

 

 public Cola(){ 

 } 

 

 public Nodo desencolar(){ 
     if(primero==null)return null; 
     Nodo aux = primero;
     primero = primero.siguiente;
     aux.siguiente=null;
     return aux;
 }

 public void encolar(Nodo n){
     
     if (primero == null) { 
         primero=n; 
     } else { 
         Nodo aux = primero; 
         while (aux.siguiente != null) { 
             aux=aux.siguiente; 
         } 
         aux.siguiente = n; 
     }
 }

}