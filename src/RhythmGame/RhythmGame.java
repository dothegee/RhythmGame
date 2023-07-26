package RhythmGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

public class RhythmGame extends JFrame{
    private Image screenImage;
    private Graphics screenGraphic;

    private Image introBackground;

    public RhythmGame(){
        setTitle("RhythmGame");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 창 만들기
        setResizable(false); // 리사이즈 불가
        setLocationRelativeTo(null); // 컴퓨터 정중앙
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 끄면 프로그램 종료
        setVisible(true); //디폴트값 false 게임창을 화면에 출력하게

        introBackground = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();
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
