import java.awt.Frame;

/*дһ��С����*/

public class TankClient extends Frame{

	private static final long serialVersionUID = 1L;


	public void launchFranme() {
		setLocation(500, 200);
		setSize(800, 600);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new TankClient().launchFranme();
	}
	
}
