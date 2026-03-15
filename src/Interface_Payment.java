interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment by Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment by UPIPayment");
    }
}
class Cash implements Payment {
    public void pay() {
        System.out.println("Payment by Cash");
    }
}

void main(String[] args) {
    Payment a = new CreditCardPayment();
    a.pay();

    Payment b = new UPIPayment();
    b.pay();

    Payment c = new Cash();
    c.pay();
}