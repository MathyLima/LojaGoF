package PaymentStrategys.Strategys;
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void colectPaymentDetails();
    
} 
