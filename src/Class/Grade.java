package Class;

public class Grade {
	
	private int math;
	private int science;
	private int eng; 
	
	public void setMath(int math) {
		this.math = math;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public Grade(int math, int science, int eng) {
		super();
		this.math = math;
		this.science = science;
		this.eng = eng;
	}
	
	public int avg() {
		int avg =( math+ science+eng )/ 3;
		return avg;
	}
	
	

}
