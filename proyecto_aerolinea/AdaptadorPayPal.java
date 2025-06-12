public class AdaptadorPayPal implements PasarelaPago {
    private PayPal paypal = new PayPal();

    @Override
    public void realizarPago(double monto) {
        paypal.pagar(monto);
    }
}