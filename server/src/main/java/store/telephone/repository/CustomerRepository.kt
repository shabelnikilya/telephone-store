package store.telephone.repository

interface CustomerRepository {

    // todo добавить Customer

    fun saveCustomer(): Long

    fun findCustomerById(id: Long)

    fun findAllCustomers()

    fun removeCustomer(id: Long)
}