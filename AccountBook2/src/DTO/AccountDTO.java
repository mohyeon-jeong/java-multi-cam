package DTO;

public class AccountDTO {

	private int index;
	private String date;		// 날짜 		- YY/MM/DD
	private String use; 		// 용도 		- 영화관람
	private String classify;	// 수입/지출 	- 지출
	private int money;			// 금액 		- 25000
	private String memo;		// 내용 		- 아바타2
	
	public AccountDTO() {
	}

	public AccountDTO(int index, String date, String use, String classify, int money, String memo) {
		super();
		this.index = index;
		this.date = date;
		this.use = use;
		this.classify = classify;
		this.money = money;
		this.memo = memo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "index : " + index + ", date : " + date + ", use : " + use + ", classify : " + classify + ", money : "
				+ money + ", memo : " + memo;
	}
	
}
