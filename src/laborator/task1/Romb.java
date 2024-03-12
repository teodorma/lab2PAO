package laborator.task1;

class Romb extends Paralelogram {
    private int diag1;
    private int diag2;

    public Romb(int d1, int d2) {
        super((int) (d1 / Math.sqrt(2)), (int) (d2 / Math.sqrt(2)));
        this.diag1 = d1;
        this.diag2 = d2;
    }

    public Double arie() {
        return (double) (diag1 * diag2 / 2);
    }
}