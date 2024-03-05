import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {

        String nombreFactura = "";
        double precioProductoUno = 0.0;
        double precioProductoDos = 0.0;
        double montoTotalBruto = 0.0;
        double montoImpuesto = 0.0;
        double montoTotalNeto = 0.0;
        String salidaFactura = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre de la factura:");
        nombreFactura = teclado.nextLine();

        System.out.println("Introduce el precio del producto 1:");
        precioProductoUno = teclado.nextDouble();

        System.out.println("Introduce el precio del producto 2:");
        precioProductoDos = teclado.nextDouble();

        montoTotalBruto = precioProductoUno + precioProductoDos;

        montoImpuesto = montoTotalBruto * 0.19;

        montoTotalNeto = montoTotalBruto + montoImpuesto;

        salidaFactura = "La factura " + nombreFactura + " tiene un total bruto de " + montoTotalBruto + ", con un impuesto de " + montoImpuesto + " y el monto después de impuesto es de " + montoTotalNeto;

        System.out.println(salidaFactura);

    }
}
