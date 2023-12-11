class CustomerRepository {
    private val customers: MutableMap<String, Customer> = mutableMapOf()

    fun addCustomer(customer: Customer) {
        customers[customer.id] = customer
    }

    fun getCustomerById(id: String): Customer? {
        return customers[id]
    }

    // Другие методы для работы с покупателями
}

class CustomerFactory {
    fun createCustomer(id: String, name: String): Customer {
        return Customer(id, name)
    }
}