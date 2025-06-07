package org.aman.structural.adapter.processor;

public class LegacyGateWayAdapter implements PaymentProcessor{

     private final LegacyGateWay legacyGateWay;
     private long currentRef;
     public LegacyGateWayAdapter(LegacyGateWay legacyGateWay) {
         this.legacyGateWay = legacyGateWay;
     }
    @Override
    public void processPayment(double amount, String currency) {

        System.out.println("Adapter: Translating processPayment() for "+amount+" "+currency);
        legacyGateWay.executeTransaction(amount,currency);
        currentRef=legacyGateWay.getReferenceNumber();


    }

    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateWay.checkStatus(currentRef);
    }

    @Override
    public String getTransactionId() {
        return "LEGACY_TXN_"+currentRef;
    }
}
