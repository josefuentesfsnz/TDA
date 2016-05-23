package edd;
public class EDD {
    
    public static void main(String[] args) 
    {
        Lista_NDE list = new Lista_NDE();
        list.InsertarOrdenadoXdato(new Nododoble(null, 4, null));
        list.InsertarOrdenadoXdato(new Nododoble(null, 5, null));
        list.InsertarOrdenadoXdato(new Nododoble(null, 1, null));
        list.InsertarOrdenadoXdato(new Nododoble(null, 3, null));
        list.insertarXposicion(new Nododoble(null, 2, null), 1);
        
        list.mostrar();
    }
                 
}
