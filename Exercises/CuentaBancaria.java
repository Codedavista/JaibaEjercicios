package Exercises;

public class CuentaBancaria{
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial){
        if (titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        if (saldoInicial < 0){
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: No se aceptan depósitos negativos o en cero.");
            return false;
        }
        saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor que cero.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes para retirar " + monto);
            return false;
        }
        saldo -= monto;
        return true;
    }
}