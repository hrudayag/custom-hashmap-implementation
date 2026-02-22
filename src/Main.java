public class Main {
    public static void main(String[] args) {

        CustomHashMap<Student, String> map = new CustomHashMap<>();

        Student s1 = new Student(1, "Hrudaya");
        Student s2 = new Student(1, "Hrudaya");
        Student s3 = new Student(2, "Riya");

        map.put(s1, "Engineer");
        map.put(s3, "Doctor");

        System.out.println(map.get(s2));
        System.out.println("Size: " + map.size());
    }
}