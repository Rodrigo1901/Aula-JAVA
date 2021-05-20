public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valorVenal;

    public void acelera(){
        System.out.println("Acelerando...");
    }

    public double calcularIPVA(){
        return this.valorVenal * 0.01;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorVenal() {
        return valorVenal;
    }

}
