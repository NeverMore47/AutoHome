package entity;


public class Order {

	private Integer oID;
	private Double oFinalPri;
	private String oFlow;
	private String oDate;
	private Integer cID;
	private Integer clID;

	public Integer getcID() {
		return cID;
	}

	public void setcID(Integer cID) {
		this.cID = cID;
	}

	public Integer getClID() {
		return clID;
	}

	public void setClID(Integer clID) {
		this.clID = clID;
	}

	public Integer getoID() {
		return oID;
	}

	public void setoID(Integer oID) {
		this.oID = oID;
	}

	public Double getoFinalPri() {
		return oFinalPri;
	}

	public void setoFinalPri(Double oFinalPri) {
		this.oFinalPri = oFinalPri;
	}

	public String getoFlow() {
		return oFlow;
	}

	public void setoFlow(String oFlow) {
		this.oFlow = oFlow;
	}

	public String getoDate() {
		return oDate;
	}

	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
}
