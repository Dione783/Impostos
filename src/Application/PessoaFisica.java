package Application;

public class PessoaFisica extends Pessoa{

	
	
	public PessoaFisica(String name, double rendaAnual,double gastoSaude) {
		super(name, rendaAnual);
		this.setGastoSaude(gastoSaude);
		// TODO Auto-generated constructor stub

	}

	@Override
	public double imposto() {
		// TODO Auto-generated method stub
		if(this.getRendaAnual() < 2000.00){
			setImposto(this.getRendaAnual()*0.15);
		}else{
			setImposto(this.getRendaAnual()*0.25-(getGastoSaude()/2));
		}
		return this.getImposto();
	}
	
}