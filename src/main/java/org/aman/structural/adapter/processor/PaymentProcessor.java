package org.aman.structural.adapter.processor;

public interface PaymentProcessor {
      void processPayment(double amount, String currency);
      boolean isPaymentSuccessful();
      String getTransactionId();
}
