import java.util.Queue;
import javax.swing.JOptionPane;

public class menuPC 
{
    public int VerificarOptPc()
    {
        String input;
        int vrUsu = 0; 
        boolean validInput = false;
        do 
        {
            input = JOptionPane.showInputDialog("------ COMPUTADOR ------\n" +
                                                "1.Registrar Computador\n" +
                                                "2.Prestar Computador\n" +
                                                "3.Modificar Computador\n" +
                                                "4.Devolver Computador\n" + 
                                                "5.Inventario \n" + 
                                                "6.Eliminar Computador\n" +
                                                "7.Menu Principal\n");
            if (input != null && input.matches("\\d+")) 
            {
                vrUsu = Integer.parseInt(input);
                if (vrUsu >= 1 && vrUsu <= 7) 
                {
                    validInput = true;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Opción no válida, reintente por favor");
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            }

        } while (!validInput);

        return vrUsu;
    }
    public Queue<ObjComputador> MenuComputador(Queue<ObjComputador> pc)
    {
        int opc;
        do 
        {
            metodos met = new metodos();
            menuPC m = new menuPC();
            opc = m.VerificarOptPc();
            switch (opc) 
            {
                case 1:
                    pc = met.IngresarComputador(pc);
                    break;
                case 2:
                    pc = met.PrestarComputador(pc);
                    break;
                case 3:
                    pc = met.ModificarComputador(pc);
                    break;
                case 4:
                    pc = met.DevolverComputador(pc);
                    break;
                case 5:
                    pc = met.InventarioComputador(pc);
                    break;
                case 6:
                    pc = met.EliminarComputador(pc);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Se ha salido del menú de Computadores.");
            }
        } while (opc != 7);

        return pc;
    }
    
}
