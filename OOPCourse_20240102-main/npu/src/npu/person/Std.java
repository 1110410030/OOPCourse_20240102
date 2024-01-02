package npu.person;

public class Std {

	@Override
	public String toString() {
		return "Std [_StdNo=" + _StdNo + ", _StdName=" + _StdName + ", _StdGender=" + _StdGender + "]";
	}
	public  Std() {
		
	}
	public Std(String _StdNo, String _StdName, String _StdGender) {
		this.set_StdNo(_StdNo);
		this.set_StdName(_StdName);
		this.set_StdGender(_StdGender);
	}
	
	public String get_StdName() {
		return _StdName;
	}
	public void set_StdName(String _StdName) {
		this._StdName = _StdName;
	}
	public String get_StdGender() {
		return _StdGender;
	}
	public void set_StdGender(String _StdGender) {
		this._StdGender = _StdGender;
	}
	public String get_StdNo() {
		return _StdNo;
	}
	public void set_StdNo(String _StdNo) {
		this._StdNo = _StdNo;
	}


	private String _StdNo;
	private String _StdName;
	private String _StdGender;
	

	
}
