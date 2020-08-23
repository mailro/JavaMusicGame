package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{ //gui프로그램을 만들기
	//위해 기본적으로 상속받아야하는 기본 라이브러리.
	
	
	//더블버퍼링을 위해서 전체화면에 대한 이미지를 담는 인스턴스
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	//배경 이미지를 담을 수있는 객체임.
	
	public DynamicBeat() {
		//생성자의 특징은 자신의 클래스와 같은 이름을 가진 메소드.
		setTitle("DynamicBeat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	
	//생성자
	introBackground = new ImageIcon(Main.class.getResource("../images/glitch_aesthetic-wallpaper-1280x720.jpg")).getImage();

	Music introMusic = new Music("intromusic.mp3", true);
	introMusic.start();
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
	
}
