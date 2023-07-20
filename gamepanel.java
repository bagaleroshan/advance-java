import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.random.*;
public class gamepanel extends JPanel implements ActionListener{
    static final int SCREEN_WIDTH=600;
    static final int SCREEN_HIGHT=600;
    static final int UNIT_SIZE=25;
    static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HIGHT)/UNIT_SIZE;
    static final int DELAY=75;
    final int x[]=new int[GAME_UNITS];
    final int y[]=new int[GAME_UNITS];
    int bodyParts=6;
    int applesEaten;
    int appleX;
    int appelY;
    char direction='R';
    boolean running=false;
    Timer timer;
    Random random;
    gamepanel(){
            random =new Random();
            this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HIGHT));
            this.setBackground(Color.black);
            this.setFocusable(true);
            this.addKeyListener(new MyKeyAdapter());
            startGame();
        }
    public void startGame(){
newApple();
running=true;
timer=new Timer(DELAY, this);
timer.start();
    }
    public void paintComponent(Graphics g){
super.paintComponent(g);
 draw(g);
    }
    public void draw(Graphics g){
        for(int i=0;i<SCREEN_HIGHT/UNIT_SIZE;i++){

        
        g.drawLine(i*UNIT_SIZE, 0,i*UNIT_SIZE ,SCREEN_HIGHT);
        g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH,i*UNIT_SIZE);
    }
    g.setColor(Color.red);
    g.fillOval(appleX, DELAY, UNIT_SIZE, UNIT_SIZE);
    for (int i=0;i<bodyParts;i++){
        if(i==0){
            g.setColor(Color.green);
            g.fillRect(x[i], y[i], UNIT_SIZE ,UNIT_SIZE;
        }
        else{
            g.setColor(new Color(45, 180, 0));
            g.fillRect(x[i], y[i], UNIT_SIZE,UNIT_SIZE);
        }
    }
}
    public void newApple(){
        appleX=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appelY=random.nextInt((int)(SCREEN_HIGHT/UNIT_SIZE))*UNIT_SIZE;
 }
    public void move(){
for(int i=bodyParts;i>0;i--){
    x[i]=x[i-1];
    y[i]=y[i-1];
}
    
switch(direction){
    case'U':
    y[0]=y[0]-UNIT_SIZE;
    break;
    case'D':
    y[0]=y[0]+UNIT_SIZE;
    break;
    case'L':
    y[0]=y[0]-UNIT_SIZE;
    break;
    case'R':
    y[0]=y[0]+UNIT_SIZE;
    break;
}
    }
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameover(Graphics g){

    }
    @Override
    public void actionPerformed (ActionEvent ae){

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent ke){

        }
    }
    public static void main(String[] args) {
       new gamepanel(); 
    }
}