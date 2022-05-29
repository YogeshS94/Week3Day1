package system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("DesktopSize");
	}
	public static void main(String arg[]) {
		Desktop desk = new Desktop();
		
		// Method from Computer Class
		desk.computerModel();
		
		// Method from Desktop Class
		desk.desktopSize();
	}
}