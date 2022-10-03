public class City {
    private String CityName;
    private String Country;

    public String getCityName(){
        return CityName;
    }
    public void setCityName(String Cname){
        this.CityName=Cname;
    }
    public String getCountry(){
        return Country;
    }
    public void setCountry(String country){
        this.Country=country;
    }
    public City(String CityName, String Country){
        this.CityName=CityName;
        this.Country=Country;
    }
}
