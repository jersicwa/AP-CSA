public class Student {
    //ID, name, GPA
    private String ID;
    private String name;
    private double GPA;
    public Student(String ID, String name, double GPA)
    {
        this.ID= ID;
        this.name =name;
        this.GPA = GPA;
    }
    public void setID(String ID){
        this.ID= ID;
    }
    public void setName(String name)
    {
        this.name =name;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    public String getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public double getGPA()
    {
        return GPA;
    }
    public void increaseGPA()
    {
        GPA = GPA +0.1;
    }
    public void decreaseGPA()
    {
        GPA = GPA-0.1;
    }
    //method: increase GPA 0.1
    //method: decrease GPA 0.1
}
public static void main(String[] args) {
    Student s1 = new Student("001","Kevin",3.6);
    s1.increaseGPA();
    System.out.println(s1.getGPA());

}
