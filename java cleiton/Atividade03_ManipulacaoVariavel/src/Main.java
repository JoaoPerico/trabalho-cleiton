public class Main
{
    public static void main(String[] args) {
        String Produto = "garrafaAgua";
        int qntdProduto = 1000;
        double valor = 28.99;
        double imposto = 3;
        double lucro = 40;

        double valorTotal = valor * qntdProduto;
        double valorImposto = valorTotal * (1-(imposto/100));
        double valorDesejado = valorTotal * (1+lucro/100);
        double valorVenda = valorDesejado/1000;

        System.out.printf("%s\n", Produto);
        System.out.printf("Valor com impostos = RS%.2f\n", valorImposto);
        System.out.printf("Preco de venda sugerido: RS%.2f", valorVenda);

    }
}


