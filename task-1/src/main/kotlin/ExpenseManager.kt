class ExpenseManager {
    private val expenses = mutableListOf<Expense>() // Список расходов

    // Метод для добавления нового расхода
    fun addExpense(expense: Expense) {
        expenses.add(expense)
        println("Расход добавлен: ${expense.amount}, ${expense.category}, ${expense.date}")
    }

    // Метод для вывода всех расходов
    fun printAllExpenses() {
        if (expenses.isEmpty()) {
            println("Список расходов пуст.")
        } else {
            println("Список всех расходов:")
            expenses.forEach { it.printExpense() }
        }
    }

    // Метод для подсчета суммы всех расходов по категориям
    fun calculateTotalByCategory() {
        if (expenses.isEmpty()) {
            println("Нет данных для подсчета.")
            return
        }

        // Группировка расходов по категориям и подсчет суммы по каждой категории
        val totalByCategory = expenses.groupBy { it.category }
            .mapValues { entry -> entry.value.sumOf { it.amount } }

        println("Сумма расходов по категориям:")
        totalByCategory.forEach { (category, total) ->
            println("$category: $total")
        }
    }
}
