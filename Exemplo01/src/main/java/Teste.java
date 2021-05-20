public class Teste {

    public static void main(String[] args) {

        Carro carro = new Carro("Honda", "Civic",2010, 30000);
        Moto moto = new Moto("Honda", "CG", 2015, 150, 5000);

        moto.acelera();
        carro.acelera();

        System.out.println(carro.calcularIPVA());;
        System.out.println(moto.calcularIPVA());

        System.out.println(carro.getMarca());


        System.out.println(carro.getPessoas());

        carro.adicionarPessoa();

        carro.abrirPorta();

        carro.adicionarPessoa();

        System.out.println(carro.getPessoas());




    }

}
