/**
 * Simple, text-based interface for playing "Hunt the Wumpus"
 *   @author Dave Reed
 *   @version 4/1/13
 */
public class HuntTheWumpus {

    public static void main(String[] args) throws java.io.FileNotFoundException {
        CaveMaze maze = new CaveMaze("cavesdata.dat");


     /*   System.out.println("HUNT THE WUMPUS:  Your mission is to explore the maze of caves");
        System.out.println("and destroy all of the wumpi (without getting yourself killed).");
        System.out.println("To move to an adjacent cave, enter 'm' and the tunnel number.");
        System.out.println("To toss a grenade into a cave, enter 't' and the tunnel number.");
        System.out.println();

        Scanner input = new Scanner(System.in);
        while (maze.stillAlive() && maze.stillWumpi()) {
            System.out.println(maze.showLocation());

            String command = input.next().trim().toLowerCase();
            char action = command.charAt(0);
            int target;
            try {
                target = Integer.parseInt(command.substring(1));
            }
            catch (java.lang.NumberFormatException e) {
                target = input.nextInt();
            }

            if (action == 't') {
                System.out.println(maze.toss(target));
            } else if (action == 'm') {
                System.out.println(maze.move(target));
            } else {
                System.out.println("Unrecognized command.");
            }
        }
        System.out.println("GAME OVER");
    }*/
  }
}

