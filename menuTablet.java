import java.util.Queue;
import javax.swing.JOptionPane;

public class menuTablet 
{
    public int VerificarOptTablet() 
    {
        String input;
        int vrUsu = 0; 
        boolean validInput = false;
        do 
        {
            input = JOptionPane.showInputDialog("------ TABLET ------\n" +
                                                "1.Registrar Tablet \n" +
                                                "2.Prestar Tablet\n" +
                                                "3.Modificar Tablet\n" +
                                                "4.Devolver Tablet\n" +
                                                "5.Inventario \n" +
                                                "6.Eliminar Tablet\n" +
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
    public Queue<ObjTable> MenuTablet(Queue<ObjTable> tablet) 
    {
        int opc;
        do 
        {
            metodos met = new metodos();
            menuTablet m = new menuTablet();
            opc = m.VerificarOptTablet();
            switch (opc) 
            {
                case 1:
                    //tablet = met.RegistrarTablet(tablet);
                    break;
                case 2:
                    //tablet = met.PrestarTablet(tablet);
                    break;
                case 3:
                    //tablet = met.ModificarTablet(tablet);
                    break;
                case 4:
                    //tablet = met.DevolverTablet(tablet);
                    break;
                case 5:
                    //met.InventarioTablet(tablet);
                    break;
                case 6:
                    //tablet = met.EliminarTablet(tablet);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Se ha salido del menú de Tablet.");
            }
        } while (opc != 7);

        return tablet;
    }
}
