package SistemaContaBancaria.model;

public class ContaCorrente {
    private int numero;
    private double saldo;

    private String nomeDoBanco;
    private String nomeDoUsuario;


    public ContaCorrente(){

    }

    public ContaCorrente(int numero, double saldo, String nomeDoBanco, String nomeDoUsuario) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeDoBanco = nomeDoBanco;
        this.nomeDoUsuario = nomeDoUsuario;
    }



    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public String getNomeDoBanco() {
        return nomeDoBanco;
    }



    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }



    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }



    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((nomeDoBanco == null) ? 0 : nomeDoBanco.hashCode());
        result = prime * result + ((nomeDoUsuario == null) ? 0 : nomeDoUsuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaCorrente other = (ContaCorrente) obj;
        if (numero != other.numero)
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        if (nomeDoBanco == null) {
            if (other.nomeDoBanco != null)
                return false;
        } else if (!nomeDoBanco.equals(other.nomeDoBanco))
            return false;
        if (nomeDoUsuario == null) {
            if (other.nomeDoUsuario != null)
                return false;
        } else if (!nomeDoUsuario.equals(other.nomeDoUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + ", nomeDoBanco=" + nomeDoBanco
                + ", nomeDoUsuario=" + nomeDoUsuario + "]";
    }

    

    


    

}
