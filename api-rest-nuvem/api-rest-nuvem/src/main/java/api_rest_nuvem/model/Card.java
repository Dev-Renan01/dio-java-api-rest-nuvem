package api_rest_nuvem.model;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 13, precision = 2 )
    private Number limit;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
