/**
 * @(#)MainGUI.java
 *
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainGUI extends JFrame implements ActionListener 
{
	JFrame f4;
	JMenuBar mb;
	JMenu info,algo,about,exit;
	JMenuItem FCFS,About,SJF,Run,End,RRB,Priority;
	JPanel p;
	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;

    public MainGUI() 
    {
    f4= new JFrame("CPU OS SCHEDULING ALGORITHMS");
	f4.setSize(1500,1500);
	

	ImageIcon lblimage=new ImageIcon("s4.gif");				//add gif here
	JLabel picturelbl=new JLabel(lblimage);
	picturelbl.setBounds(100,100,500,500);
	f4.add(picturelbl);
	
	ImageIcon lblimage2=new ImageIcon("s2.gif");				//add gif here
	JLabel picturelbl2=new JLabel(lblimage2);
	picturelbl2.setBounds(700,10,300,400);
	f4.add(picturelbl2);
	
 

	f4.getContentPane().setLayout(null);

	mb = new JMenuBar();

	algo = new JMenu("Scheduling ALGORITHM");
	Run= new JMenuItem("RUN");
	algo.add(Run);
	mb.add(algo);
	
	info = new JMenu("ALGORITHM INFO");
	FCFS= new JMenuItem("First Come First Serve");
	SJF= new JMenuItem("Shoretst Job First");
	Priority= new JMenuItem("Priority Scheduling");
	RRB= new JMenuItem("Round Robin");
	info.add(FCFS);
	info.add(SJF);
	info.add(RRB);
	info.add(Priority);
	mb.add(info);
	
	about = new JMenu("VIDEO TUTORIAL");
	About= new JMenuItem("Scheduling Algo Video");
	about.add(About);
	mb.add(about);
	
	exit = new JMenu("EXIT");
	End= new JMenuItem("END");
	exit.add(End);
	mb.add(exit);

f4.setJMenuBar(mb);
mb.setBackground(Color.pink);

FCFS.addActionListener(this);
About.addActionListener(this);
SJF.addActionListener(this);
RRB.addActionListener(this);
Priority.addActionListener(this);
Run.addActionListener(this);
End.addActionListener(this);
f4.setVisible(true);              

}
    
   public void paintComponent(Graphics g)
        {
        	g.drawString("Scheduling",70,120);
        	
        }
public void actionPerformed(ActionEvent ae)
{

			Object objekpencet=ae.getSource();
			
			if((objekpencet==Run))
			{
				GUI g1=new GUI();		
			}
			else
			if((objekpencet==FCFS))
			{
			try{
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\os_algo.pdf");
			p.waitFor();
			}
			catch(Exception e){
				System.out.println(e);
			}
				
			}
			else
			if((objekpencet==SJF))
			{
			try{
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\SJF.pdf");
			p.waitFor();
			}
			catch(Exception e){
				System.out.println(e);
			}
			}
			else
			if((objekpencet==Priority))
			{
			try{
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\Priority.pdf");
			p.waitFor();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			else
			if((objekpencet==RRB))
			{
			try{
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\RRB.pdf");
			p.waitFor();
			}
			catch(Exception e){
				System.out.println(e);
			}		
			}
			else
			if((objekpencet==About))
			{
			try{
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\SCHEDULING ALGORITHM.mp4");
			p.waitFor();
			}
			catch(Exception e){
				System.out.println(e);
			}		
			}
			else
			if((objekpencet==End))
			{
				System.exit(0);
			}    
}
public static void main(String args[])
{
MainGUI lg=new MainGUI();
//SSC s = new SSC();
}
}




