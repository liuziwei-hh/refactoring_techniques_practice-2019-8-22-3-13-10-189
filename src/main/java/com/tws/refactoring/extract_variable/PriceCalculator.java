package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
    	double beforeTotal=quantity*itemPrice;
    	double lessQuantity=500;
    	double discountRate=0.05;
    	double shippingCostRate=0.01;
    	double maxShippingRate=100.0;
    	double discount=Math.max(0, quantity - lessQuantity) * itemPrice * discountRate;
    	double shippingCost=Math.min(quantity * itemPrice *shippingCostRate, maxShippingRate);
    	double result=beforeTotal-discount +shippingCost;
        return result;
    }
}
