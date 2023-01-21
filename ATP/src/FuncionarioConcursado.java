
public class FuncionarioConcursado extends Funcionario {
	
	
	public FuncionarioConcursado(int codigo, double salario, int tempoContratacao) {	
		this.codigo = codigo;
		this.salario = salario;
		this.tempoContratacao = tempoContratacao;
	}
	
	
	public void imprimeFolha() {	
		System.out.println("Funcion�rio Concursado === c�digo "+ codigo);
		super.imprimeFolha();
		System.out.println("Tempo de contrata��o em anos: " + tempoContratacao + " ano(s)");
		System.out.println("Valor mensal recebido: " + valorMensalRecebido());
		for(Dependente d : this.dep) {
			System.out.println("Idade do depende: " + d.idade + " ano(s)");
		}
	}
	
	public double calculaGratificacao() {
			return tempoContratacao * 200;	
	}
	
	
	public double calculaValorMensal() {	
		return salario + calculaGratificacao();	
	}
	
	public double valorMensalRecebido() {

        double valor = this.calculaValorMensal();

        	for (Dependente d : this.dep) {

              if(d.idade <= 21) {
                        valor+=100;  
              }
              	else{
              		System.out.println("Nao e possivel cadastrar dependente. Idade acima do permitido");

              	}

        	}
        		return valor;
		}

}


			
		

	

	



