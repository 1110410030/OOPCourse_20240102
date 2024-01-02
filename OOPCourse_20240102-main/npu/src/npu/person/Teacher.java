package npu.person;

public class Teacher {

	private String TeaName;

	public String getTeaName() {
		return TeaName;
	}

	public void setTeaName(String teaName) {
		TeaName = teaName;
	}
	
	public Teacher() {}
	public Teacher(String Teaname) {
		this.setTeaName(Teaname);
	}

	@Override
	public String toString() {
		return "教師姓名:" + TeaName ;
	}
	
}
