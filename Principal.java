import java.io.InputStream;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        java.io.InputStream stream = System.in;
        java.util.Scanner scanner = new java.util.Scanner(stream);

        ConsultaDivisa consulta = new ConsultaDivisa();
        double input = 0;
        String menu = """
                ***********************************
                Bienvenido al conversor de monedas 
                ************************************
                1) Dólar =>> Peso argentino
                2)Peso argentino => Dolar
                3)Dólar =>> Real brasileño
                4)Real brasileno =>> Dolar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Ingresa una opción:
                """;
        System.out.println(menu);
        String entrada = scanner.nextLine();
        Divisa moneda = null;
            switch (entrada) {




                case "1":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("USD", "ARS", input);
                    System.out.println(moneda.conversion_result());
                    break;
                case "2":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("ARS", "USD", input);
                    System.out.println("el valor es: "+moneda.conversion_result());
                    break;
                case "3":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("USD", "BRL", input);
                    System.out.println(moneda.conversion_result());
                    break;
                case "4":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("BRL", "USD", input);
                    System.out.println(moneda.conversion_result());
                    break;
                case "5":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("USD", "COP", input);
                    System.out.println(moneda.conversion_result());
                    break;
                case "6":
                    System.out.println("Ingrese cantidad: ");
                    entrada = scanner.nextLine();
                    input = Double.parseDouble(entrada);
                    moneda = consulta.buscaDivisa("COP", "USD", input);
                    System.out.println(moneda.conversion_result());
                    break;
                case "7":
                    System.out.println("Salir");
                    break;


            }

    }
}
