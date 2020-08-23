package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{ //gui프로그램을 만들기
	//위해 기본적으로 상속받아야하는 기본 라이브러리.
	public DynamicBeat() {
		//생성자의 특징은 자신의 클래스와 같은 이름을 가진 메소드.
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
