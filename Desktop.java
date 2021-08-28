package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("65CM");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Computer*******");
		Computer c=new Computer();
		c.computerModel();
		System.out.println("*******Desktop********");
		Desktop D=new Desktop();
		D.computerModel();
		D.desktopSize();
	}

}
