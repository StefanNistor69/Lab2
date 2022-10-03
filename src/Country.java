public class Country {
    private String CountryName;

    public String getCountryName(){
        return this.CountryName;
    }
    public void SetCountryName(String cName){
        this.CountryName= cName;
    }


    public Country(String CountryName){
        this.CountryName=CountryName;
    }
}
