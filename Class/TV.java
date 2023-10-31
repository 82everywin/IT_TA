package Class;

public class TV {
	String company;
	int year;
	int size;
	
	public TV(String company, int year, int size) {
		super();
		this.company = company;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",company,year,size);
	}
	

}
