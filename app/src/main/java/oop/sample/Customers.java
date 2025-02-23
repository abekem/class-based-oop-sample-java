package oop.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customers {
    List<Customer> customers;

    // ...

    List<Customer> asList() {
        return Collections.unmodifiableList(customers);
    }
}

// class Customers {
//     List<Customer> customers;

//     ...

//     Customers add(Customer customer) {
//         List<Customer> result = new ArrayList<>(customers);
//         result.add(customer);
//         return new Customers(result);
//     }
// }

// class Customers {
//     List<Customer> customers;

//     ...

//     List<Customer> getList() {
//         return customers;
//     }
// }

// class Customers {
//     List<Customer> customers;

//     void add(Customer customer) { ... }
//     void removeIfExists(Customer customer) { ... }

//     int count() { ... }

//     Customers importantCustomers() { ... }
// }
