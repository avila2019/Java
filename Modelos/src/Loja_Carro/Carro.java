package Loja_Carro;

public class Carro {
    private String dono;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private float valorAproximado;

    public Carro() {

    }
    public Carro(String dono,String placa,String marca,String modelo,int ano,float valorAproximado){
        super();
        this.dono=dono;
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.valorAproximado=valorAproximado;

    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono=dono;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
          this.placa=placa;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public float getValorAproximado(){
        return this.valorAproximado;
    }
    public void setValorAproximado(float valorAproximado){
        this.valorAproximado=valorAproximado;
    }









}
