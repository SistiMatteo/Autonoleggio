public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Marciello",6);
        Auto auto1 = new Auto(001, "TO69BOM", "bmw", "X7", 5);
        

        System.out.println(auto1);

        System.out.println(persona1);
        Persona persona2 = new Persona(persona1);
        System.out.println(persona2.toString());

        
    }

}
