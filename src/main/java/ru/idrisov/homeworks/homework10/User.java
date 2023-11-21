package ru.idrisov.homeworks.homework10;

public class User {

    private String FirstName;
    private String UserName;
    private String SurName;
    private int Age;
    private String Email;

    final public int size = 5;

    public User (String FirstName, String UserName, String SurName, int Age, String Email){
        this.FirstName = FirstName;
        this.UserName = UserName;
        this.SurName = SurName;
        this.Age = Age;
        this.Email = Email;
    }
 public void info(){
     System.out.println("ФИО: " + FirstName + " " + UserName + " " + SurName);
     System.out.println("Год рождения: " + Age);
     System.out.println("E-mail: " + Email);
 }

    public String getFirstName() {
        return FirstName;
    }

    public String getUserName() {
        return UserName;
    }
    public String getSurName() {
        return SurName;
    }

    public int getAges() {
        return Age;
    }

    public void setUsers(String FirstName, String UserName,String SurName, int Age){
        this.FirstName = FirstName;
        this.UserName = UserName;
        this.SurName = SurName;
        this.Age = Age;
    }

}
