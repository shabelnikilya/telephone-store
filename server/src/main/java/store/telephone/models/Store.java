package store.telephone.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Store {

    private int id;
    private String name;
    private Warehouse warehouse;
    private List<Employee> employees;
    private Address address;
    private List<Currency> currencies;
}
