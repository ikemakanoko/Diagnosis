package domain;

import lombok.Data;

@Data
public class Personal {

	private Integer id;
	private String personalcolor;
	private String color;
	private String eye;
	private String hair;
	private String sunburn;
	private String rip;
	private String praise;
	private String impress;
	private String acce;
	private String rock;

	// コンストラクタ
	public Personal() {

	}

	public Personal(Integer id, String personalcolor, String color, String eye, String hair,
			String sunburn, String rip, String praise, String impress, String acce, String rock) {
		this.id = id;
		this.personalcolor = personalcolor;
		this.color = color;
		this.eye = eye;
		this.hair = hair;
		this.sunburn = sunburn;
		this.rip = rip;
		this.praise = praise;
		this.impress = impress;
		this.acce = acce;
		this.rock = rock;
		{

			{

			}
		}
	}
}
