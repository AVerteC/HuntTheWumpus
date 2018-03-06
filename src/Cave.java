public class Cave {
    private String name;
    private String num;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private boolean isVisited = false;
    //constructor

    public Cave(String name, int num1, int num2, int num3, int num4) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
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
        if (tunnel == 1){
        result = this.num2;
        }
        else if (tunnel == 2){
        result = this.num3;
        }
        else if (tunnel == 3){
        result = this.num4;
        }
    return result;
    }


}