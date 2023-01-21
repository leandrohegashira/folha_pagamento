
public class FuncionarioTemporario extends Funcionario{

	
	public FuncionarioTemporario(int codigo, double salario, int tempoContratacao) {
		this.codigo = codigo;
		this.salario = salario;
		this.tempoContratacao = tempoContratacao;
		
	}

	public void imprimeFolha() {
		System.out.println("Funcion�rio Tempor�rio === c�digo " + codigo);
		super.imprimeFolha();
		System.out.println("Tempo de contrata��o em meses: " + tempoContratacao + " m�s(es)");
		System.out.println("Valor mensal recebido: " + valorMensalRecebido());
		for(Dependente d : this.dep) {
			System.out.println("Idade do depende: " + d.idade + " ano(s)");
			
		}	
		
	}
	
	public double calculaGratificacao() {	
		return tempoContratacao * 15;
	}
	
	
	public double calculaValorMensal() {	
		return salario + calculaGratificacao();	
	}
	
	public double valorMensalRecebido() {

        double valor = this.calculaValorMensal();

        	for (Dependente d : this.dep) {

              if(d.idade <= 18) {
                        valor+=50;  
              }
              	else{
              		System.out.println("Nao e possivel cadastrar dependente. Idade acima do permitido");

              	}

        	}
        		return valor;
		}

		
}
	

