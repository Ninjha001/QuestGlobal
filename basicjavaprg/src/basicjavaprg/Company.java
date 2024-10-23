package basicjavaprg;

public class Company {
	static String cname;
	Company(){
		cname = "QuestGlobal";
	}
	Company(String s){
		cname = s;
	}
	public static void main(String[] args) {
		System.out.println(cname);
		Company c1 = new Company();
		System.out.println(c1.cname);
		Company c2 = new Company("Infosys");
		//System.out.println(c1.cname);
		System.out.println(c2.cname);
	}

}
