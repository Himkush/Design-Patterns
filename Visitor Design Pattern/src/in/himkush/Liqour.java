package in.himkush;

public class Liqour implements Visitable{

    private  double price;

    public Liqour(double item){
        price  =  item;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return   visitor.visit(this);
    }
}
