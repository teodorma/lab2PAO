package laborator.task1;

public class Main {
    public static void main(String[] args) {
        Paralelogram p = new Paralelogram(2,3);
        System.out.println(p.arie(2,3,90.00000));

        Romb r = new Romb(4, 6);
        System.out.println(r.arie());

        Patrat patr = new Patrat(5);
        System.out.println(patr.arie(5));
    }
}