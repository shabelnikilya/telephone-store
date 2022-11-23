package store.telephone.models;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public enum BonusCard {
    BRONZE("Бронзовая", 5, "I", LocalDate.now()),
    SILVER("Серебрянная", 10, "II", LocalDate.now()),
    GOLD("Золотая", 15, "III", LocalDate.now());

    private String name;
    private int sale;
    private String numberCard;
    private LocalDate created;

}
