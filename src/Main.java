import javax.swing.JFrame;

public class Main {

    private static JFrame window;
    private static GameBoard gameBoard;

    //static GameLogic gl = new GameLogic();

    public static void main(String[] args) {

        System.out.println("[Main]Running...");
        createWindow();
        createGameBoard();

        /*
        while(true) {
            gameLoop();
        }
         */
    }

    public static void gameLoop () {

        //gl.waitForCommand();
    }

    private static void createWindow() {
        System.out.println("[Main]Creating window");
        window = new JFrame("Java RPG");
        window.setVisible(true);
        window.setResizable(false);
        window.setBounds(200, 100, Reference.windowWidth, Reference.windowHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void createGameBoard() {
        System.out.println("[Main]Creating game board");
        gameBoard = new GameBoard();
        window.add(gameBoard);
        gameBoard.requestFocusInWindow();
    }
}
