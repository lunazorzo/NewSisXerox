package NewSisXerox.Diagramas;

import gUtility.GImg;
//http://downloads.gphysics.net/cloud/software/eclipse/workspace/glibrary/gDialog/GMessage.java
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


public class GMessage {
	
	// Image
	public static int YES 		= 1; 
	public static int NO 		= 0;
	public static int OK 		= 2;
	public static int CANCEL 	= 3; 
	public static int CLOSE 	= 4;
	public static int WARNING 	= 5;
	public static int ERROR 	= 6;
	public static int JOCKER 	= 7;
	
	// Control
	public static int YES_CTRL 		= JOptionPane.YES_OPTION;
	public static int NO_CTRL 		= JOptionPane.NO_OPTION;
	public static int OK_CTRL 		= JOptionPane.OK_OPTION;
	public static int CANCEL_CTRL 	= JOptionPane.CANCEL_OPTION;
	public static int CLOSED_CTRL	= JOptionPane.CLOSED_OPTION;
		
	public static void showMessage(int ntype, String stitle, String stext){
		
		int nctrl;
		ImageIcon icon = null;
		
		if(ntype == WARNING){
			icon = GImg.getImageIcon("icons/warning.png","Warning");
			nctrl = JOptionPane.WARNING_MESSAGE;
		} else if(ntype == ERROR){
			icon = GImg.getImageIcon("icons/error.png","Error");
			nctrl = JOptionPane.ERROR_MESSAGE;
		} else if(ntype == JOCKER){
			icon = GImg.getImageIcon("icons/joker_image.png","Jocker");		
			nctrl = JOptionPane.OK_OPTION;
		} else {
			icon = GImg.getImageIcon("icons/ok.png","Ok");		
			nctrl = JOptionPane.OK_OPTION;
		}
	
		UIManager.put("OptionPane.buttonFont",new FontUIResource(new Font("Arial", Font.PLAIN, 12)));
		UIManager.put("OptionPane.messageFont",new FontUIResource(new Font("Arial", Font.PLAIN, 12)));
		
		if(stext.length() > 180){
			stext = stext.substring(0,180);
		}		
		JOptionPane.showMessageDialog(null,stext,stitle,nctrl,icon);
	}
	
	public static int askQuestionYesNo(String stitle, String stext){
		
		UIManager.put("OptionPane.buttonFont",new FontUIResource(new Font("Arial", Font.PLAIN, 12)));
		UIManager.put("OptionPane.messageFont",new FontUIResource(new Font("Arial", Font.PLAIN, 12)));
		
		Object[] options = {"Yes","No"};
		ImageIcon icon = GImg.getImageIcon("icons/question.png","Question");

		if(stext.length() > 180){
			stext = stext.substring(0,180);
		}		
		int n = JOptionPane.showOptionDialog(null,stext,stitle,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon,options,options[0]);
		
		return n;
	}
		
}
