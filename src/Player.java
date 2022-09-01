public class Player {

    private int posX;
    private int posY;

    String name;
    String vocation;
    int att;
    int def;
    int body;
    int mind;
    int inRoom = 0;

    public Player(int posX, int posY){
        System.out.println("[Player]Creating Player");
        this.posX= posX;
        this.posY= posY;

    }

    public int getX() {return posX;}

    public int getY() {return posY;}

    //Updates position of player
    public void move(Direction dir){
        switch(dir) {
            case FORWARD:
                this.posY--; break;
            case LEFT:
                this.posX--; break;
            case BACKWARDS:
                this.posY++; break;
            case RIGHT:
                this.posX++; break;
        }

        System.out.println("[Player]Position is now "+posX+" "+posY);
    }
}
