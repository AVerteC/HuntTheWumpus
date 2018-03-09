# HuntTheWumpus
hunt the wumpus in java.




February 28 post
More WUMPUS help, but you are not bound to use any of these resources. Feel free to write the program as you wish.
http://dave-reed.com/csc222.S13/HW/HW5.html

February 26 post
This MIGHT Help read the cave Data

public CaveMaze() throws java.io.FileNotFoundException {
Scanner infile = new Scanner(new File("caves.dat"));

int numCaves = infile.nextInt();
caves = new cave[numCaves];

for (int i = 0; i < numCaves; i++) {
int num1 = infile.nextInt();
int num2 = infile.nextInt();
int num3 = infile.nextInt();
int num4 = infile.nextInt();
String name = infile.nextLine().trim();

// then create a new cave with that data num1 is the cave number and num2-4 are the adjacent rooms




February 26 post
Hunt the Wumpus
Please complete the necessary methods and constructors to run the game. You can play the Graphical version (download the folder below and run the .exe) to get an idea how the game is played. Your program only needs to be a text game not graphical. See the JAVA WUMPUS.pdf

