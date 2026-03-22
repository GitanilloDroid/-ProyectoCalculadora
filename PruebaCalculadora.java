public class PruebaCalculadora {
    public static void main(String[] args) {
        System.out.println("========== CALCULADORA ==========\n");
        
        // Crear una calculadora con dos números
        Calculadora calc = new Calculadora(10, 3);
        
        System.out.println("Número 1: 10");
        System.out.println("Número 2: 3\n");
        
        // Probar suma
        System.out.println("--- SUMA ---");
        System.out.println("10 + 3 = " + calc.suma());
        System.out.println("Con realizarOperacion: " + calc.realizarOperacion("suma"));
        System.out.println();
    }
}