public class Cow{
    private String soundCow;
    private String nameCow;
    private int milkCnt;
    public Cow(String name,String sound){
        nameCow=name;
        soundCow=sound;
        milkCnt=-1;
    }
    public String getSound(){
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
