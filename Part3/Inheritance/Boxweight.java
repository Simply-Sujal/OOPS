package Part3.Inheritance;

public class Boxweight extends Box{
    int weight;

    public Boxweight(){
        this.weight = -1;
    }

    public Boxweight(Boxweight other){
        super(other);
        this.weight = other.weight;
    }

    Boxweight(int side , int weight){
        super(side);
        this.weight = weight;
    }

    public Boxweight(int l , int h , int w , int weight){
        super(l,h,w); // call the parent class constructor
        // used to initialise value present in parent class 
        this.weight = weight;
    }
}
