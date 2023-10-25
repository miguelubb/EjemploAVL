public class EjemploAVL {
    public static void main(String[] args) {
        AvlTree<Persona> directorio= new AvlTree<Persona>();
        directorio.insert(new Persona(15,"Juan"));
        directorio.insert(new Persona(1,"Ana"));
        directorio.insert(new Persona(18,"Alex"));
        directorio.insert(new Persona(7,"Diego"));
        directorio.insert(new Persona(38,"Pablo"));
        directorio.insert(new Persona(17,"Caro"));
        directorio.insert(new Persona(8,"Caren"));
        directorio.printTree();
        if(directorio.contains(new Persona(7,"Diego"))){
            System.out.println("Si se encuentra Juan");
        }else{
            System.out.println("No se encuentra Juan");
        };
    }
}
