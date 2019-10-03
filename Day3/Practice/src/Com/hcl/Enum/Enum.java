package Com.hcl.Enum;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Enum {
	Day day;
	public Enum(Day day){
		this.day=day;
	}

	public static void main(String[] args) {
		String day="WEDNESDAY";
		Enum obj =new Enum(Day.valueOf(day));
		System.out.println(day);
	}
}
