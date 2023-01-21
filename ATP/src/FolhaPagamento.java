import java.util.ArrayList;
import java.util.Scanner;


public class FolhaPagamento {
	
	public static ArrayList<Funcionario> funcionarios;
	
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o n�mero de funcion�rios: ");
		int numFuncionarios = teclado.nextInt();
		
		
		// Inicia Listas
		funcionarios = new ArrayList<Funcionario>();
		
		
		// Leitura de Dados		
		int c = 0;
		
		while(c < numFuncionarios) {
			
			System.out.println("=== Funcion�rio "+c+" ===");
			
			System.out.println("Informe o c�digo do funcion�rio: ");
			int codigo = teclado.nextInt();
			
			System.out.println("Informe o sal�rio: ");
			double salario = teclado.nextDouble();

			System.out.println("Informe o tipo do funcion�rio: ");
			System.out.println("1 - Concursado");
	        System.out.println("2 - Tempor�rio\n");
	        int tipo = teclado.nextInt();
	        
	       // ====================================================================================================================================
	           System.out.println("Quantos dependentes deseja associar a esse funcion�rio? ");
	           int numDependentes = teclado.nextInt(); teclado.nextLine();
	           
	           ArrayList <Dependente> dep = new ArrayList<Dependente>();     
	           
	           int i = 0;
	           
	           while (i < numDependentes) {
	               
	               System.out.println("Dependente "+i+"_");
	               
	               System.out.println("Informe a idade do dependente: ");
	               int idade = teclado.nextInt();
	               
	               
	               Dependente d = new Dependente(idade);
	               
	               dep.add(d);
           
	               i++;
	           
	           }	        
	        //==================================================================================================================================
	        
 
	        if (tipo == 1) {
	        	
	        	System.out.println("Digite o tempo de contrata��o em anos: ");
	        	int tempoContratacao = teclado.nextInt();
	        	
	        	FuncionarioConcursado funcionario = new FuncionarioConcursado(codigo, salario, tempoContratacao);
	        	
	        	for(Dependente d : dep) {
	        		funcionario.associaDependente(d);   	
	        	}
	        	
	        	funcionarios.add(funcionario);
	        	
	        }else {
	        	
	        	System.out.println("Digite o tempo de contrata��o em meses: ");
	        	int tempoContratacao = teclado.nextInt();
	        	
	        	FuncionarioTemporario funcionario = new FuncionarioTemporario(codigo, salario, tempoContratacao);
	        	
	        	for(Dependente d : dep) {
	        		funcionario.associaDependente(d);
	        	}
	        	     	
	        	funcionarios.add(funcionario);
	        	
	        }
	        c++;
		}
		
		
		for(Funcionario funcionario : funcionarios){      
	          funcionario.imprimeFolha(); 
	          System.out.println();           
	       }
		
    
	}

}



