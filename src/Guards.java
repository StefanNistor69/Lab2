public class Guards {
    private String Name;
    private String Surname;
    private int Age;
    private String Address;
    private String Gender;
    private String Id;
    private String Wing;
    private double Salary;

    public void setName(String pName){
        this.Name= pName;
    }

    public void setSurname(String pName){
        this.Surname = pName;
    }
    public void setAge(int age){
        this.Age = age;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    public void setGender(String gender){
        this.Gender = gender;
    }
    public String getName(){
        return this.Name;
    }
    public String getSurname(){
        return this.Surname;
    }
    public int getAge(){
        return this.Age;
    }
    public String getGender(){
        return this.Gender;
    }
    public String getAddress(){
        return this.Address;
    }
    public void setId(String id){
        this.Id= id;
    }
    public String getId(){
        return this.Id;
    }
    public void setWing(String wing){
        this.Wing= wing;
    }
    public String getWing(){
        return this.Wing;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }
    public double getSalary(){
        return this.Salary;

    }
    public Guards(String Name, String Surname,int Age,double Salary,String Address,String Gender,String Id,String Wing){
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Address=Address;
        this.Gender=Gender;
        this.Salary=Salary;
        this.Id= Id;
        this.Wing=Wing;
    }
    public Guards(){
        this.Name = null;
        this.Surname = null;
        this.Age = 0;
        this.Address=null;
        this.Gender=null;
        this.Salary=0;
        this.Id= null;
        this.Wing=null;
    }
}
