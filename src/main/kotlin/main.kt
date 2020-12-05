fun main() {
    val amount = 1000000
    val commissionPercent = 0.75 / 100
    val minCommission = 3500
    val commissionValue = if (amount * commissionPercent < minCommission) minCommission
                            else amount * commissionPercent

    println("Total commission: $commissionValue")
}