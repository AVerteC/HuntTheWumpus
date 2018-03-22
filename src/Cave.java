public class Cave {
    private String mname;
    //private String num;
    private int mid;
    private int mnum2;
    private int mnum3;
    private int mnum4;
    private int mcontent;
    private boolean misVisited = false;
    //constructor

    public Cave(String name, int id, int num2, int num3, int num4, int content) {
        mname = name;
        mid = id;
        mnum2 = num2;
        mnum3 = num3;
        mnum4 = num4;
        mcontent = content;

    }

    public enum CaveContents {
        EMPTY, WUMPUS, BATS, PIT
    }
    public void setContent(int content) {
        mcontent = content;
    }

    public int getContent(){
        return mcontent;
    }

    public void markAsVisited(){
        misVisited = true;
    }

    public String getCaveName(){
        return mname;
    }

    public boolean hasBeenVisited(){
        return misVisited;
    }

    public int getAdjNumber(int tunnel){
        int result = 0;
        if (tunnel == 1){
        result = mnum2;
        }
        else if (tunnel == 2){
        result = mnum3;
        }
        else if (tunnel == 3){
        result = mnum4;
        }
    return result;
    }



}