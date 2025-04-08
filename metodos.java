import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class metodos 
{
    Scanner sc = new Scanner(System.in);
    public Queue<ObjComputador> IngresarComputador(Queue<ObjComputador> c) 
    {
        ObjComputador pc = new ObjComputador();
        //Valdar vacios 
        String serial = JOptionPane.showInputDialog("Ingrese el serial");
        while (serial == null || serial.trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Error: El serial no puede estar vacío.");
            serial = JOptionPane.showInputDialog("Ingrese el serial");
        }
        pc.setSerial(serial);
        // Validar vacios
        String marca = JOptionPane.showInputDialog("Ingrese la marca");
        while (marca == null || marca.trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Error: La marca no puede estar vacía.");
            marca = JOptionPane.showInputDialog("Ingrese la marca");
        }
        pc.setMarca(marca);
        String entrada;
        // Validar int
        entrada = JOptionPane.showInputDialog("Ingrese la memoria RAM:");
        while (!entrada.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.");
            entrada = JOptionPane.showInputDialog("Ingrese la referencia (número entero):");
        }
        pc.setMemoriaCam(Integer.parseInt(entrada));

        // Validar int
        entrada = JOptionPane.showInputDialog("Ingrese la capacidad del disco duro: ");
        while (!entrada.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.");
            entrada = JOptionPane.showInputDialog("Ingrese la cantidad (número entero):");
        }
        pc.setDiscoDuro(Integer.parseInt(entrada));
        
        // Validar decimal
        /*entrada = JOptionPane.showInputDialog("Ingrese el precio");
        while (!entrada.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            entrada = JOptionPane.showInputDialog("Ingrese el precio (número válido):");
        }
        pc.setPrecio(Double.parseDouble(entrada));*/
        pc.setDisponible(true);
        return ValidarPc(c, pc);
    }
    public void Mostrar(Queue<ObjComputador> c) 
    {
        for (ObjComputador pc : c) 
        {
            System.out.println("Serial: " + pc.getSerial());
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Estado: " + (pc.isDisponible() ? "Disponible" : "No disponible"));
            System.out.println("-----------------------");
        }

    }
    public Queue<ObjComputador> ValidarPc(Queue<ObjComputador> c, ObjComputador pc) 
    {
        boolean encontrado = false;
        for (ObjComputador compu : c) 
        {
            if (compu.getSerial().equalsIgnoreCase(pc.getSerial())) 
            {
                encontrado = true;
                JOptionPane.showMessageDialog(null, "El dispositivo ya existe");
                break;
            }
        }
        if (!encontrado) 
        {
            c.offer(pc);
            JOptionPane.showMessageDialog(null, "Dispositivo ingresado correctamente");
        }
        Mostrar(c);
        return c;
    }
    public void MostrarDisponibles( Queue<ObjComputador> c) 
    {
        for (ObjComputador o : c) {
            if (o.isDisponible() == true) {
                System.out.println("Serial : " + o.getSerial());
                System.out.println("Marca : " + o.getSerial());
                System.out.println("Disponible :  Si");
                System.out.println("-----------------------");
            }
        }
    }
    public Queue<ObjComputador> PrestarComputador(Queue<ObjComputador> c) 
    {
        String serial = " ";
        while (c.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados");
            c = IngresarComputador(c);
        }
        boolean hayDisponibles = false;
        for (ObjComputador pc : c) 
        {
            if (pc.isDisponible()) 
            {
                hayDisponibles = true;
                break;
            }
        }
        if (!hayDisponibles) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos disponibles para prestar.");
            return c; // Termina el método si no hay dispositivos disponibles
        }
        System.out.println("\nELIGE UN DISPOSITIVO DE LA LISTA\n");
        MostrarDisponibles(c);
        
        boolean serialEncontrado = false;
        while (!serialEncontrado) 
        {
            System.out.println("\nIngrese el serial");
            serial = sc.next();
            for (ObjComputador pc : c) 
            {
                if (pc.getSerial().equalsIgnoreCase(serial) && pc.isDisponible()) 
                {
                    serialEncontrado = true;
                    System.out.println("Nombre del usuario");
                    pc.setNomEstudiante(sc.next());
                    System.out.println("Carnet del usuario");
                    pc.setCarnet(sc.next());
                    pc.setDisponible(false);
                    System.out.println("Dispositivo prestado correctamente");
                    break;
                }
            }
            if (!serialEncontrado) 
            {
                JOptionPane.showMessageDialog(null, "El serial no existe. Intente nuevamente.");
            }
        }
        return c;
    }
    public Queue<ObjComputador> ModificarComputador(Queue<ObjComputador> c) 
    {
        while (c.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados");
            c = IngresarComputador(c);
        }
        System.out.println("\nIngrese el serial del dispositivo a modificar");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjComputador pc : c) 
        {
            if (pc.getSerial().equalsIgnoreCase(serial)) 
            {
                encontrado = true;
                System.out.println("\n---MODIFICAR--- \n" + "1.Memoria Ram\n" + "2.Disco Duro\n");
                int opt = -1;
                while (!sc.hasNextInt() || (opt = sc.nextInt()) < 1 || opt > 2) 
                {
                    System.out.println("Opcion no valida, reintente por favor");
                    sc.next();
                }
                switch (opt) 
                {
                    case 1:
                        System.out.println("\nIngrese la nueva memoria Ram:");
                        pc.setMemoriaCam(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("\nIngrese la nueva capacidad del disco duro:");
                        pc.setDiscoDuro(sc.nextInt());
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                System.out.println("\nDISPOSITIVO MODIFICADO\n" +
                                    "Serial: " + pc.getSerial() + "\n" +
                                    "Memoria RAM: " + pc.getMemoriaCam() + "\n" +
                                    "Disco Duro: " + pc.getDiscoDuro() + "\n" );
            }
        }
        if (!encontrado) 
        {
            JOptionPane.showMessageDialog(null, "El serial ingresado no existe.");
            return c;
        }
        return c;
    }
    public Queue<ObjComputador> DevolverComputador(Queue<ObjComputador> c) 
    {
        String serial = " ";
        while (c.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados");
            c = IngresarComputador(c);
        }
        boolean serialEncontrado = false;
        System.out.println("\nIngrese el serial");
        serial = sc.next();
        for (ObjComputador pc : c) 
        {
            if (pc.getSerial().equalsIgnoreCase(serial) && !pc.isDisponible()) 
            {
                serialEncontrado = true;
                pc.setDisponible(true);
                System.out.println("Dispositivo devuelto correctamente");
                break;
            }
        }
        if (!serialEncontrado) 
        {
            JOptionPane.showMessageDialog(null, "El serial no existe");
        }
        return c;
    }
    public Queue<ObjComputador> InventarioComputador(Queue<ObjComputador> c) 
    {
        while (c.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados");
            c = IngresarComputador(c);
        }
        System.out.println("\nINVENTARIO\n");
        for (ObjComputador pc : c) 
        {
            System.out.println("Serial: " + pc.getSerial());
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Memoria RAM: " + pc.getMemoriaCam());
            System.out.println("Disco Duro: " + pc.getDiscoDuro());
            System.out.println("Estado: " + (pc.isDisponible() ? "Disponible" : "No disponible"));
            System.out.println("-----------------------");
        }
        return c;
    }
    public Queue<ObjComputador> EliminarComputador(Queue<ObjComputador> c)
    {
        String serial = " ";
        while (c.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados");
            c = IngresarComputador(c);
        }
        boolean serialEncontrado = false;
        System.out.println("\nIngrese el serial del dispositivo a eliminar");
        serial = sc.next();
        for (ObjComputador pc : c) 
        {
            if (pc.getSerial().equalsIgnoreCase(serial)) 
            {
                serialEncontrado = true;
                c.remove(pc);
                System.out.println("Dipositivo eliminado correctamente\n");
                Mostrar(c);
                break;
            }
        }
        if (!serialEncontrado) 
        {
            JOptionPane.showMessageDialog(null, "El serial no existe");
        }
        return c;
    }

    /*FastFood pedidoDespachado = p.poll(); // elimina y devuelve el primero
        System.out.println("Pedido despachado: " + pedidoDespachado.get); */
}
