data class Product(val id: String, val name: String, val price: Double)
{
    init {
        require(id.isNotEmpty()) {"Please enter product id"}
    }
}
data class Address(val street: String, val city: String, val country: String)
{
    init {
        require(street.isNotEmpty()) {"Please enter street"}
        require(city.isNotEmpty()) {"Please enter city"}
        require(country.isNotEmpty()) {"Please enter country"}

    }
}
data class Order(val id: String, val customer: Customer, var status: OrderStatus, val products: List<Product>, val address: Address)
{
    init {
        require(id.isNotEmpty()) {"Please enter order id"}
        require(products.isNotEmpty()) {"Please enter products"}
    }
}
enum class OrderStatus {
    CREATED,
    PROCESSING,
    COMPLETED,
    CANCELLED
}