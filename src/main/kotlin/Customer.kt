data class Customer(val id: String, val name: String)
{
    init {
        require(id.isNotEmpty()) {"Please enter customer id"}
    }
}
enum class CardType {
    VISA,
    MASTERCARD,
    AMERICAN_EXPRESS
}

enum class PaymentMethod(val cardType: CardType?) {
    CREDIT_CARD(CardType.VISA),
    DEBIT_CARD(CardType.MASTERCARD),
    CASH(null)
}