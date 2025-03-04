public class erm {
    import java.util.ArrayList;

    public class AnimalTest {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.makeNoise();
            cat.eat();

            Dog dog = new Dog();
            dog.makeNoise();

            ArrayList<Animal> list = new ArrayList<>();
            list.add(cat);
            list.add(dog);
            Animal a1 = new Cat(); // Cat is an animal,
            a1.makeNoise();

            Animal d1 = new Dog();
            //d1.growl(); // cannot call growl()
            ((Dog)d1).growl();

        }
    }
    public class Employee {
        private String name;
        private String id;

        public Employee(String name, String id)
        {
            this.name = name;
            this.id = id;
        }

        public String toString()
        {
            return "Name: "+ name + ", ID: "+ id;
        }
    }

    Jessi Luo to Everyone (Mar 3, 2025, 8:59 PM)
    public class Student extends Employee{
        private double gpa;
        public Student(String name, String id, double gpa)
        {
            super(name, id); //super is calling the constructor of the super class
            this.gpa = gpa;
        }
        public String toString()
        {
            return super.toString() + ", gpa: "+ gpa;
        }
    }public class Employee {
        private String name;
        private String id;
        public int grade;

        public Employee()
        {
            System.out.println("Employee const");
        }
        public Employee(String name, String id)
        {
            this.name = name;
            this.id = id;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String toString()
        {
            return "Name: "+ name + ", ID: "+ id;
        }
    }public class Student extends Employee{
        private double gpa;
        public Student() //default constructor of subclass will always call the constructor of super class
        {
            System.out.println("Student const");
        }
        public Student(String name, String id, double gpa)
        {
            super(name, id); //super is calling the constructor of the super class
            this.gpa = gpa;
        }
        public void setGpa(double gpa)
        {
            this.gpa = gpa;
        }
        public String toString()
        {
            return super.toString() + ", gpa: "+ gpa;
        }
    }
    public class EmployeeTest {
        public static void main(String[] args) {
            Student stu= new Student("Kevin","0001", 3.6);
            System.out.println(stu.toString());
            Student s2 = new Student();
            //super const is called first, then subclass const
            s2.setName("Amy");
            s2.grade = 11;
            //inheritance: public methods in super class are inherited to the subclass
            //inheritance: public fields in super class are inherited to the subclass
            //but constructors are not inherited

            Employee e =new Employee();
            //e.setGpa(); // cannot call subclass methods
            Employee e2 = new Student();
            e2.setName("Cathy");
            ((Student)e2).setGpa(4.2); //convert to Student, then call subclass method

        }
    }
}
