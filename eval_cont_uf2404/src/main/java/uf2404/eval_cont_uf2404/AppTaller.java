package uf2404.eval_cont_uf2404;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uf2404.eval_cont_uf2404.clases.Cliente;
import uf2404.eval_cont_uf2404.clases.Reparacion;
import uf2404.eval_cont_uf2404.clases.Taller;
import uf2404.eval_cont_uf2404.clases.Vehiculo;

import java.util.Scanner;

@SpringBootApplication
public class AppTaller {

    public static void main(String[] args) {
        SpringApplication.run(AppTaller.class, args);

        // Simulación en la aplicación
        Taller taller = new Taller("Taller Mecánico XYZ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, telefono);

        taller.registrarCliente(cliente);

        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, cliente);

        cliente.agregarVehiculo(vehiculo);

        System.out.print("Ingrese la descripción de la reparación: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el costo de la reparación: ");
        double costo = scanner.nextDouble();
        Reparacion reparacion = new Reparacion(descripcion, costo, matricula, marca, modelo);

        taller.registrarReparacion(reparacion);

        taller.listarReparaciones();
        scanner.close();
    }
}
