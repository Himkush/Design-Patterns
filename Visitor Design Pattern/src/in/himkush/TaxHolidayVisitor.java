package in.himkush;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {


    DecimalFormat df  =  new DecimalFormat("#.##");

    public TaxHolidayVisitor(){

    }

    @Override
    public double visit(Liqour liqourItem) {
        System.out.println("Liqour Item: Price with Tax");
        return Double.parseDouble(df.format((liqourItem.getPrice()*0.10) + liqourItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice()*0.30) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format((necessityItem.getPrice()*0.0) + necessityItem.getPrice()));
    }

}
