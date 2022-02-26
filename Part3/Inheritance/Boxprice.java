package Part3.Inheritance;

public class Boxprice extends Boxweight{
    int cost;

    Boxprice(){
        super();
        this.cost = -1;
    }

    Boxprice(Boxprice other){
        super(other);
        this.cost = other.cost;
    }

    public Boxprice(int l,int h,int w,int weight,int cost){
        super(l,w,h,weight);
        this.cost = cost;
    }

    public Boxprice(int side,int weight,int cost){
        super(side,weight);
        this.cost = cost;
    }
}
