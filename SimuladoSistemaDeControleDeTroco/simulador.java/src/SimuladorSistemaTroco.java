import java.util.Scanner;

public class SimuladorSistemaTroco {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Informe o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Informe o valor da compra: ");
        double valor = sc.nextDouble();
        
        System.out.println("Informe o valor pago pelo cliente: ");
        double ValorCliente = sc.nextDouble();


        if(ValorCliente >= valor){

             double troco = ValorCliente - valor;

           int restante = (int) troco;

           int n200 = restante / 200;
           restante %= 200;

           int n100 = restante / 100;
           restante %= 100;

           int n50 = restante / 50;
           restante %= 50;

           int n20 = restante / 20;
           restante %= 20;

           int n10 = restante /10;
           restante %= 10;

           int n5 = restante / 5;
           restante %= 5;
           
           int n2 = restante / 2;
           restante %= 2;

           int n1 = restante / 1;
           restante %= 1;
        
           System.out.println("Nome do cliente: "+nome+ "\nValor total: "+valor+ "\nValor que foi pago: "+ValorCliente);
           System.out.println("Troco: "+troco+ "\nNotas: ");

           System.out.println("\n200: "+n200+ "\n100: "+n100+ "\n50: "+n50+ "\n20: "+n20+ "\n10: "+n10+ "\n5: "+n5+ "\n2: "+n2+ "\n1: "+n1);
          
        }

        else{
            System.out.println("Valor insuficiente para realizar suas compras!");
        }
        

}
}