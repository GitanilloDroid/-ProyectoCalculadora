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

     // Método multiplicar
    public int multiplicar() {
        return numero1 * numero2;
    }

    // Método dividir
    public int dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }
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


     // Método resta
    public int resta() {
        return numero1 - numero2;
    }

    // Método módulo (resto de la división)
    public int modulo() {
        if (numero2 != 0) {
            return numero1 % numero2;
        } else {
            System.out.println("Error: No se puede hacer módulo entre 0");
            return 0;
        }
    }

}