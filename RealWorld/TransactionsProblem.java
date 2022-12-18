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

public class TransactionsProblem {

  public static ArrayList<JLabel> AccountLabelList = new ArrayList<>();
  public static ArrayList<JLabel> TransactionLabelList = new ArrayList<>();
  public static ArrayList<JLabel> zzzList = new ArrayList<>();

  void changeColortoBlack(int id){
      TransactionLabelList.get(id).setBackground(Color.GREEN);
  }

  void changeColortoNormal(int id){
      TransactionLabelList.get(id).setBackground(new Color(0x463F3A));
  }

  void ZZZshow(int id){
    zzzList.get(id).setVisible(true);
  }
  void ZZZhide(int id){
    zzzList.get(id).setVisible(false);
  }

    public static void main(String[] args) {

      JFrame frame = new JFrame();
      frame.setTitle("Transactions Problem");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 969, 660);
      JPanel contentPane = new JPanel();
      contentPane.setBackground(new Color(0xBCB8B1));
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(null);
      frame.setContentPane(contentPane);

    JLabel lblTransaction_1 = new JLabel("Transaction 1");
		lblTransaction_1.setOpaque(true);
		lblTransaction_1.setForeground(Color.WHITE);
		lblTransaction_1.setBackground(new Color(0x463F3A));
		lblTransaction_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction_1.setFont(new Font("TimesRoman", Font.BOLD, 12));
		lblTransaction_1.setBounds(543, 206, 115, 70);
		TransactionLabelList.add(lblTransaction_1);
		contentPane.add(lblTransaction_1);

    JLabel lblTransaction_2 = new JLabel("Transaction 2");
		lblTransaction_2.setOpaque(true);
		lblTransaction_2.setForeground(Color.WHITE);
		lblTransaction_2.setBackground(new Color(0x463F3A));
		lblTransaction_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransaction_2.setBounds(590, 402, 115, 70);
		TransactionLabelList.add(lblTransaction_2);
		contentPane.add(lblTransaction_2);

		JLabel lblTransaction_3 = new JLabel("Transaction 3");
		lblTransaction_3.setOpaque(true);
		lblTransaction_3.setForeground(Color.WHITE);
		lblTransaction_3.setBackground(new Color(0x463F3A));
		lblTransaction_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransaction_3.setBounds(410, 501, 115, 71);
		TransactionLabelList.add(lblTransaction_3);
		contentPane.add(lblTransaction_3);

		JLabel lblTransaction_4 = new JLabel("Transaction 4");
		lblTransaction_4.setOpaque(true);
		lblTransaction_4.setForeground(Color.WHITE);
		lblTransaction_4.setBackground(new Color(0x463F3A));
		lblTransaction_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransaction_4.setBounds(213, 402, 115, 70);
		TransactionLabelList.add(lblTransaction_4);
		contentPane.add(lblTransaction_4);

		JLabel lblTransaction = new JLabel("Transaction 5");
		lblTransaction.setOpaque(true);
		lblTransaction.setBackground(new Color(0x463F3A));
		lblTransaction.setForeground(Color.WHITE);
		lblTransaction.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransaction.setBounds(257, 206, 115, 70);
		TransactionLabelList.add(lblTransaction);
		contentPane.add(lblTransaction);
    
    JLabel lblAccount_1 = new JLabel("Account 1");
		lblAccount_1.setBackground(new Color(0x463F3A));
    lblAccount_1.setForeground(Color.WHITE);
		lblAccount_1.setOpaque(true);
		lblAccount_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount_1.setBounds(571, 310, 80, 27);
		AccountLabelList.add(lblAccount_1);
		contentPane.add(lblAccount_1);

		JLabel lblAccount_2 = new JLabel("Account 2");
		lblAccount_2.setBackground(new Color(0x463F3A));
    lblAccount_2.setForeground(Color.WHITE);
		lblAccount_2.setOpaque(true);
		lblAccount_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount_2.setBounds(504, 463, 80, 27);
		AccountLabelList.add(lblAccount_2);
		contentPane.add(lblAccount_2);

		JLabel lblAccount_3 = new JLabel("Account 3");
		lblAccount_3.setBackground(new Color(0x463F3A));
    lblAccount_3.setForeground(Color.WHITE);
		lblAccount_3.setOpaque(true);
		lblAccount_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount_3.setBounds(346, 463, 80, 27);
		AccountLabelList.add(lblAccount_3);
		contentPane.add(lblAccount_3);

		JLabel lblAccount_4 = new JLabel("Account 4");
		lblAccount_4.setBackground(new Color(0x463F3A));
    lblAccount_4.setForeground(Color.WHITE);
		lblAccount_4.setOpaque(true);
		lblAccount_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount_4.setBounds(306, 316, 80, 27);
		AccountLabelList.add(lblAccount_4);
		contentPane.add(lblAccount_4);

		JLabel lblAccount_5 = new JLabel("Account 5");
		lblAccount_5.setBackground(new Color(0x463F3A));
    lblAccount_5.setForeground(Color.WHITE);
		lblAccount_5.setOpaque(true);
		lblAccount_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount_5.setBounds(425, 228, 80, 27);
		AccountLabelList.add(lblAccount_5);
		contentPane.add(lblAccount_5);

		JTextArea txtrObserveTheDining = new JTextArea();
		txtrObserveTheDining.setEditable(false);
		txtrObserveTheDining.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		txtrObserveTheDining.setLineWrap(true);
    txtrObserveTheDining.setBackground(new Color(0xBCB8B1));
		txtrObserveTheDining.setText("- 5 Transactions are made in a bank.\r\n- There are 5 accounts to be processed on. \r\n- All the transactions are pending and has to be finished\r\n- The transaction can happen only if the two accounts it's being made on are available");
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


    Account[] s = new Account[5];
    Transaction[] f = new Transaction[5];
    Status hlp = new Status();
    for (int i = 0; i < 5; i++) {
      s[i] = new Account();
    }
    for (int i = 0; i < 5; i++) {
      f[i] = new Transaction(i, s[i], s[(i + 4) % 5], hlp);
      new Thread(f[i]).start();
    }
    
      
   }
}
