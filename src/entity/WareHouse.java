package entity;

public class WareHouse {

	private Integer wID;
	private String wName;
	private String wAddress;
	private Integer wMax;
	private Integer wExist;

	public Integer getwID() {
		return wID;
	}

	public void setwID(Integer wID) {
		this.wID = wID;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public String getwAddress() {
		return wAddress;
	}

	public void setwAddress(String wAddress) {
		this.wAddress = wAddress;
	}

	public Integer getwMax() {
		return wMax;
	}

	public void setwMax(Integer wMax) {
		this.wMax = wMax;
	}

	public Integer getwExist() {
		return wExist;
	}

	public void setwExist(Integer wExist) {
		this.wExist = wExist;
	}
}
