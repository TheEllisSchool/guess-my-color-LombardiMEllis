import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GuessMyColor extends JFrame{
	

	public GuessMyColor(){	
		
		initGUI();
		
		setTitle("Game Window");
		//setSize(400, 200); //pixels
		setResizable(true);
		pack(); //pack means pack tightly - override the size
		setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

			
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public void initGUI(){
		//TITLE
		//create the label
		JLabel titleLabel = new JLabel("Guess My Color");
		//customize the label
		Font titleFont = new Font ("alphabetized cassette tapes", Font.BOLD, 32);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setBackground(new Color(29, 62, 114));
		titleLabel.setOpaque(true);
		//add the label to your window
		add(titleLabel, BorderLayout.PAGE_START);
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
		
		
		//CENTER PANEL
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		add(centerPanel, BorderLayout.CENTER);
		
		Dimension size = new Dimension(50, 50);
		
		JPanel myPanel = new JPanel();
		myPanel.setBackground(Color.BLACK); //this will change with buttons
		myPanel.setPreferredSize(size);
		centerPanel.add(myPanel, BorderLayout.PAGE_START);
		
		JPanel computerPanel = new JPanel();
		computerPanel.setBackground(Color.YELLOW); //will have to be randomized color
		computerPanel.setPreferredSize(size);
		centerPanel.add(computerPanel, BorderLayout.PAGE_END);
		
		//BUTTON PANEL
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(29, 62, 114));
		add(buttonPanel, BorderLayout.PAGE_END);
		
		//buttons
		JButton moreRedButton = new JButton("+");
		moreRedButton.setBackground(Color.RED);
		buttonPanel.add(moreRedButton);
		JButton lessRedButton = new JButton("-");
		lessRedButton.setBackground(Color.RED);
		buttonPanel.add(lessRedButton);

		
		JButton moreGreenButton = new JButton("+");
		moreGreenButton.setBackground(Color.GREEN);
		buttonPanel.add(moreGreenButton);
		JButton lessGreenButton = new JButton("-");
		lessGreenButton.setBackground(Color.GREEN);
		buttonPanel.add(lessGreenButton);
		
		JButton moreBlueButton = new JButton("+");
		moreBlueButton.setBackground(Color.BLUE);
		buttonPanel.add(moreBlueButton);
		JButton lessBlueButton = new JButton("-");
		lessBlueButton.setBackground(Color.BLUE);
		buttonPanel.add(lessBlueButton);

	}

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new GuessMyColor();
            }   
        });

	}

}
