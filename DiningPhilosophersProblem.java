package os2project;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DiningPhilosophersProblem {

  public static ArrayList<JLabel> forkLabelList = new ArrayList<>();
  public static ArrayList<JLabel> PhilosopherLabelList = new ArrayList<>();
  public static ArrayList<JLabel> zzzList = new ArrayList<>();

  void changeColortoBlack(int id){
      PhilosopherLabelList.get(id).setBackground(Color.GREEN);
  }

  void changeColortoNormal(int id){
      PhilosopherLabelList.get(id).setBackground(new Color(0x463F3A));
  }

  void ZZZshow(int id){
    zzzList.get(id).setVisible(true);
  }
  void ZZZhide(int id){
    zzzList.get(id).setVisible(false);
  }

    public static void main(String[] args) {

      JFrame frame = new JFrame();
      frame.setTitle("Dining Philosophers");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 969, 660);
      JPanel contentPane = new JPanel();
      contentPane.setBackground(new Color(0xBCB8B1));
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(null);
      frame.setContentPane(contentPane);

    JLabel lblPhilosopher_1 = new JLabel("Philosopher 1");
		lblPhilosopher_1.setOpaque(true);
		lblPhilosopher_1.setForeground(Color.WHITE);
		lblPhilosopher_1.setBackground(new Color(0x463F3A));
		lblPhilosopher_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_1.setFont(new Font("TimesRoman", Font.BOLD, 12));
		lblPhilosopher_1.setBounds(543, 206, 115, 70);
		PhilosopherLabelList.add(lblPhilosopher_1);
		contentPane.add(lblPhilosopher_1);

    JLabel lblPhilosopher_2 = new JLabel("Philosopher 2");
		lblPhilosopher_2.setOpaque(true);
		lblPhilosopher_2.setForeground(Color.WHITE);
		lblPhilosopher_2.setBackground(new Color(0x463F3A));
		lblPhilosopher_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_2.setBounds(590, 402, 115, 70);
		PhilosopherLabelList.add(lblPhilosopher_2);
		contentPane.add(lblPhilosopher_2);

		JLabel lblPhilosopher_3 = new JLabel("Philosopher 3");
		lblPhilosopher_3.setOpaque(true);
		lblPhilosopher_3.setForeground(Color.WHITE);
		lblPhilosopher_3.setBackground(new Color(0x463F3A));
		lblPhilosopher_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_3.setBounds(410, 501, 115, 71);
		PhilosopherLabelList.add(lblPhilosopher_3);
		contentPane.add(lblPhilosopher_3);

		JLabel lblPhilosopher_4 = new JLabel("Philosopher 4");
		lblPhilosopher_4.setOpaque(true);
		lblPhilosopher_4.setForeground(Color.WHITE);
		lblPhilosopher_4.setBackground(new Color(0x463F3A));
		lblPhilosopher_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_4.setBounds(213, 402, 115, 70);
		PhilosopherLabelList.add(lblPhilosopher_4);
		contentPane.add(lblPhilosopher_4);

		JLabel lblPhilosopher = new JLabel("Philosopher 5");
		lblPhilosopher.setOpaque(true);
		lblPhilosopher.setBackground(new Color(0x463F3A));
		lblPhilosopher.setForeground(Color.WHITE);
		lblPhilosopher.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher.setBounds(257, 206, 115, 70);
		PhilosopherLabelList.add(lblPhilosopher);
		contentPane.add(lblPhilosopher);
    
    JLabel lblFork_1 = new JLabel("Chopstick 1");
		lblFork_1.setBackground(new Color(0x463F3A));
    lblFork_1.setForeground(Color.WHITE);
		lblFork_1.setOpaque(true);
		lblFork_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_1.setBounds(571, 310, 80, 27);
		forkLabelList.add(lblFork_1);
		contentPane.add(lblFork_1);

		JLabel lblFork_2 = new JLabel("Chopstick 2");
		lblFork_2.setBackground(new Color(0x463F3A));
    lblFork_2.setForeground(Color.WHITE);
		lblFork_2.setOpaque(true);
		lblFork_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_2.setBounds(504, 463, 80, 27);
		forkLabelList.add(lblFork_2);
		contentPane.add(lblFork_2);

		JLabel lblFork_3 = new JLabel("Chopstick 3");
		lblFork_3.setBackground(new Color(0x463F3A));
    lblFork_3.setForeground(Color.WHITE);
		lblFork_3.setOpaque(true);
		lblFork_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_3.setBounds(346, 463, 80, 27);
		forkLabelList.add(lblFork_3);
		contentPane.add(lblFork_3);

		JLabel lblFork_4 = new JLabel("Chopstick 4");
		lblFork_4.setBackground(new Color(0x463F3A));
    lblFork_4.setForeground(Color.WHITE);
		lblFork_4.setOpaque(true);
		lblFork_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_4.setBounds(306, 316, 80, 27);
		forkLabelList.add(lblFork_4);
		contentPane.add(lblFork_4);

		JLabel lblFork_5 = new JLabel("Chopstick 5");
		lblFork_5.setBackground(new Color(0x463F3A));
    lblFork_5.setForeground(Color.WHITE);
		lblFork_5.setOpaque(true);
		lblFork_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_5.setBounds(425, 228, 80, 27);
		forkLabelList.add(lblFork_5);
		contentPane.add(lblFork_5);

		JTextArea txtrObserveTheDining = new JTextArea();
		txtrObserveTheDining.setEditable(false);
		txtrObserveTheDining.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		txtrObserveTheDining.setLineWrap(true);
    txtrObserveTheDining.setBackground(new Color(0xBCB8B1));
		txtrObserveTheDining.setText("- 5 philosophers sit at a table\r\n- There are only 5 forks on the table \r\n- They are all hungry & want to eat\r\n- They can only eat when the fork to the left & right of them are both available\r\n- After eating for a period, they then take a quick snooze before trying to eat again :)\r\n- Watch as they take turns to use the forks (using the sychronized key word to check if a\tFork is available or not)");
		txtrObserveTheDining.setBounds(40, 20, 843, 141);
		contentPane.add(txtrObserveTheDining);

		JLabel lblZzz1 = new JLabel("zzz...");
		lblZzz1.setVisible(false);
		lblZzz1.setBounds(668, 206, 46, 14);
		zzzList.add(lblZzz1);
		contentPane.add(lblZzz1);

		JLabel lblZzz2 = new JLabel("zzz...");
		lblZzz2.setVisible(false);
		lblZzz2.setBounds(715, 402, 46, 14);
		zzzList.add(lblZzz2);
		contentPane.add(lblZzz2);

		JLabel lblZzz3 = new JLabel("zzz...");
		lblZzz3.setVisible(false);
		lblZzz3.setBounds(535, 501, 46, 14);
		zzzList.add(lblZzz3);
		contentPane.add(lblZzz3);

		JLabel lblZzz4 = new JLabel("zzz...");
		lblZzz4.setVisible(false);
		lblZzz4.setBounds(337, 402, 46, 14);
		zzzList.add(lblZzz4);
		contentPane.add(lblZzz4);

		JLabel lblZzz5 = new JLabel("zzz...");
		lblZzz5.setVisible(false);
		lblZzz5.setBounds(382, 206, 46, 14);
		zzzList.add(lblZzz5);
		contentPane.add(lblZzz5);

    frame.setVisible(true);


    Chopstick[] s = new Chopstick[5];
    Philosopher[] f = new Philosopher[5];
    State hlp = new State();
    for (int i = 0; i < 5; i++) {
      s[i] = new Chopstick();
    }
    for (int i = 0; i < 5; i++) {
      f[i] = new Philosopher(i, s[i], s[(i + 4) % 5], hlp);
      new Thread(f[i]).start();
    }
    
      
   }
}
