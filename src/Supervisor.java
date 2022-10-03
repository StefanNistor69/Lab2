public class Supervisor {
    private String Name;
    private String Surname;
    private int Age;
    private String Gender;
    private String Address;
    private String Id;

    private String Block;

    private String Record;

    public void setName(String pName) {
        this.Name = pName;
    }

    public void setSurname(String pName) {
        this.Surname = pName;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setAddress(String address) {
        this.Address = address;
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

    public String getAddress() {
        return this.Address;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getId() {
        return this.Id;
    }

    public void setBlock(String block) {
        this.Block = block;
    }

    public String getBlock() {
        return this.Block;
    }

    public void setRecord(String record) {
        this.Record = record;
    }

    public String getRecord() {
        return this.Record;
    }

    public Supervisor(String Name, String Surname, int Age, String Block, String Address, String Gender, String Id, String Record) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Address = Address;
        this.Gender = Gender;
        this.Block = Block;
        this.Id = Id;
        this.Record = Record;

    }
}
