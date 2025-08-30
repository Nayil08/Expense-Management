class FoodExpense extends Expense {
    private String mealType;

    public FoodExpense(String description, double amount, String date, String mealType) {
        super(description, amount, date);
        this.mealType = mealType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public String getExpenseType() {
        return "Food " + mealType;
    }
}
