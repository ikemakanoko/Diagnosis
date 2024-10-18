package domain;

import lombok.Data;

@Data
public class Personal {

	//フィールド
	private Integer id;
	private String personal_color;
//	private String color;
//	private String eye;
//	private String hair;
//	private String sunburn;
//	private String rip;
//	private String praise;
//	private String impress;
//	private String acce;
//	private String rock;

	// コンストラクタ
	public Personal(Integer id, String personal_color
	// String color, String eye, String hair,String sunburn, String rip, String praise, String impress, String acce, String rock
		) {
		this.id = id;
		this.personal_color = personal_color;
//		this.color = color;
//		this.eye = eye;
//		this.hair = hair;
//		this.sunburn = sunburn;
//		this.rip = rip;
//		this.praise = praise;
//		this.impress = impress;
//		this.acce = acce;
//		this.rock = rock;
	}

	//アクセッサ
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonal_color() {
		return personal_color;
	}

	public void set(String personal_color) {
		this.personal_color = personal_color;
	}

//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getEye() {
//		return eye;
//	}
//
//	public void setEye(String eye) {
//		this.eye = eye;
//	}
//
//	public String getHair() {
//		return hair;
//	}
//
//	public void setHair(String hair) {
//		this.hair = hair;
//	}
//
//	public String getSunburn() {
//		return sunburn;
//	}
//
//	public void setSunburn(String sunburn) {
//		this.sunburn = sunburn;
//	}
//
//	public String getRip() {
//		return rip;
//	}
//
//	public void setRip(String rip) {
//		this.rip = rip;
//	}
//
//	public String getPraise() {
//		return praise;
//	}
//
//	public void setPraise(String praise) {
//		this.praise = praise;
//	}
//
//	public String getImpress() {
//		return impress;
//	}
//
//	public void setImpress(String impress) {
//		this.impress = impress;
//	}
//
//	public String getAcce() {
//		return acce;
//	}
//
//	public void setAcce(String acce) {
//		this.acce = acce;
//	}
//
//	public String getRock() {
//		return rock;
//	}
//
//	public void setRock(String rock) {
//		this.rock = rock;
//	}
}
