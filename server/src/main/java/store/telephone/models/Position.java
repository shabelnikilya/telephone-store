package store.telephone.models;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public enum Position {
    JUNIOR_STAFF("Продавец консультант", new BigDecimal(1000)),
    SERVING_STAFF("Продавец кассир",new BigDecimal(1200)),
    MIDDLE_STAFF("Старший продавец", new BigDecimal(1500)),
    SENIOR_STAFF("Директор", new BigDecimal(2000));

    private String namePosition;
    private BigDecimal salary;
}
