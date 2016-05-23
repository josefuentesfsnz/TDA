package edd;

public class Recursividad
{
    
    public void contar(int desde, int hasta){
        System.out.println(desde);
        if (desde != hasta) {
            contar(desde+1,hasta);
        }
    }
    public int factorial(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return n * this.factorial(n-1);
    }
    public int fibonacci (int n){
        if (n == 1 || n == 2)return 1;
        
        return this.fibonacci(n-1) + this.fibonacci(n-2);
    }
    
    public void insertarNodo(Nodo aux, Nodo n){
        if (aux.siguiente == null) {
            aux.siguiente = n;
        }else{
            this.insertarNodo(aux.siguiente, n);
        }
    }
    
    public void Insertar_recursivo()
    {
        
    }
}
