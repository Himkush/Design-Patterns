package in.himkush;

public class VisitorTest {

    public static void main(String[] args) {

        TaxVisitor taxCalc  =  new TaxVisitor();

        TaxHolidayVisitor taxHolidayCalc =  new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liqour vodka = new Liqour(11.90);
        Tobacco cigar = new Tobacco(19.47);

        System.out.println(milk.accept(taxCalc) + '\n');
        System.out.println(vodka.accept(taxCalc) + '\n');
        System.out.println(cigar.accept(taxCalc) + '\n');

        System.out.println("\n Tax Holiday Prices");
        System.out.println(milk.accept(taxHolidayCalc) + '\n');
        System.out.println(vodka.accept(taxHolidayCalc) + '\n');
        System.out.println(cigar.accept(taxHolidayCalc) + '\n');





    }
}
