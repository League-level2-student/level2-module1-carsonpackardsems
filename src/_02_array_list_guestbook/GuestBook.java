package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame f = new JFrame();
	JFrame guestList = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	ArrayList<String> guests = new ArrayList();
	GuestBook(){
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		p.add(l);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setText("Add Name");
		b2.setText("View Names");
		f.pack();
	}
	public static void main(String[] args) {	
		GuestBook Register = new GuestBook();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1){
			String newName = JOptionPane.showInputDialog("Enter a new person into the guest book.");
			}
		if (e.getSource()==b2){
			JOptionPane.showMessageDialog(p, "Current occupants include...");
			for(int i = 0; i < guests)
			}

	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
