package store.telephone.repository

interface CustomerRepository<T> {

    // todo добавить Customer

    fun saveCustomer(t: T): Long

    fun findCustomerById(id: Long): T

    fun findAllCustomers(): List<T>

    fun removeCustomer(id: Long): Boolean
}