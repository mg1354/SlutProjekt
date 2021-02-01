package SlutProjekt;
import java.awt.Color;
import javax.swing.*;  
 
public class Gui {  
     
	Gui(){  
        JFrame f= new JFrame("Rooms");
         
        JPanel r1=new JPanel();  
        r1.setBounds(20,20,200,150);    
        r1.setBackground(Color.GREEN);  
         JPanel r2=new JPanel();  
        r2.setBounds(240,20,200,150);    
        r2.setBackground(Color.GREEN); 
        JPanel r3=new JPanel();  
        r3.setBounds(460,20,200,150);    
        r3.setBackground(Color.GREEN); 
        JPanel r4=new JPanel();  
        r4.setBounds(680,20,200,150);    
        r4.setBackground(Color.GREEN);
        JPanel r5=new JPanel();  
        r5.setBounds(20,200,500,250);    
        r5.setBackground(Color.GREEN);
        
//      **************          
        r1.setLayout(null);
        JLabel l1 = new JLabel("**Room 1**");
        l1.setBounds(70,10,80,25); 
        r1.add(l1);
        JLabel l11 = new JLabel("Lamp,  ");
        l11.setBounds(30,50,100,25);
        r1.add(l11);
        JLabel l12 = new JLabel("Table,   ");
        l12.setBounds(30,80,100,25);
        r1.add(l12);
        JLabel l13 = new JLabel("Chair.");
        l13.setBounds(30,110,100,25);
        r1.add(l13);
//        **************   
        r2.setLayout(null); 
        JLabel l2 = new JLabel("**Room 2**");
        l2.setBounds(70,10,80,25);    
        r2.add(l2);
        JLabel l21 = new JLabel("Lamp,  ");
        l21.setBounds(30,50,100,25);
        r2.add(l21);
        JLabel l22 = new JLabel("Sofa,   ");
        l22.setBounds(30,80,100,25);
        r2.add(l22);
        JLabel l23 = new JLabel("TV.");
        l23.setBounds(30,110,100,25);
        r2.add(l23);
//      ************** 
        r3.setLayout(null);
        JLabel l3 = new JLabel("**Room 3**");
        l3.setBounds(70,10,80,25);    
        r3.add(l3);
        JLabel l31 = new JLabel("Bed,");
        l31.setBounds(30,50,100,25);    
        r3.add(l31);
        JLabel l32 = new JLabel("Lamp,  ");
        l32.setBounds(30,80,100,25);
        r3.add(l32);
        JLabel l33 = new JLabel("Closet.   ");
        l33.setBounds(30,110,100,25);
        r3.add(l33);
//      **************
        r4.setLayout(null);
        JLabel l4 = new JLabel("**Room 4**");
        l4.setBounds(70,10,100,25);    
        r4.add(l4);
        JLabel l41 = new JLabel("Desk");
        l41.setBounds(30,50,100,25);    
        r4.add(l41);
        JLabel l42 = new JLabel("Laptop,");
        l42.setBounds(30,80,100,25);
        r4.add(l42);
        JLabel l43 = new JLabel("Mobil.");
        l43.setBounds(30,110,100,25);
        r4.add(l43);
        
        r5.setLayout(null);
        JButton b1=new JButton("Button 1");     
        b1.setBounds(20,20,100,30);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("Button 2");   
        b2.setBounds(120,20,100,30);    
        b2.setBackground(Color.yellow);   
        r5.add(b1); r5.add(b2);  
        
        f.add(r1);  f.add(r2); f.add(r3);  f.add(r4); f.add(r5);
                f.setSize(900,500);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
        
	public static void main(String args[])  
        {  
        new Gui();  
        }  
    }