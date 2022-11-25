package store.telephone.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
public enum BonusCard {

    BRONZE("Бронзовая", 5),
    SILVER("Серебрянная", 10),
    GOLD("Золотая", 15);

    private final String name;
    private final int sale;
    private final String numberCard = UUID.randomUUID().toString();
    private final LocalDate created = LocalDate.now();
}
