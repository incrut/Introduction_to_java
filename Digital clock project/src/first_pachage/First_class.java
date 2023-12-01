package first_pachage;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class First_class {

	static void show() {
		// creating a window for digital clock
		JFrame frame = new JFrame("DigiClock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creating a label to print time
		JLabel label = new JLabel("", SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(225, 75));
		label.setFont(new Font("TimesNewRoman", Font.BOLD, 50));
		frame.getContentPane().add(label, BorderLayout.CENTER);

		// Displaying the window
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

		//Setting time
		int delay = 100;
		Timer timer = new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
				String timing = now.format(format);
				label.setText(timing);
			}
		});

		timer.start();
    }

	public static void main(String args[]) {
		show();
	}
}