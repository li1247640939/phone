package com.ujiuye.bean;

public class Mobile {

	private Integer id;
	private String mnumber;
	private String marea;
	private String mtype;
	private String areacode;
	private String postcode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMnumber() {
		return mnumber;
	}

	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}

	public String getMarea() {
		return marea;
	}

	public void setMarea(String marea) {
		this.marea = marea;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mnumber=" + mnumber + ", marea=" + marea + ", mtype=" + mtype + ", areacode="
				+ areacode + ", postcode=" + postcode + "]";
	}

}
