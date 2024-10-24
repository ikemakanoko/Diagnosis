package domain;

import lombok.Data;

@Data
public class Catdog {
	//data baseからとってきたデータを格納する
	//フィールド
	private Integer id;
	private String animal;
	private String choice;

	//コンストラクタ
	public Catdog() {

	}

	public Catdog(Integer id, String animal, String choice) {
		this.id = id;
		this.animal = animal;
		this.choice = choice;
	}

	//アクセッサ
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public String getChoice() {
		return choice;
	}
	
	public void setChoice(String choice) {
		this.choice = choice;
	}
}

