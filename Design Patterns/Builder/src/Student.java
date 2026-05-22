public class Student {

    private String name;
    private double psp;
    private String batch;
    private int gradYear;
    private int mobNo;
    private String email;

//    public Student(String name,
//                   double psp,
//                   String batch,
//                   int gradYear,
//                   int mobNo) {
//        if(gradYear < 2022) {
//            throw new RuntimeException("Grad year should be greate than 2022");
//        }
//        // val 2
//        // val 3
//    }

//    public Student(Map<String, Object> map) {
//        this.name = (String)map.get("name");
//        this.psp = (Double) map.get("psp");
//    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Student(Builder builder) {
        if(builder.getGradYear() < 2022) {
            throw  new RuntimeException();
        }
        this.name = builder.getName();
        this.psp = builder.getPsp();
    }
}
