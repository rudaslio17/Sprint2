public class Empleado  extends  Empresa {
    private  int id;
    private  String nombreEmpleado;
    private  String correo;
    private  String role;

    public Empleado(long nit, String nombre, String direccion, int telefono, int id, String nombreEmpleado, String correo, String role) {
        super(nit, nombre, direccion, telefono);
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;

        if (role.equals("administrador") || role.equals("operativo") )
        {
            this.role = role;

        }
        else
        {
            this.role = "operativo";

        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role.equals("administrador") || role.equals("operativo") )
        {
            this.role = role;

        }
        else
        {
            System.out.println("Ingresar operadpr o Administrador");

        }

    }
}
