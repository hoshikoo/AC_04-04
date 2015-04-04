package nyc.c4q.hoshikoo;
/**
 * Created by Hoshiko on 4/4/15.
 */
public class Student {
    private String name;
    private int numOfPencilsInPocket;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getNumOfPencilsInPocket(){
        return numOfPencilsInPocket;
    }
    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }
    public void setLunchBox(lunchbox item){
        //FIXME
    }
}