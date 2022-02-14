import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat real = NumberFormat.getCurrencyInstance();
	    ContaBancaria conta01 = new ContaBancaria("José Ricardo", 5000);

        conta01.sacar(4000);
        System.out.println("Saldo atual da conta de " + conta01.getDono() + ": " +
                real.format(conta01.getSaldo()));

        conta01.depositar(5000);
        System.out.println("Saldo atual da conta de " + conta01.getDono() + ": " +
                real.format(conta01.getSaldo()));
    }
}