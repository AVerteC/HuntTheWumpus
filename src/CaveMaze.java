import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.Random;



public class CaveMaze {
    private Cave currentCave;
    private Cave[] caves;
    //private Die d;
    private int numGrenades;
    private int numWumpi;


    /**
     * Enumeration class CaveContents - the possible contents of a "Hunt the Wumpus" cave.
     *   @author Dave Reed
     *   @version 4/1/13
     */

    public enum CaveContents {
        EMPTY, WUMPUS, BATS, PIT
    }


    /**
     * Constructs a CaveMaze from the data found in a file.  Initially, there is 1 pit, 1 swarm of bats, and
     * between 1 and 3 wumpi randomly placed in the maze.  The player starts out in the cave numbered 0 with
     * four times as many grenades as there are wumpi.
     *   @param filename the name of the cave data file
     */
    public CaveMaze(String filename) throws java.io.FileNotFoundException {
        Scanner infile = new Scanner(new File(filename));

        int numCaves = infile.nextInt();
        this.caves = new Cave[numCaves];

        Random rand = new Random();
        //1 to 5 wumpi
        this.numWumpi = rand.nextInt(20 / 4) + 1;
        //wumpi * 4 = grenades
        this.numGrenades = this.numWumpi * 4;

        for (int i = 0; i < numCaves; i++) {
            int id = infile.nextInt();
            int num2 = infile.nextInt();
            int num3 = infile.nextInt();
            int num4 = infile.nextInt();
            // 0 is none, 1 is wumpus, 2 is bats, 3 is pits
            int content = infile.nextInt();
            String name = infile.nextLine().trim();
            this.caves[id] = new Cave(name, id, num2, num3, num4, content);
        }

        this.currentCave = this.caves[0];
        stContent(numWumpi, 1);
        stContent(1,2);
        stContent(1, 3);
        this.currentCave.markAsVisited();
        System.out.println(Arrays.toString(this.caves));
    }

        //0 = nothing, 1 = wumpus, 2 = bats, 3 = pit
        //only one type of content per cave
        //only 1 bat cave
        //only 1 pit
    private void stContent(int amount, int contentNumber){
        Random rand = new Random();
            for (int j = 0; j < amount; j++) {
                int numCave = rand.nextInt(18)+1;
                if (this.caves[numCave].getContent() == 0){
                this.caves[numCave].setContent(contentNumber);
                }
            }
    }

    /**
     * Moves the player from the current cave along the specified tunnel.  The new location must be marked
     * as visited and he appropriate action taken if the new location is not empty. <br>
     * Note: if the tunnel # is not 1-3, then an error message should be returned.
     *   @param tunnel the number of the tunnel to be traversed (1-3)
     *   @return a status message describing the result of the move attempt
     */
    public String move(int tunnel) {
        this.currentCave = this.caves[this.currentCave.getAdjNumber(tunnel)];
        this.currentCave.markAsVisited();
        return "ok";
    }

    /**
     * Tosses a grenade (if the player has any) through the specified tunnel.  If there is a wumpus
     * in the corresponding cave, it is killed.  However, any remaining wumpi adjacent to the player are
     * alerted by the explosion and may move as a result. <br>
     * Note: if the tunnel # is not 1-3, then an error message should be returned.
     *   @param tunnel the number of the tunnel to be bombed (1-3)
     *   @return a status message describing the result of the toss attempt
     */
    public String toss(int tunnel) {
        return "not implemented.";
    }

    /**
     * Returns the current cave name and the names of adjacent caves (if those caves have been visited).
     * Caves that have not yet been visited are identified as "unknown".  Also, warning messages are
     * included if the player is adjacent to a wumpi, bats, or a pit.
     *   @return a message containing the location information and warnings
     */
    public String showLocation() {
        String message = "You are currently in " + this.currentCave.getCaveName();
        for (int i = 1; i <= 3; i++) {
            Cave adjCave = this.caves[this.currentCave.getAdjNumber(i)];
            if (adjCave.hasBeenVisited()) {
                message += "\n    (" + i + ") " + adjCave.getCaveName();
            }
            else {
                message += "\n    (" + i + ") unknown";
            }
        }
        return message;
    }
    

    /**
     * Reports whether the player is still alive.
     *   @return true if alive, false otherwise
     */
    public boolean stillAlive() {
        return true;
    }

    /**
     * Reports whether there are any wumpi remaining.
     *   @return true if wumpi remaining in the maze, false otherwise
     */
    public boolean stillWumpi() {
        return true;
    }



    public static void main (String[]args) throws java.io.FileNotFoundException{
        CaveMaze maze = new CaveMaze("cavesdata.dat");

    }
}


