package espol.poo.clases;

public class Vehiculo {
    private String placa;
    private int horasEstacionado;
    double pago;

    public Vehiculo(String placa, int horasEstacionado){
        this.placa=placa;
        this.horasEstacionado=horasEstacionado;
    }
    

    public double calcularPago(){
        pago=horasEstacionado * 1.50;
        return pago;
    }

    public void mostrarInformacion(){
        System.out.println("Placa" + placa);
        System.out.println("Horas: " + horasEstacionado);
        System.out.println("Pago: " + pago);
    }
}
