package npu.course;
import npu.person.*;
import java.util.ArrayList;
public class DepCourse {
	
	private String _CourseName;
	private int _CourseCredit;
	Teacher tea01=new Teacher();
	
	ArrayList<Std> TakingStudent =new ArrayList<>();
		

	public ArrayList<Std> getMyStd() {
		
		return TakingStudent;
	}
	public void setMyStd(Std myStd) {
		TakingStudent.add(myStd);
	}
	public String get_CourseName() {
		return _CourseName;
	}
	public void set_CourseName(String _CourseName) {
		this._CourseName = _CourseName;
	}
	public int get_CourseCredit() {
		return _CourseCredit;
	}
	public void set_CourseCredit(int _CourseCredit) {
		this._CourseCredit = _CourseCredit;
	}
	public Teacher getTea01() {
		return tea01;
	}
	public void setTea01(Teacher tea01) {
		this.tea01 = tea01;
	}
    public DepCourse() {}
    public DepCourse(String _CourseName,int _CourseCredit ,Teacher tea01) { 
    	this.set_CourseName(_CourseName);
    	this.set_CourseCredit(_CourseCredit);
    	this.setTea01(tea01);
    }
	@Override
	public String toString() {
		return "系課程: [課程名=" + _CourseName + ", 學分數=" + _CourseCredit + ", 老師=" + tea01.toString() + "]";
	}
    

}
