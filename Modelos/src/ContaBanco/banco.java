package ContaBanco;

import java.util.Scanner;

public class banco {
    private int numconta;
    private String tipoconta;
    private String dono;
    private float saldo;
    private boolean status;
    Scanner sc = new Scanner(System.in);

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirconta() {
        System.out.println("Informe o Número da conta  ");
        this.numconta = sc.nextInt();
        System.out.println("Informe o tipo da sua conta  ");
        this.tipoconta = sc.next();
        System.out.println("Informe o dono da conta  ");
        this.dono = sc.next();
        System.out.println("Informe o saldo da sua conta  ");
        this.saldo = sc.nextFloat();

    }

    public void fecharconta() {
        if (this.saldo == 0) {
            System.out.println("Conta fechada com Sucesso  ");
        } else {
            System.out.println("Existe " + this.saldo + " Em sua conta que deve ser sacado Para poder fechar a Conta ");
        }

    }

    public void depositar() {
        System.out.println("Informe o Valor que você deseja Depositar ? ");
        float valor1 = sc.nextFloat();
        this.saldo = this.saldo + valor1;
        System.out.println("Seu novo saldo é de R$" + this.saldo);

    }

    public void sacar() {
        System.out.println("Informe o valor que você deseja sacar ?  ");
        float valor = sc.nextFloat();
        if (this.saldo < valor) {
            System.out.println("Você não tem Saldo para Sacar   ");
        } else {
            System.out.println("Valor do Saque aprovado  " + valor);
        }

    }

    public void pagarmensal() {
        System.out.println("Você deseja realizar seu pagamento Mensal Sim ou Não ?");
        String mensal = sc.next().toUpperCase();
        if (mensal.equalsIgnoreCase("sim")) {
            System.out.println("Informe a despesa que você quer cadastrar ");
            String despesa = sc.next();
            System.out.println("Informe o valor Total para dar baixo do seu Saldo mensal ? ");
            float valor3 = sc.nextFloat();
            System.out.println("Informe a quantidade de meses ?");
            int mes = sc.nextInt();
            float medida = (valor3 / mes);
            this.saldo = this.saldo - valor3;

            System.out.println("Despesa Informada " + despesa);
            System.out.println("Você informou um valor total de R$" + valor3 + "e vai pagar mensalmente " + medida);
            System.out.println("Valor Creditado da sua conta R$" + this.saldo);
        } else {
            System.out.println("Foi um Prazer em atender você !!  ");
        }

    }

}
