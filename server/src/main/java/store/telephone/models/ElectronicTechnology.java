package store.telephone.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElectronicTechnology {

    private int id;
    private String name;
    private String model;
    private BigDecimal price;
    private String manufacturerCountry;
    private LocalDate saveData;
}
