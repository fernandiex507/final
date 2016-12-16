

/**Provee las clases necesarias para
 * crear una cuenta de consumo de electriccidad
 * en la empresa ENSA.
 */
package ensa;

/**
 * esta es la clase para la creacion de cuentas en ENSA.
 * @author  Alfredo Martinez
 * @version 1.0
 */
public class cuenta{
    /**
     * esta{@link String} es el nombre del dueño de la cuenta
     */

    private String nombre;
    private String  numero_cuenta;
    private double saldo;
    private double consumo_mensual;

    /**
     * este constructor indica la cuenta recien creada
     * @param n este parametro indica el nombre del dueño de la cuenta
     * @param nc este parametro indica el numero de la cuenta
     */
    public cuenta(String n,String nc){

        this.nombre =n;
        this.numero_cuenta=nc;
        this.saldo=0.0;
        this.consumo_mensual=0.0;
    }

    /**
     * este etodo se encarga de cargar la informcion del cliente en una varable.
     *@return esta cadena representa la informacion del cliente.
     */
    public String mostrar(){
        String mensaje ="informaciondel cliente";
        mensaje +="\nnombre: "+this.nombre;
        mensaje +="\ncuenta:"+this.numero_cuenta;
        mensaje +="\nsaldo:"+this.saldo;
        mensaje +="\nconsumo:"+this.consumo_mensual;
        return mensaje;
    }

    public double pagar(double pago){
        this.saldo -=pago;
        return this.saldo;
    }
    public Double calcular(double consumo){
        this.consumo_mensual= consumo;
        this.saldo =this.consumo_mensual*0.57;
        return this.saldo;
    }
}
