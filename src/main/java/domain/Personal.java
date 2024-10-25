package domain;

import lombok.Data;

@Data
public class Personal {

	//フィールド
	private Integer id;
	private String personal_color;
	private String color;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String result;

	// コンストラクタ
	public Personal(Integer id, String personal_color, String choice1, String choice2, String choice3, String choice4,
			String result, String color) {
		this.id = id;
		this.personal_color = personal_color;
		this.color = color;
		this.choice1 = choice1;
		this.choice1 = choice2;
		this.choice1 = choice3;
		this.choice1 = choice4;
		this.result = result;
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
	}
}