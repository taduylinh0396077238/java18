public class TestTeacher {
    public static void main(String[] args) {
        Teacher mon = new Teacher("Duy Linh", "Java");
        System.out.println(mon);
        System.out.println(mon.addCourse("Linh"));
        System.out.println(mon.removeCourse("Java"));
    }
}
