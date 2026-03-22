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

        // Probar resta
        System.out.println("--- RESTA ---");
        System.out.println("10 - 3 = " + calc.resta());
        System.out.println("Con realizarOperacion: " + calc.realizarOperacion("resta"));
        System.out.println();
        
        // Probar multiplicación
        System.out.println("--- MULTIPLICACIÓN ---");
        System.out.println("10 * 3 = " + calc.multiplicar());
        System.out.println("Con realizarOperacion: " + calc.realizarOperacion("multiplicar"));
        System.out.println();
        
        // Probar división
        System.out.println("--- DIVISIÓN ---");
        System.out.println("10 / 3 = " + calc.dividir());
        System.out.println("Con realizarOperacion: " + calc.realizarOperacion("dividir"));
        System.out.println();
        
        // Probar módulo
        System.out.println("--- MÓDULO ---");
        System.out.println("10 % 3 = " + calc.modulo());
        System.out.println("Con realizarOperacion: " + calc.realizarOperacion("modulo"));
        System.out.println();
        
        // Prueba con división entre 0
        System.out.println("--- PRUEBA CON DIVISIÓN ENTRE 0 ---");
        Calculadora calc2 = new Calculadora(5, 0);
        System.out.println("Dividir 5 entre 0:");
        calc2.dividir();
        System.out.println();
        
        System.out.println("================================");
    }
}