public class TesteCofrinho {
    public static void main(String args[]) {
        Cofrinho c1, c2, c3;

        Pessoa p;

        p = new Pessoa(Teclado.leString("Nome do dono do primeiro cofrinho: "),
                       Teclado.leInt("idade: "));

        c1 = new Cofrinho(p);

        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();

        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();

        c1.depositaUmaMoedaDezCentavos();
        c1.depositaUmaMoedaDezCentavos();

        c2 = new Cofrinho(Teclado.leString("Nome do dono do segundo cofrinho: "),
                       Teclado.leInt("idade: "));

        c2.depositaUmaMoedaCincoentaCentavos();
        c2.depositaUmaMoedaCincoentaCentavos();

        c3 = new Cofrinho(c2.getDono());

        c3.depositaUmaMoedaDezCentavos();
        c3.depositaUmaMoedaDezCentavos();
        c3.depositaUmaMoedaDezCentavos();

        System.out.println("-------------------------------------------");
        System.out.println(c1.informaTotal());
        System.out.println(c2.informaTotal());
        System.out.println(c3.informaTotal());
        System.out.println("-------------------------------------------");

        double total;
        total = c1.calculaTotal() + c2.calculaTotal() + c3.calculaTotal();
        System.out.println("Valor total dos tres cofrinhos: " + total);
    }
}