package RhythmGame;

import javax.swing.JFrame;

public class RhythmGame extends JFrame{
    public RhythmGame(){
        setTitle("RhythmGame");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 창 만들기
        setResizable(false); // 리사이즈 불가
        setLocationRelativeTo(null); // 컴퓨터 정중앙
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 끄면 프로그램 종료
        setVisible(true); //디폴트값 false 게임창을 화면에 출력하게

    }
}
