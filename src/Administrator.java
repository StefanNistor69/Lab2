

public class Administrator {
    private String Name;
    private String Surname;
    private int Age;
    private String Login_ID;
    private String password;
    private double Salary;
    private String Address;
    private String Gender;

    public void setName(String pName){
        this.Name= pName;
    }

    public void setSurname(String pName){
        this.Surname = pName;
    }
    public void setAge(int age){
        this.Age = age;
    }

    public void setSalary(double pV){
        this.Salary = pV;
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
    public double getSalary(){
        return this.Salary;

    }
    public String getAddress(){
        return this.Address;
    }
    public void setLogin_ID(String login){
        this.Login_ID= login;
    }
    public String getLogin_ID(){
        return this.Login_ID;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return this.password;
    }

    public Administrator(String Name, String Surname,int Age,double Salary,String Address,String Gender,String Login_ID,String password){
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Address=Address;
        this.Gender=Gender;
        this.Salary=Salary;
        this.Login_ID=Login_ID;
        this.password=password;
    }



}
