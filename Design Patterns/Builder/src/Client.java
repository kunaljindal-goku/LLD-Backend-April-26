import java.awt.image.BufferedImageOp;

public class Client {

    public static void main(String[] args) {

//        Map<String, Object> map = new HashMap<>();
//        map.put("name","Virat");
//        map.put("psp","kajff");
//
//        Student s = new Student(map);
        Builder builder = Student.getBuilder()
                .setName("Virat")
                .setGradYear(2023)
                .setMobNo(32894938);

        Student s = new Student(builder);


    }
}
