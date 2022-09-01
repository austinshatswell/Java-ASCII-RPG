import java.sql.Ref;
import java.util.ArrayList;

public class Floor {

    private ArrayList<char[]> tiles;

    // Creates a floor
    // floorNumber = Original number of floor in the file
    public Floor(int floorNumber){
        System.out.println("[Floor]Creating floor"+floorNumber);

        tiles = new ArrayList<char[]>();

        ArrayList<String> strs = ResourceManager.readFloorFile("src/floor"+floorNumber+".txt");

        for(int i=0;i<strs.size()-1;i++){
            tiles.add(strs.get(i).toCharArray());
        }
    }

    //Gets size of floor on y coordinate
    public int getHeight() {return tiles.size();}

    //Gets size of floor on x coordinate
    public int getWidth() {return tiles.get(0).length;}

    //Returns one tile of the floor
    public char getTile(int x, int y) {return tiles.get(y)[x];}

    //Checks if player can  move in direction
    public boolean playerCanMove(Direction dir){
        switch(dir) {
            case FORWARD:
                return tiles.get(Reference.player.getY()-1)[Reference.player.getX()]!='#';
            case BACKWARDS:
                return tiles.get(Reference.player.getY()+1)[Reference.player.getX()]!='#';
            case LEFT:
                return tiles.get(Reference.player.getY())[Reference.player.getX()-1]!='#';
            case RIGHT:
                return tiles.get(Reference.player.getY())[Reference.player.getX()+1]!='#';
            default:
                return false;
        }
    }

    public void update(){
        //Delete all elements
        for(int i=0;i<this.getHeight();i++){
            for(int j=0;j<this.getWidth();j++){
                if(tiles.get(i)[j] == '@')
                    tiles.get(i)[j] = '.';
            }
        }

        //player
        tiles.get(Reference.player.getY())[Reference.player.getX()] = '@';
    }
}
