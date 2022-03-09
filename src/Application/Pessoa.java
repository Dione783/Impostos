package Application;

public abstract class Pessoa {
	private String name;
	private double rendaAnual;
	private double gastoSaude;
	private double imposto;
	
	
	public Pessoa(String name,double rendaAnual) {
		this.name=name;
		this.rendaAnual=rendaAnual;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double getGastoSaude() {
		return gastoSaude;
	}
	
	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public abstract double imposto();
}