class TransportExpense extends Expense {
    private String transportMode;

    public TransportExpense(String description, double amount, String date, String transportMode) {
        super(description, amount, date);
        this.transportMode = transportMode;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @Override
    public String getExpenseType() {
        return "Transport - " + transportMode;
    }
}