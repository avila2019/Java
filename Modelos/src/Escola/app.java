package Escola;

public class app {
    public static void main(String[] args) {
        Aluno n1= new Aluno("Arthur","Masculino",32,2134213,"java");

        Professor n2= new Professor("Jailton","masculino",42,"Banco de Dados",8.400f);

        Funcionario n3 = new Funcionario("Mirella","Feminino",38,"Comercial","Sim");
        
        
        n1.informacao_aluno();
       
        n2.informacao_Professor();
       
        n3.informacao_Funcionario();
        
  
        
    }
    
}
