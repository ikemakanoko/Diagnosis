package domain;

public class Mbti {

	private Integer id;
	private String mbti;
	
	public Mbti() {
		
	}
	
	public Mbti(Integer id, String mbti) {
		this.id = id;
		this.mbti = mbti;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public Object getChoice() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
}
