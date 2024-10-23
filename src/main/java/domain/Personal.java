package domain;

import lombok.Data;

@Data
public class Personal {

	//フィールド
	private Integer id;
	private String personal_color;

	// コンストラクタ
	public Personal(Integer id, String personal_color
	// String color, String eye, String hair,String sunburn, String rip, String praise, String impress, String acce, String rock
		) {
		this.id = id;
		this.personal_color = personal_color;
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

	public Object getChoice() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}}