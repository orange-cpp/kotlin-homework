import java.time.LocalDate

// Класс, представляющий отдельный расход
class Expense(
    val amount: Double,           // Сумма расхода
    val category: String,         // Категория расхода
    val date: LocalDate           // Дата расхода
) {
    // Метод для вывода информации о расходе
    fun printExpense() {
        println("Сумма: $amount, Категория: $category, Дата: $date")
    }
}
