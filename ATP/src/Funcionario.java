import java.util.ArrayList;

public class Funcionario {
	
	int codigo;
	double salario;
	int tempoContratacao;
	
	public ArrayList <Dependente> dep = new ArrayList<Dependente>();

	public boolean associaDependente(Dependente d){        
	        if(dep.size() >= 5 ){
	        	System.exit(0);
	        	return false;
	        }
	        else{  
	        	dep.add(d);
	            return true;        
	        }
	}
	
	public void imprimeFolha() {
		System.out.println("Salário: " + this.salario);
		
	}
	

	}


	

	
	

	
	
	
	


