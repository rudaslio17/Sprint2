public class Main {
    public static void main(String[] args) {
      Empleado emp1=new Empleado(10245124,"Centro Inca Ltda","Cl 57 46 88",320145147,72257313,"Luis Rudas","rudaslio17@gmail.com","administrador");
        System.out.println("El nombre del empleado es:"+emp1.getNombreEmpleado());
        System.out.println("El empleado trabaj en la empresa:"+emp1.getNombre());
        emp1.setNombre("Globaltv");
        System.out.println("El empleado cambio de empresa ahora trabaja en :"+emp1.getNombre());

        MovimientoDinero mv1=new MovimientoDinero(500000,true,"Pago factura de venta",emp1);
        System.out.println("El usuario que hizo el movimiento fue"+mv1.toString());
        emp1.setRole("operativo7");
        Empleado em=mv1.getUsuario();
        System.out.println(em.getNombreEmpleado());
        System.out.println(emp1.getRole());
    }
}
