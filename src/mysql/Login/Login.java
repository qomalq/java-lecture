package mysql.Login;

public class Login {
	private String joinmemebership;
	private String id;
	private int pw;
	private String name;
	private int residentNum;
	
	public Login() { }
	public Login(String joinmemebership, String id, int pw, String name, int residentNum) {
		super();
		this.joinmemebership = joinmemebership;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.residentNum = residentNum;
	}
	public String getJoinmemebership() {
		return joinmemebership;
	}
	public void setJoinmemebership(String joinmemebership) {
		this.joinmemebership = joinmemebership;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(int residentNum) {
		this.residentNum = residentNum;
	}
	@Override
	public String toString() {
		return "Login [joinmemebership=" + joinmemebership + ", id=" + id + ", pw=" + pw + ", name=" + name
				+ ", residentNum=" + residentNum + "]";
	}

}
