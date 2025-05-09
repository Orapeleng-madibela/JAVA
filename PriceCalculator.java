import java.util.*;

public class PriceCalculator{
    public static void main(String[] args){

        int quantity = 3;
        double itemPrice = 4.5;
        double totalPrice = quantity*itemPrice;

        System.out.println("Total price is R " + totalPrice);

        // find VAT(15%) from the total price above, add VAT  to total price, VAT rate is 15%
        double vat = totalPrice/100*15;
        double PriceIncludingVAT = totalPrice + vat;

        System.out.println("The VAT rate it is 15%");
        System.out.println("VAT price : R " + vat);
        System.out.println("Price including VAT is R " + PriceIncludingVAT);

    }
};