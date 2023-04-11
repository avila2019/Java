package Alura.POO.Filme;

public class app {
    public static void main(String[] args) {
      Filme n1= new Filme();

      n1.nome="arthur";
      n1.avalia(38);
      n1.avalia(33);
      

      n1.exibeFichaTecnica();
      System.out.println(n1.pegaMedia());

  

      

        
    }
    
}
