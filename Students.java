package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("method1:" + (id));
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Method2:" + (id));
		System.out.println("Method2:" + (name));
	}
	public void getStudentInfo(String email,String phoneNumber)
	{
		System.out.println("Method3:" + (email));
		System.out.println("Method3:" + (phoneNumber));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students S=new Students();
		S.getStudentInfo(1413116);
		S.getStudentInfo(14, "Dinesh Rajendran");
		S.getStudentInfo("dineshij@gmail.com", "8807089612");

	}

}
