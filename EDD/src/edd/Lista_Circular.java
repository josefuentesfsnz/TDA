package edd;
public class Lista_Circular {
    Nodo primero;
    public Lista_Circular(Nodo a){
        this.primero = a;
        this.primero.siguiente=this.primero;
    }
    
    public void insert_inicio(Nodo inser){
        if(this.primero==null){
            inser.siguiente=inser;
            this.primero=inser;
            return;
        }
        Nodo aux=this.primero;
        while(aux.siguiente !=this.primero){
            aux=aux.siguiente;
        }
        aux.siguiente=inser;
        inser.siguiente=this.primero;
        this.primero=inser;
    }
    
    public void insert_final(Nodo inser){
        if(this.primero==null){
            
            inser.siguiente=inser;
            this.primero=inser;
            return;
        }
        Nodo aux=this.primero;
        while(aux.siguiente !=this.primero){
            aux=aux.siguiente;
        }
        aux.siguiente=inser;
        inser.siguiente=this.primero;
    }
    
    public void eliminar(int pos){
        Nodo temp=this.primero;
        for (int i = 0; i < pos; i++) {
            temp.siguiente=temp;
        }
    }
    
    public String listar() {
        String todo="";
        
        Nodo aux = this.primero;
        if (aux == null)return "No hay nada";
        int cont = 0;
        System.out.println(aux.siguiente.dato!=this.primero.dato);
        
        
        while (aux.siguiente.dato != this.primero.dato)
        {
            System.out.println(cont+") "+aux.dato);
            //todo += (aux.dato+", ");
            aux=aux.siguiente;
            cont++;
        }
        todo+=aux.dato;
        System.out.println(todo);
        
        
        
        /*
        if(!(aux==null))
        {
            todo += aux.dato;
        }
        if (aux.siguiente.siguiente != null) 
        {
            todo += aux.siguiente.siguiente.dato;
            System.out.println(aux.siguiente.siguiente != null);
        }
        
        if (aux.siguiente == this.primero)
        {
            return todo;
        }
        */
        return todo;
    }
}
