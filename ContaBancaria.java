import java.text.NumberFormat;

public class ContaBancaria {
    NumberFormat real = NumberFormat.getCurrencyInstance();

    // Atributos
    private String dono;
    private double saldo;

    // Getters e Setters
    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    // Construtor
    ContaBancaria(String dono, double saldo) {
        this.dono = dono;
        this.saldo = Math.max(saldo, 0);
    }

    // Métodos
    public double sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            System.out.println("Retirada feita no valor de " + real.format(valor) + " da conta.");
        }
        else {
            System.out.println("Não foi possível concluir a operação. Valor de retirada maior que o saldo atual.");
        }
        return 0;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito feito no valor de " + real.format(valor) + " na conta.");
        }
        return 0;
    }
}