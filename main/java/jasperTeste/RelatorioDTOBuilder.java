package jasperTeste;

public class RelatorioDTOBuilder {
	private String meuFieldTeste;
	private String meuFieldTeste2;
	private String meuFieldTeste3;
	
	private static RelatorioDTOBuilder instancia;
	
	private RelatorioDTOBuilder() {
		
	}
	
	public RelatorioDTO build() {
		RelatorioDTO relatorio = new RelatorioDTO();
		relatorio.setMeuFieldTeste(meuFieldTeste);
		relatorio.setMeuFieldTeste2(meuFieldTeste2);
		relatorio.setMeuFieldTeste3(meuFieldTeste3);
		return relatorio;
	}
	
	public static RelatorioDTOBuilder getInstance() {
		return instancia = instancia ==  null ? new RelatorioDTOBuilder() : instancia;
	}

	public RelatorioDTOBuilder setMeuFieldTeste(String meuFieldTeste) {
		this.meuFieldTeste = meuFieldTeste;
		return this;
	}

	public RelatorioDTOBuilder setMeuFieldTeste2(String meuFieldTeste2) {
		this.meuFieldTeste2 = meuFieldTeste2;
		return this;
	}

	public RelatorioDTOBuilder setMeuFieldTeste3(String meuFieldTeste3) {
		this.meuFieldTeste3 = meuFieldTeste3;
		return this;
	}
	
}
