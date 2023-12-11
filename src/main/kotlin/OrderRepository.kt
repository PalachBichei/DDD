class OrderRepository {
    private val orders: MutableMap<String, Order> = mutableMapOf()

    fun addOrder(order: Order) {
        orders[order.id] = order
    }

    fun getOrderById(id: String): Order? {
        return orders[id]
    }

    // Другие методы для работы с заказами
}

class OrderFactory {
    fun createOrder(id: String, customer: Customer, products: List<Product>, address: Address): Order {
        require(products.isNotEmpty()) { "Order must contain at least one product." }
        return Order(id, customer, OrderStatus.CREATED, products, address)
    }
}