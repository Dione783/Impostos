package Application;

public class PessoaJuridica extends Pessoa{
	
	
	public PessoaJuridica(String name, double rendaAnual,int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios=numeroFuncionarios;
		// TODO Auto-generated constructor stub
	}

	private Integer numeroFuncionarios;

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public double imposto() {
		if(numeroFuncionarios < 10){
			this.setImposto(getImposto()*0.16);
		}else{
			this.setImposto(getImposto()*0.14);
		}
		return this.getImposto();
	}
	
}
