public class Forma implements Comparable<Forma> {

    private double area;

    public Forma(double area){
        this.area = area;
    }

    public double obterArea(){
        return area;
    }
    @Override
    public int compareTo(Forma outra){
        if (this.area > outra.area){
            return 1;
        }
        if (this.area < outra.area){
            return -1;
        }
        else {return 0;}
    }

} 
