import java.awt.*;
import javax.swing.*;

public class DBProject_idol extends JFrame{
	public DBProject_idol() {
		setTitle("���̵� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.WHITE);
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("���̵� �׷�"));
		cp.add(new JTextField(10));
		cp.add(new JLabel("���̵� �̸�"));
		cp.add(new JTextField(10));
		cp.add(new JButton("����ϱ�"));
		
		setSize(1000, 700);
		setVisible(true);
	}
	public static void main(String[] args) {
		DBProject_idol jbIdol = new DBProject_idol();
	}

}
