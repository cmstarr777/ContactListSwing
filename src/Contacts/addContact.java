package Contacts;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class addContact {

    public static void main(String[] args)
    {
        //Schedule a job for the event dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                 //Turn off metal's use of bold fonts
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        createAndShowGUI();
            }
        });
    }
    
    private static void createAndShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("ContactSubmit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add content to the window.
        frame.add(new ContactSubmit());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
