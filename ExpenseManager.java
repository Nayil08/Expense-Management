class ExpenseManager {
    private Expense[] expenses = new Expense[100];
    private int count = 0;

    public boolean addExpense(Expense e) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] == null) {
                expenses[i] = e;
                return true;
            }
        }
        return false;
    }

    public boolean removeExpense(Expense e) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] == e) {
                expenses[i] = null;
                return true;
            }
        }
        return false;
    }

    public Expense searchByDate(String date) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != null && expenses[i].getDate().equals(date)) {
                return expenses[i];
            }
        }
        return null;
    }

    public String showAllExpenses() {
        StringBuilder info = new StringBuilder();
        for (Expense e : expenses) {
            if (e != null) {
                info.append("Type: ").append(e.getExpenseType())
                        .append(", Description: ").append(e.getDescription())
                        .append(", Amount: ").append(e.getAmount())
                        .append(", Date: ").append(e.getDate())
                        .append("\n");
            }
        }
        return info.toString();
    }
}

class ExpenseManager {
    private Expense[] expenses = new Expense[100];
    private int count = 0;

    public boolean addExpense(Expense e) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] == null) {
                expenses[i] = e;
                return true;
            }
        }
        return false;
    }

    public boolean removeExpense(Expense e) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] == e) {
                expenses[i] = null;
                return true;
            }
        }
        return false;
    }

    public Expense searchByDate(String date) {
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != null && expenses[i].getDate().equals(date)) {
                return expenses[i];
            }
        }
        return null;
    }

    public String showAllExpenses() {
		String Info;
        for (Expense e : expenses) {
            if (e != null) {
               Info;
            }
        }
    }
}
