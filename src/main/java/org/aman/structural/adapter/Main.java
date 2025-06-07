package org.aman.structural.adapter;

import org.aman.structural.adapter.processor.InHousePaymentProcessor;
import org.aman.structural.adapter.processor.LegacyGateWay;
import org.aman.structural.adapter.processor.LegacyGateWayAdapter;
import org.aman.structural.adapter.processor.PaymentProcessor;
import org.aman.structural.adapter.service.CheckoutService;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new InHousePaymentProcessor();
        CheckoutService checkoutService=new CheckoutService(paymentProcessor);
        checkoutService.checkout(200,"USD");

        //Legacy gateway through adapter
        System.out.println("\n-- using Legacy Gateway via Adapter ---");
        LegacyGateWay legacyGateWay=new LegacyGateWay();
        paymentProcessor=new LegacyGateWayAdapter(legacyGateWay);
        CheckoutService checkoutService1=new CheckoutService(paymentProcessor);
        checkoutService1.checkout(500,"USD");
    }
}
