package wad.com.api.operacao;

public class Operacao {
	private long id;
	private String papel;
	private double vlrUn;
	private double cp;
	private double lair;
	private int qtdAcm;
	private double pm;
	private double pf;
	private double vt;
	private double corret;
	private double emolum;
	private double liquid;
	private double registr;
	private double isseOutros;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public double getVlrUn() {
		return vlrUn;
	}
	public void setVlrUn(double vlrUn) {
		this.vlrUn = vlrUn;
	}
	public double getCp() {
		return cp;
	}
	public void setCp(double cp) {
		this.cp = cp;
	}
	public double getLair() {
		return lair;
	}
	public void setLair(double lair) {
		this.lair = lair;
	}
	public int getQtdAcm() {
		return qtdAcm;
	}
	public void setQtdAcm(int qtdAcm) {
		this.qtdAcm = qtdAcm;
	}
	public double getPm() {
		return pm;
	}
	public void setPm(double pm) {
		this.pm = pm;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getVt() {
		return vt;
	}
	public void setVt(double vt) {
		this.vt = vt;
	}
	public double getCorret() {
		return corret;
	}
	public void setCorret(double corret) {
		this.corret = corret;
	}
	public double getEmolum() {
		return emolum;
	}
	public void setEmolum(double emolum) {
		this.emolum = emolum;
	}
	public double getLiquid() {
		return liquid;
	}
	public void setLiquid(double liquid) {
		this.liquid = liquid;
	}
	public double getRegistr() {
		return registr;
	}
	public void setRegistr(double registr) {
		this.registr = registr;
	}
	public double getIsseOutros() {
		return isseOutros;
	}
	public void setIsseOutros(double isseOutros) {
		this.isseOutros = isseOutros;
	}
	
	public Operacao(DadosCadastroOperacao op) {
		this.papel = op.papel();
		this.vlrUn = op.vlrUn();
		this.cp = op.cp();
		this.lair = op.lair();
		this.qtdAcm = op.qtdAcm();
		this.pm = op.pm();
		this.pf = op.pf();
		this.vt = op.vt();
		this.corret = op.corret();
		this.emolum = op.emolum();
		this.liquid = op.liquid();
		this.registr = op.registr();
		this.isseOutros = op.isseOutros();
	}
	
	public Operacao(long id, String papel, double vlrUn, double cp, double lair, int qtdAcm, double pm, double pf,
			double vt, double corret, double emolum, double liquid, double registr, double isseOutros) {
		
		this.id = id;
		this.papel = papel;
		this.vlrUn = vlrUn;
		this.cp = cp;
		this.lair = lair;
		this.qtdAcm = qtdAcm;
		this.pm = pm;
		this.pf = pf;
		this.vt = vt;
		this.corret = corret;
		this.emolum = emolum;
		this.liquid = liquid;
		this.registr = registr;
		this.isseOutros = isseOutros;
	}
	
	

}
