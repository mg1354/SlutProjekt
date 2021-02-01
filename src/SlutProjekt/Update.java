    package SlutProjekt;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionListener;

//Ska implementera Runnable och starta en tr�d som Regelbundet
//	updaterar Guit utifr�n vad som h�nder i spelet.

	    public class Update extends JFrame {

	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private JPanel panel;
	        private JTextArea showRoom;
	        private JTextArea showPersons;
	        private JTextField input;
	        private JTextArea inventory;
	        private String command;
	        private boolean gotCommand;
	        private JButton button;
	        
	        public Update(){
	            this.gotCommand = false;
	            this.command = "";
	            this.setTitle("Game");
	            this.setSize(800, 600);
	            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	            setUpElements();
	            setUpPanel();
	            this.add(panel);
	            this.setVisible(true);
	            this.setResizable(false);
	        }

//	        //Returnera det senaste commitade kommandot
//	        public String getCommand(){
//	            if (this.gotCommand){
//	                System.out.println(this.command);
//	                return this.command;
//	            }
//	            return null;
//	        }
//	        
//	        //H�r kan man updatera respektive f�lt:
//	        public void setShowRoom(String roomDescription){
//	            this.showRoom.setText(roomDescription);
//	         }
//	        public void setShowPersons(Person person){
//	            this.showPersons.setText(person.toString());
//	        }
//	        public void setShowInventory(Inventory i){
//	            this.input.setText(i.toString());
//	        }
//
//	        //Add person to room
//	        public void setPerson(Person p){
//	            this.showPersons.setText(p.toString());
//	        }
//
//	//Nedanst�enda spaghetti �r inte vacker...
//
//
	        public void gotCommand(){
	            this.gotCommand = false;
	        }

	        private void setUpPanel(){
	            this.panel.add(showPersons);
	            this.panel.add(showRoom);
	            this.panel.add(input);
	            this.panel.add(inventory);
	            this.panel.add(button);

	        }
	        
	        private void setUpElements(){
	            this.panel = new JPanel(new GridLayout(4,3));
	            this.showRoom = new JTextArea("Room: ");
	            this.showPersons = new JTextArea("Persons");
	            this.inventory = new JTextArea("Inventory");
	            this.input = new JTextField("Give command");
	            this.showPersons.setEditable(false);
	            this.showRoom.setEditable(false);
	            this.inventory.setEditable(false);

	            ActionListener inputListener = e -> {
	                this.command = input.getText();
	                this.gotCommand = true;
	                System.out.println(this.command);};

	            input.addActionListener(inputListener);

	            this.button = new JButton("commit");
	            this.button.addActionListener(inputListener);

	        }


	    }

