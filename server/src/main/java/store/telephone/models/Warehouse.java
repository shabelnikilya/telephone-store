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
public class Warehouse {
    private int id;
    private String name;
    private Address address;
    private List<ElectronicTechnology> electronicTechnologies;
}
