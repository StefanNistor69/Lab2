public class Visitor {
    private String Name;
    private String Surname;
    private int Age;
    private String Gender;
    private String Id;
    private String VisitReason;
    private int VisitTime;

    public void setName(String pName) {
        this.Name = pName;
    }

    public void setSurname(String pName) {
        this.Surname = pName;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getName() {
        return this.Name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public int getAge() {
        return this.Age;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getId() {
        return this.Id;
    }

    public void setVisitReason(String visitReason) {
        this.VisitReason = visitReason;
    }

    public String getVisitReason() {
        return this.VisitReason;
    }

    public void setVisitTime(int visitTime) {
        this.VisitTime = visitTime;
    }

    public int getVisitTime() {
        return this.VisitTime;
    }

    public Visitor(String Name, String Surname, int Age, int VisitTime, String VisitReason, String Gender, String Id) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.VisitTime = VisitTime;
        this.Gender = Gender;
        this.VisitReason = VisitReason;
        this.Id = Id;
    }

}
