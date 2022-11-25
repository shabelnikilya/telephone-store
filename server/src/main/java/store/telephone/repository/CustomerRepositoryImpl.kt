package store.telephone.repository

import store.telephone.models.Customer

class CustomerRepositoryImpl: CustomerRepository<Customer> {

    override fun saveCustomer(t: Customer): Long {
        TODO("Not yet implemented")
    }

    override fun findCustomerById(id: Long): Customer {
        TODO("Not yet implemented")
    }

    override fun findAllCustomers(): List<Customer> {
        TODO("Not yet implemented")
    }

    override fun removeCustomer(id: Long): Boolean {
        TODO("Not yet implemented")
    }
}