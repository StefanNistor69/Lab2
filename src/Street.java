public class Street {

    private String StreetName;
    private String Number;
    private String City;
    private String Country_name;

    public String getStreetName(){
        return StreetName;
    }
    public void setStreetName(String street){
        this.StreetName=street;
    }
    public String getNumber(){
        return Number;
    }
    public void setNumber(String num){
        this.Number=num;
    }
    public String City(){
        return City;
    }
    public void setCity(String city){
        this.City=city;
    }
    public String getCountry_name(){
        return Country_name;
    }
    public void setCountry(String country){
        this.Country_name=country;
    }

    public Street(String StreetName,String Number,String City,String CountryName){

        this.StreetName=StreetName;
        this.Number=Number;
        this.City=City;
        this.Country_name=CountryName;
    }

}
