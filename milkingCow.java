public class Cow{
    private String soundCow;
    private String nameCat;
    private int milkCnt;
    public Cow(String name,String sound){
        nameCow=name;
        soundCow=sound;
        milkCnt=1;
    }
    public String getType(){
        return nameCow;
    }
    public String getSound(){
        return soundCow;
    }
    public void milkCow(){
        milkCnt++;
    }
    public int getNumMilking(){
        return milkCnt;
    }
}
