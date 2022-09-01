//import java.util.Random;
/*
import java.util.Scanner;

public class GameLogic {
    private static final Scanner UI = new Scanner(System.in);
    private String userIn;

    public GameLogic(){

    }
    public void waitForCommand(){
        if (GameObjects.pc.inRoom == 0) {
            try {
                introDialogue();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("error during character creation");
            }
        }

        System.out.println("What would you like to do?");
        System.out.println("(Battle | Credits | Exit)");
        userIn = UI.next();

        if (userIn.equalsIgnoreCase("Battle")){
            battle();
        }
        else if (userIn.equalsIgnoreCase("Credits")){
            credits();
        }
        else if (userIn.equalsIgnoreCase("Exit")) {
            exit();
        }
        else {
            System.out.println("Invalid input.");
        }
    }

    public void introDialogue() throws InterruptedException {
        System.out.println("A new arrival, have we?");
        Thread.sleep(2000);
        createCharacter();
        System.out.println("Very well then. It is good you are honest.");
        setPlayerStats();
        Thread.sleep(2000);
        GameObjects.pc.inRoom = 1;
    }
    public void createCharacter() throws InterruptedException {

        System.out.println("What is your name?");
        GameObjects.pc.name = UI.next();
        Thread.sleep(2000);
        System.out.println("And what vocation do you favor?");
        System.out.println("(1. Warrior | 2. Scoundrel | 3. Paladin | 4. Warlock | 5. Sorcerer)");

        while(GameObjects.pc.vocation == null) {
            userIn = UI.next();

            if (userIn.equalsIgnoreCase("Warrior") || userIn.equals("1")) {
                GameObjects.pc.vocation = "Warrior";
                GameObjects.pc.att = 3;
                GameObjects.pc.def = 2;
                GameObjects.pc.body = 9;
                GameObjects.pc.mind = 2;
            }
            else if (userIn.equalsIgnoreCase("Scoundrel") || userIn.equals("2")) {
                GameObjects.pc.vocation = "Scoundrel";
                GameObjects.pc.att = 4;
                GameObjects.pc.def = 1;
                GameObjects.pc.body = 5;
                GameObjects.pc.mind = 3;
            }
            else if (userIn.equalsIgnoreCase("Paladin") || userIn.equals("3")) {
                GameObjects.pc.vocation = "Paladin";
                GameObjects.pc.att = 2;
                GameObjects.pc.def = 3;
                GameObjects.pc.body = 8;
                GameObjects.pc.mind = 4;
            }
            else if (userIn.equalsIgnoreCase("Warlock") || userIn.equals("4")) {
                GameObjects.pc.vocation = "Warlock";
                GameObjects.pc.att = 1;
                GameObjects.pc.def = 2;
                GameObjects.pc.body = 5;
                GameObjects.pc.mind = 6;
            }
            else if (userIn.equalsIgnoreCase("Sorcerer") || userIn.equals("5")) {
                GameObjects.pc.vocation = "Sorcerer";
                GameObjects.pc.att = 2;
                GameObjects.pc.def = 1;
                GameObjects.pc.body = 4;
                GameObjects.pc.mind = 8;
            }
        }

        Thread.sleep(2000);
        System.out.println("So then you are " + GameObjects.pc.name + " the " + GameObjects.pc.vocation + "?");
        System.out.println("(Yes/No)");
        userIn = UI.next();
        Thread.sleep(2000);
        if (userIn.equalsIgnoreCase("No")) {
            GameObjects.pc.name = null;
            GameObjects.pc.vocation = null;
            System.out.print("Well then... ");
            createCharacter();
        }
    }

    public void setPlayerStats(){

        //GameObjects.pc.att = 3;
        //GameObjects.pc.def = 3;
        //GameObjects.pc.body = 3;
        //GameObjects.pc.mind = 3;
        System.out.println("(Demo player stats set)");

    }

    public void battle(){
        //String userIn;

        System.out.println("What would you like to battle?");
        System.out.println("1. Skeleton | 2. Imp | 3. Crypt Fiend");
        userIn = UI.next();

        if (userIn.equalsIgnoreCase("Skeleton") || userIn.equals("1")){
            System.out.println("You fought a Skeleton!");
            System.out.println("As a " + GameObjects.pc.vocation + ", your attack value is " + GameObjects.pc.att);
        }
        else if (userIn.equalsIgnoreCase("Imp") || userIn.equals("2")) {
            System.out.println("You fought an Imp!");
            System.out.println("As a " + GameObjects.pc.vocation + ", your defence value is " + GameObjects.pc.def);
        }
        else if (userIn.equalsIgnoreCase("Crypt") || userIn.equals("3")) {
            System.out.println("You fought a Crypt Fiend!");
            System.out.println("As a " + GameObjects.pc.vocation + ", your body value is " + GameObjects.pc.body);
        }
    }

    public void credits(){
        System.out.println("this is where the credits go!");
        System.out.println("...Not much here ¯\\_(ツ)_/¯");
    }

    public void exit(){
        System.out.println("Are you sure you'd like to exit?");
        System.out.println("(Yes/No)");
        userIn = UI.next();

        if(userIn.equalsIgnoreCase("Yes")) {
            System.out.println("Until next time.");
            System.exit(0);
        }
    }
}
*/
