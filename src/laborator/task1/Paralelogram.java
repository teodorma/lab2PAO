package laborator.task1;

class Paralelogram extends Patrulater {
    public Paralelogram(int latura1, int latura2) {
        super(latura1,latura2,latura1,latura2);
    }

    public Double arie(int lat1, int lat2, double unghi1){

        return lat1 * lat2 * Math.sin(Math.toRadians(unghi1));
    }
}

