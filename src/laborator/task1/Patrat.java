package laborator.task1;

import laborator.task1.Dreptunghi;

class Patrat extends Dreptunghi {
    public Patrat(int latura1){

        super(latura1, latura1);
    }
    public Double arie(int lat1){

        return (double) (lat1 * lat1);
    }
}