package edd;
//hola
public class Lista_NDE {
    Nododoble primero;
    Nododoble ultimo;

    public Lista_NDE(Nododoble primero, Nododoble ultimo)
    {
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public Lista_NDE(){}
    
    void InsertarInicio (Nododoble n){
        /*
        si el primero es nulo
        agrego el nodo al principio
        */
        if (this.primero == null) {
            this.primero = n;
            this.ultimo = n;
            return;
        }
        /*
        existe un nodo primero
        debemos hacer que el nuevo nodo sea el primero
        y el ultimo se mantiene igual
        */
        n.sig = this.primero;
        this.primero.ant = n;
        this.primero=n;
        return;
    }
    
    void InsertarOrdenadoXdato (Nododoble n){
        //si el primero es nulo
        if(this.primero == null){
            this.InsertarInicio(n);
            return;
        }
        if (n.valor < this.primero.valor) {
            n.sig = this.primero;
            this.primero.ant = n;
            this.primero = n;
            return;
        }
        if (this.ultimo.valor < n.valor) {
            n.ant = this.ultimo;
            this.ultimo.sig = n;
            this.ultimo=n;
            return;
        }
        //SI N ES MAYOR QUE EL PRIMERO
        Nododoble aux = this.primero;
        //mientras n sea mayor que aux
        while (aux.valor < n.valor) {            
            aux = aux.sig;
        }
        n.ant=aux.ant;
        n.sig = aux;
        aux.ant.sig = n;
        aux.ant=n;
    }
    
    void mostrar(){
        Nododoble aux = this.primero;
        if (aux != null) {
            while (aux!=null) {                
                System.out.print("( "+aux.valor+" )");
                aux = aux.sig;
            }
            System.out.println("");
            
        }
    }
    
    void insertarXposicion(Nododoble n, int pos){
        
        if (pos == 0)
        {
            this.InsertarInicio(n);
            return;
        }
        int cont=0;
        Nododoble aux = this.primero;
        while (aux != null && cont < pos) {            
            aux = aux.sig;
            cont++;
        }
        
        if (aux!=null) {
            n.ant = aux.ant;
            aux.ant=n;
            n.ant.sig=n;
            n.sig=aux;
            aux.ant=n;
            return;
        }
        if (aux == null) {
            n.ant=this.ultimo;
            this.ultimo.sig=n;
            this.ultimo=n;
        }
    }
    
    Nododoble sacar_en(int pos){
        
        if (pos == 0) {
            Nododoble aux=this.primero;
            this.primero = this.primero.sig;
            this.primero.ant = null;
            aux.sig=null;
            return aux;
        }
        
        Nododoble aux=this.primero;
        int cont = 0;
        while (aux != null && cont < pos) {
            aux=aux.sig;
            cont++;
        }
        if (aux != null) {
            if (aux == this.ultimo) {
                this.ultimo=this.ultimo.ant;
                aux.ant = null;
                this.ultimo.sig=null;
                return aux;
            }
            aux.ant.sig = aux.sig;
            aux.sig.ant=aux.ant;
            aux.ant = null;
            aux.sig = null;
            return aux;
            
        }
        System.out.println("el nodo que quisiste sacar no existe");
        return null;
    }
    
    int buscar(Nododoble buscado){
        
        return -1;
    }
    
    void Intercambiar(int pos1, int pos2) {
        Nododoble temp1;
        Nododoble temp2;
        
        if (pos1 < pos2) {
            temp1 = this.sacar_en(pos2);
            temp2 = this.sacar_en(pos1);
            this.insertarXposicion(temp1, pos1);
            this.insertarXposicion(temp2, pos2);
        }else{
            temp2 = this.sacar_en(pos1);
            temp1 = this.sacar_en(pos2);
            this.insertarXposicion(temp2, pos2);
            this.insertarXposicion(temp1, pos1);
            
            
        }
        
        
        
        
    }
}
