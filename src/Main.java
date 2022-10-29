import Personas.Empleado;
import Personas.tipos.TipoPermiso;
import Personas.tipos.tipoDocumento;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Empleado> empleados;



    public static void main(String[] args) {
        generarEmpleados();
        System.out.println("*****************************************************");
        System.out.println("********C O N C E S I O N A R I O   U D E V *********");
        System.out.println("*****************************************************");
    }


    private static void generarEmpleados(){
        Empleado miEmpleadito1=new Empleado("Davidi",19, tipoDocumento.CEDULA,"1032411493","3144064791","Cra 18b bis # 24e-22");
        miEmpleadito1.setTipoPermiso(TipoPermiso.VENTA);

        Empleado miEmpleadito2=new Empleado("Paola",20, tipoDocumento.CEDULA,"123654783","31444855845","Cra 20b bis # 24e-22");
        miEmpleadito1.setTipoPermiso(TipoPermiso.COMPRA);

        Empleado miEmpleadito3=new Empleado("Cristian",34, tipoDocumento.CEDULA,"10225478554","3226834791","Cra 15 # 24e-22");
        miEmpleadito1.setTipoPermiso(TipoPermiso.TODOS);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito3);

    }



}
