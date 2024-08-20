//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// variaveis
        String nome = "Yuji";
        int idade = 20;
        double salario = 4534.00;
        int mesesTrabalhados = 12;
        double desconto = 4476.00;
        double itensComprados =5;
        double valorTotal = 2899.00;

        // somas
  double salarioBruto = mesesTrabalhados * salario;
  double descontoBruto = salarioBruto - desconto;
  double mediaProdutos = valorTotal / itensComprados;
  double salerioLiquido = descontoBruto - valorTotal;
  String mensagem =nome+ " seu salario liquido foi de "+salerioLiquido;

  sol
  // console
  System.out.println("Nome: "+nome);
  System.out.println("Idade: "+idade);
  System.out.println("Salario: "+salario);
  System.out.println("Salario bruto anaul: "+salarioBruto);
  System.out.println("Desconto anual: "+desconto);
  System.out.println("Salario com desconto: "+descontoBruto);
  System.out.println("Total de produtos comprados : "+itensComprados);
  System.out.println("Valor de cada produto: "+mediaProdutos);
  System.out.println("Valor dos produtos : "+valorTotal);
  System.out.println("Salario liquido: "+mensagem);



















        }
    }
