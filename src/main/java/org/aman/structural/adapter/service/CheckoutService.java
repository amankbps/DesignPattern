package org.aman.structural.adapter.service;

import org.aman.structural.adapter.processor.PaymentProcessor;

public class CheckoutService {

    private PaymentProcessor paymentProcessor;
    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount,String currency)
    {
        System.out.println("Checkout Service is attempting to process payment request "+
                amount+" "+currency);
        paymentProcessor.processPayment(amount,currency);
        if(paymentProcessor.isPaymentSuccessful()){
            System.out.println("Payment successful "+paymentProcessor.getTransactionId());
        }else{
            System.out.println("Payment failed ");
        }
    }
}
