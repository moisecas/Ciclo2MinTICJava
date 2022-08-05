package banco2;

public class empleado extends cliente {
    //atributo tipo de empleado, años trabajados, vacaciones, salario
    private String tipoEmpleado;
    private int añosTrabajados;
    private int vacaciones;
    private double salario;
    //constructor
    public empleado(String nombre, String numeroIdentificacion, double saldo, String password, String tipoEmpleado, int añosTrabajados, int vacaciones, double salario) {
        super(nombre, numeroIdentificacion, saldo, password);
        this.tipoEmpleado = tipoEmpleado;
        this.añosTrabajados = añosTrabajados;
        this.vacaciones = vacaciones;
        this.salario = salario;
    }
    
    //get y set
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    //metodo calcular salario y vacaciones
    public void calcularSalario() {
        if (this.añosTrabajados >= 10) {
            this.salario = this.salario + (this.salario * 0.10);
        }
        if (this.añosTrabajados >= 20) {
            this.salario = this.salario + (this.salario * 0.20);
        }
        if (this.añosTrabajados >= 30) {
            this.salario = this.salario + (this.salario * 0.30);
        }
        if (this.añosTrabajados >= 40) {
            this.salario = this.salario + (this.salario * 0.40);
        }
        if (this.añosTrabajados >= 50) {
            this.salario = this.salario + (this.salario * 0.50);
        }
        if (this.añosTrabajados >= 60) {
            this.salario = this.salario + (this.salario * 0.60);
        }
        if (this.añosTrabajados >= 70) {
            this.salario = this.salario + (this.salario * 0.70);
        }
        if (this.añosTrabajados >= 80) {
            this.salario = this.salario + (this.salario * 0.80);
        }
        if (this.añosTrabajados >= 90) {
            this.salario = this.salario + (this.salario * 0.90);
        }
        if (this.añosTrabajados >= 100) {
            this.salario = this.salario + (this.salario * 1.00);
        }
    }
    //metodo calcular vacaciones cuando cumpla un año de trabajo y se le asignan vacaciones, usando for
    public void calcularVacaciones() {
        for (int i = 0; i < this.añosTrabajados; i++) {
            this.vacaciones = this.vacaciones + 1;
        }
    }

    //mostrar empleado en pantalla
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Numero de identificacion: " + this.numeroIdentificacion);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Password: " + this.password);
        System.out.println("Tipo de empleado: " + this.tipoEmpleado);
        System.out.println("Años trabajados: " + this.añosTrabajados);
        System.out.println("Vacaciones: " + this.vacaciones);
        System.out.println("Salario: " + this.salario);
    }
    
   
    

    
    
}
