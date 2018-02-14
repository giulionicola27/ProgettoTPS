package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import view.Finestra;

public class Control implements ActionListener{

	private Finestra f;
	URL xml;
	
	public Control(Finestra f){
		this.f=f;
		
		f.getBtnInviaDati().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		DistanceMatrixResponse current=null;
	
		if(e.getSource()==f.getBtnInviaDati()) {
			System.out.println("Ho premuto il pulsante ricerca");
			String pt=f.getTextField().getText().toString();
			String dt=f.getTextField_1().getText().toString();
			String mezzo=f.getComboBox().getSelectedItem().toString();
			
			if(mezzo.equals("Macchina"))
				mezzo="driving";
			else 
				if(mezzo.equals("A piedi"))
					mezzo="walking";
			try {
				xml = new URL("https://maps.googleapis.com/maps/api/distancematrix/xml?origins="+pt+"+IT&destinations="+dt+"+IT&mode="+mezzo+"&key=AIzaSyDQWbUDiI_r8FJqMtJDcPIAB-jdJVB0-Mw");
				JAXBContext jaxbContext = JAXBContext.newInstance(DistanceMatrixResponse.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				current = (DistanceMatrixResponse) jaxbUnmarshaller.unmarshal(xml);
			} catch (Exception a) {
				
			}
			
			String c=current.getRow().get(0).getElement().get(0).getDuration().getText();
			
			f.getLabel_2().setText("Il tempo calcolato per andare da "+pt+" a "+dt+" è di "+c);
			f.getLabel_3().setText("Sono previsti "+current.getRow().get(0).getElement().get(0).getDistance().getText());
			
		}
		
	}
	
}
