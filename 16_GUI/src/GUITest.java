import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
public class GUITest {

	public static void main(String[] args) {
		//font
		Font fn = new Font("Courier New",Font.BOLD,26);
		Font fn1 = new Font("Tahoma",Font.BOLD,14);
		//สร้าง frame กับ panel
		JFrame f = new JFrame("Frame Test");
		JPanel p = new JPanel();
		JButton b1 = new JButton("Close");
		Icon ic = new ImageIcon("popcat2.gif");
		Icon ic1 = new ImageIcon("cat2.gif");
		JButton b2 = new JButton("Run",ic);
		JLabel L1 = new JLabel("Cat Cat",SwingConstants.CENTER);//set center
		JLabel L2 = new JLabel(ic1,SwingConstants.CENTER);
		JLabel L3 = new JLabel("Meow",SwingConstants.CENTER);
		
		//label login
		JLabel mlbl, ulbl, pwlbl;
		JTextField usertxt = new JTextField(10);
		JPasswordField pwtxt = new JPasswordField(10);
		JButton singbtn, resetbtn;
		//ButtonGroup
		ButtonGroup bg = new ButtonGroup();
		JRadioButton n1 = new JRadioButton("MALE",true);
		JRadioButton n2 = new JRadioButton("FEMALE",true);
		String List[] = {"Ant","Bird","Cat","Dog","Rat","Pig","Cow"};
		JList AList = new JList(List);
		//CheckBox
		JCheckBox CheckBox1 = new JCheckBox("Asia");
		JCheckBox CheckBox2 = new JCheckBox("Europe");
		String country[] = {"Thailand","Italy","Japan","France","England","China"};
		JComboBox combo = new JComboBox(country);
		combo.setPreferredSize(new Dimension(150,20));
		combo.setSelectedItem("Japan");
		combo.setMaximumRowCount(6);
		
		AList.setFont(fn1);
		AList.setPreferredSize(new Dimension(135,140));
		AList.setVisibleRowCount(5);
		AList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane x = new JScrollPane(AList);
		
		mlbl = new JLabel("  *** Please Input Data ***  ");
		ulbl = new JLabel("Username");
		pwlbl = new JLabel("Password");
		singbtn = new JButton("Sing in");
		resetbtn = new JButton("Reset");
		mlbl.setFont(fn1);
		ulbl.setFont(fn1);
		pwlbl.setFont(fn1);
		p.add(mlbl);
		p.add(ulbl);
		p.add(usertxt);
		p.add(pwlbl);
		p.add(pwtxt);
		p.add(singbtn);
		p.add(resetbtn);
		
		L1.setFont(fn);
		L3.setFont(fn);
		L1.setPreferredSize(new Dimension(300,150));
		L2.setPreferredSize(new Dimension(130,130));
		L3.setPreferredSize(new Dimension(200,100));
		//set color font
		L1.setForeground(Color.WHITE);
		L3.setForeground(Color.orange);
		L2.setOpaque(true); //set ทึบแสง
		L2.setBackground(Color.gray);
		//เรียกใช้งาน
		p.add(b1);
		p.add(b2);
		p.add(L1);
		p.add(L2);
		p.add(L3);
		//สร้างพื้นหลังให้ frame
		p.setBackground(Color.WHITE);
		//add button group
		bg.add(n1);
		bg.add(n2);
		p.add(n1);
		p.add(n2);
		p.add(x);
		
		//เรียกใช้ CheckBox
		p.add(CheckBox1);
		p.add(CheckBox2);
		p.add(combo);
		
		f.add(p);
		
		
		
		
		//ปิดเฟรม
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set size
		f.setSize(900, 500);
		//แสดงขึ้นมา
		f.setVisible(true);
		

	}

}
