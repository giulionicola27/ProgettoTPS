import control.Control;
import view.Finestra;

public class Main {

	public static void main(String[] args) {
		
		Finestra f=new Finestra();
		Control c=new Control(f);
		
		f.setVisible(true);

	}

}
