public class Cave {
    private String name;
    private int id;
    private int num2;
    private int num3;
    private int num4;
    private int content;
    private boolean isVisited = false;

    /** constructor */
    public Cave(String name, int id, int num2, int num3, int num4, int content) {
        this.name = name;
        this.id = id;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.content = content;
    }

    public void markAsVisited(){
        this.isVisited = true;
    }

    public String getCaveName(){
        return this.name;
    }

    public boolean hasBeenVisited(){
        return this.isVisited;
    }

    public int getAdjNumber(int tunnel){
        int result = 0;
        switch (tunnel) {
            case 1: return this.num2;
            case 2: return this.num3;
            case 3: return this.num4;
            default: throw new IllegalArgumentException("tunnel must be 1, 2, or 3. It was " + tunnel);
        }
    }
}