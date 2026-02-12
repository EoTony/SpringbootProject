package com.example.course.entities.PK;

import com.example.course.entities.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {
    @Serial
    private static final long serialVersionUID = 1970929930916081871L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant date;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment(Long id, Instant date, Order order) {
        this.id = id;
        this.date = date;
        this.order = order;
    }

    public Payment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) && Objects.equals(date, payment.date) && Objects.equals(order, payment.order);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
