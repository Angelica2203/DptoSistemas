import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class principal 
{
    public int Menu()
    {
        String input;
        int vrUsu = 0; 
        boolean validInput = false;
        do 
        {
            input = JOptionPane.showInputDialog("------ BIENVENIDO ------\n" +
                                                "1.Computador \n" +
                                                "2.Tablet\n" +
                                                "3.Salir\n");
            if (input != null && input.matches("\\d+")) 
            {
                vrUsu = Integer.parseInt(input);
                if (vrUsu >= 1 && vrUsu <= 3) 
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
    public static void main(String[] args) 
    {
        Queue<ObjComputador> pc = new LinkedList<>();
        Queue<ObjTable> tablet = new LinkedList<>();
        int opc;
        do 
        {
            principal m = new principal();
            opc = m.Menu();
            switch (opc) 
            {
                case 1:
                    menuPC compu = new menuPC();
                    pc = compu.MenuComputador(pc);
                    break;
                case 2:
                    menuTablet tab = new menuTablet();
                    tablet = tab.MenuTablet(tablet);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    break;
            }
            
        } while (opc != 3);
    }
}
