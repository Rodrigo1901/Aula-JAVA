public class Moto extends Veiculo {

    private int cilindradas;


    public Moto(String marca, String modelo, int ano, int cilindradas, double valorVenal) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindradas = cilindradas;
        this.valorVenal = valorVenal;
    }

    public double calcularIPVA(){
        return this.getValorVenal() * 0.03;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
