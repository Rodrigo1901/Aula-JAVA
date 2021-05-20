public class Carro extends Veiculo {

    private int pessoas;
    private boolean portaAberta;

    public Carro(String marca, String modelo, int ano, double valorVenal) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenal = valorVenal;
    }

    public void abrirPorta(){
        this.portaAberta = true;
    }

    public void fecharPorta(){
        this.portaAberta = false;
    }

    public double calcularIPVA(){
        return this.getValorVenal() * 0.07;
    }

    public void adicionarPessoa(){
        if(portaAberta){
            this.pessoas++;
        }else{
            System.out.println("Porta fechada");
        }
    }

    public void removerPessoa(){
        if(portaAberta && this.pessoas > 0){
            this.pessoas--;
        }else{
            System.out.println("Porta fechada ou não há pessoas no carro");
        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }
}
