import java.util.Scanner;
import java.io.File;



public class CaveMaze {
    private Cave currentCave;
    private Cave[] caves;
    //private Die d;


    public CaveMaze(String filename) throws java.io.FileNotFoundException {
        Scanner infile = new Scanner(new File(filename));
        int numCaves = infile.nextInt();
        this.caves = new Cave[numCaves];
        for (int i = 0; i < numCaves; i++) {
            int num1 = infile.nextInt();
            int num2 = infile.nextInt();
            int num3 = infile.nextInt();
            int num4 = infile.nextInt();
            String name = infile.nextLine().trim();
            this.caves[num1] = new Cave(name, num1, num2, num3, num4);
            System.out.println(this.caves[num1]);
        }


    }
    public static void main (String[]args){
        CaveMaze maze = new CaveMaze("cavesdata.dat");

    }
}