class school{
	school(){
		System.out.println("Print constructor 1");
	}
	school(int ivalue){
		this();
		System.out.println("Print constructor "+ ivalue);
	}
	school(int ivalue, float fvalue){
		this(ivalue);
		System.out.println("Print constructor "+ ivalue+" "+ fvalue);
	}
}
class Constchain{
	public static void main(String[] args){
	school ref = new school();
	school ref1 = new school(10);
	school ref2 = new school(20, 1.5f);
	}
}