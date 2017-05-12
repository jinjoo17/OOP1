package bit.edu;
//영화-> 제목, 가격, 주인공, 제작사, 상영관, 시간.....:상태정보
public class MovieVO {
//1. 모든 멤버변수는 정보은닉(private)
	private String title;
	private int price;
	private String major;
	private int level;
	public MovieVO(){
		//2.디폴트 생성자메서드(생략)를 명시적으로 만들것
		//① 객체를 생성하는 일(내부적으로하는일)
		//② 객체의 초기화하는 일(직접)
		title="보스베이비";
		price=15000;
		major="보스";
		level=12;
		
	}
	public MovieVO(String title, int price, String major, int level) {
		
		this.title = title;
		this.price = price;
		this.major = major;
		this.level = level;
	}
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;//this:클래스를 설계때 언젠가는 만들어질 자기자신을 가리키는 포인터
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	//4. 디버깅을 위해 toString    
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", major=" + major + ", level=" + level + "]";
	}
	
	//3. setter, getter method
	
}
