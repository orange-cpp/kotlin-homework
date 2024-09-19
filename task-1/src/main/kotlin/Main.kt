import java.time.LocalDate


fun main() {
    // Создание менеджера расходов
    val expenseManager = ExpenseManager()

    // Создание расходов
    val expense1 = Expense(150.0, "Продукты", LocalDate.of(2024, 9, 18))
    val expense2 = Expense(50.0, "Транспорт", LocalDate.of(2024, 9, 19))
    val expense3 = Expense(200.0, "Развлечения", LocalDate.of(2024, 9, 20))
    val expense4 = Expense(75.0, "Продукты", LocalDate.of(2024, 9, 21))

    // Добавление расходов в менеджер
    expenseManager.addExpense(expense1)
    expenseManager.addExpense(expense2)
    expenseManager.addExpense(expense3)
    expenseManager.addExpense(expense4)

    // Вывод всех расходов
    expenseManager.printAllExpenses()

    // Подсчет суммы расходов по категориям
    expenseManager.calculateTotalByCategory()
}
