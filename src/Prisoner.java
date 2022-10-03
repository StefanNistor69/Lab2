public class Prisoner {
    private String Name;
    private String Surname;
    private int Age;
    private String Gender;
    private String Address;
    private String Id;
    private String Sentence;
    private String SentencePeriod;

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

    public void setSentence(String sentence) {
        this.Sentence = sentence;
    }

    public String getSentence() {
        return this.Sentence;
    }

    public void setSentencePeriod(String sentencePeriod) {
        this.SentencePeriod = sentencePeriod;
    }

    public String getSentencePeriod() {
        return this.SentencePeriod;
    }

    public Prisoner(String Name, String Surname, int Age, String Sentence, String Address, String Gender, String Id, String SentencePeriod) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Address = Address;
        this.Gender = Gender;
        this.Sentence = Sentence;
        this.SentencePeriod = SentencePeriod;
        this.Id = Id;


    }
}
