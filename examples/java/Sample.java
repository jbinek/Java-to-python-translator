public class Sample {

    void test() {
        int first = 8;
        int second = 9;
        int sum = 0;
        for (int i = 0; i < first; i++) {
            sum += second;
        }
        String var = "value";
        if(var != null) {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new Sample().test();
    }
}
