public class Calculadora {

    private int numero1;
    private int numero2;
    
    // Constructor
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Método suma
    public int suma() {
        return numero1 + numero2;
    }

     // Método realizarOperación
    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        }
        if (operacion.equals("resta")) {
            return resta();
        }
        if (operacion.equals("multiplicar")) {
            return multiplicar();
        }
        if (operacion.equals("dividir")) {
            return dividir();
        }
        if (operacion.equals("modulo")) {
            return modulo();
        }
        System.out.println("Operación no reconocida");
        return 0;
    }

}