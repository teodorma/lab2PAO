package laborator.task1;

class Dreptunghi extends Paralelogram {
    public Dreptunghi(int latura1, int latura2){
        super(latura1, latura2);
    }
    public Double arie(int latura1, int latura2){
        return (double) (latura2 * latura1);
    }
}