public class empleadomediotiempo extends empleado {
    private int horastrabajadas; 

    public empleadosmediotiempo (string, nombre, double saliobase, int horastrabajadas) {
        super(nombre,salabase);
        this.horastrabajadas = horasTrabajadas;
    
    }

    @override
    public double calcularSalario(){
        return getsalariobase () * horasTrabajadas;
    }

   @override
    public string toString (){
        return "empleado medio tiempo:" + calcularsalario();
    } 


}
