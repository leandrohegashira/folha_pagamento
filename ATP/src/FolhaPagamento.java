import java.util.ArrayList;
import java.util.Scanner;


public class FolhaPagamento {
	
	public static ArrayList<Funcionario> funcionarios;
	
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o número de funcionários: ");
		int numFuncionarios = teclado.nextInt();
		
		
		// Inicia Listas
		funcionarios = new ArrayList<Funcionario>();
		
		
		// Leitura de Dados		
		int c = 0;
		
		while(c < numFuncionarios) {
			
			System.out.println("=== Funcionário "+c+" ===");
			
			System.out.println("Informe o código do funcionário: ");
			int codigo = teclado.nextInt();
			
			System.out.println("Informe o salário: ");
			double salario = teclado.nextDouble();

			System.out.println("Informe o tipo do funcionário: ");
			System.out.println("1 - Concursado");
	        System.out.println("2 - Temporário\n");
	        int tipo = teclado.nextInt();
	        
	       // ====================================================================================================================================
	           System.out.println("Quantos dependentes deseja associar a esse funcionário? ");
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
	        	
	        	System.out.println("Digite o tempo de contratação em anos: ");
	        	int tempoContratacao = teclado.nextInt();
	        	
	        	FuncionarioConcursado funcionario = new FuncionarioConcursado(codigo, salario, tempoContratacao);
	        	
	        	for(Dependente d : dep) {
	        		funcionario.associaDependente(d);   	
	        	}
	        	
	        	funcionarios.add(funcionario);
	        	
	        }else {
	        	
	        	System.out.println("Digite o tempo de contratação em meses: ");
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



