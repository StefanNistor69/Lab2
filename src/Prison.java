public class Prison {
    private String PrisonName;
    private String PrisonAddress;
    private int Capacity;
    private String BuiltDate;
    private String Wings;
    private boolean Availability;

    public Prison() {

    }

    public void setPrisonName(String prisonName){
        this.PrisonName= prisonName;
    }
    public String getPrisonName(){
        return this.PrisonName;
    }
    public void setPrisonAddress(String prisonAddress){
        this.PrisonAddress= prisonAddress;
    }
    public String getPrisonAddress(){
        return this.PrisonAddress;
    }
    public void setBuiltDate(String builtDate){
        this.BuiltDate= builtDate;
    }
    public String getBuiltDate(){
        return this.BuiltDate;
    }
    public void setWings(String wings){
        this.Wings= wings;
    }
    public String getWings(){
        return this.Wings;
    }
    public void setCapacity(int capacity){
        this.Capacity= capacity;
    }
    public int getCapacity(){
        return this.Capacity;
    }
    public void setAvailability(boolean availability){
        this.Availability= availability;
    }
    public boolean getAvailability(){
        return this.Availability;
    }
    public Prison(String PrisonName,String PrisonAddress,int Capacity,String BuiltDate,String Wings,boolean Availability){
        this.PrisonName=PrisonName;
        this.PrisonAddress=PrisonAddress;
        this.BuiltDate=BuiltDate;
        this.Wings=Wings;
        this.Availability=Availability;
        this.Capacity=Capacity;




    }



}
