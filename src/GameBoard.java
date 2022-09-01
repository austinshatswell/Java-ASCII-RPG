import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener {

    public GameBoard(){
        addKeyListener(this);
        this.setFocusable(true);

        //initialization;
        Reference.currentFloor = new Floor(0);

        for(int i=0;i<Reference.currentFloor.getHeight();i++){
            for(int j=0;j<Reference.currentFloor.getWidth();j++){
                switch (Reference.currentFloor.getTile(j, i)) {
                    case '@':
                        Reference.player = new Player(j, i);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        repaint(); revalidate();

        //Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Reference.windowWidth, Reference.windowHeight);

        //Floor
        g.setColor(Color.WHITE);
        int x=20, y=20;
        for(int i=0;i<Reference.currentFloor.getHeight();i++){
            for(int j=0;j<Reference.currentFloor.getWidth();j++){
                g.drawString(""+ Reference.currentFloor.getTile(j, i), x, y);
                x+=15;
            }
            y+=15; x=20;
        }
    }

    @Override
    public void keyPressed(KeyEvent arg0) {

        switch(arg0.getKeyCode()) {
            //Move player up
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                if(Reference.currentFloor.playerCanMove(Direction.FORWARD))
                    Reference.player.move(Direction.FORWARD);
                break;
            //Move player down
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                if(Reference.currentFloor.playerCanMove(Direction.BACKWARDS))
                    Reference.player.move(Direction.BACKWARDS);
                break;
            //Move player left
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                if(Reference.currentFloor.playerCanMove(Direction.LEFT))
                    Reference.player.move(Direction.LEFT);
                break;
            //Move player right
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                if(Reference.currentFloor.playerCanMove(Direction.RIGHT))
                    Reference.player.move(Direction.RIGHT);
                break;
        }
        Reference.currentFloor.update();
    }

    @Override
    public void keyReleased(KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }
}
