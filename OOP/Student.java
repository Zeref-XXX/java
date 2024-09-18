
class stu {

    public int marks1, marks2, marks3;
    public String name;
    public String course;
    public int roll;

    public int total() {
        return marks1 + marks2 + marks3;
    }

    public double average() {
        return (marks1 + marks2 + marks3) / 3;
    }

    public String grade() {
        double a = average();
        if (a > 70) {
            return "A"; 
        }else if (a > 60 && a < 70) {
            return "B"; 
        }else {
            return "c";
        }
    }
}

public class Student {

    public static void main(String[] args) {
        stu s1 = new stu();
        s1.marks1 = 1;
        s1.marks2 = 2;
        s1.marks3 = 3;
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
    }
}
