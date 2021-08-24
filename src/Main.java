public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float Index = service.calcilate(48, 1.65f);
        System.out.println("Индекс массы тела:" + Index);
    }
}
