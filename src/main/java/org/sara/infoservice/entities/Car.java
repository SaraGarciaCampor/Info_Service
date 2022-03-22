package org.sara.infoservice.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "cars")
@Table
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @NonNull
    @Column
    private String brand;

    @NonNull
    @Column
    private String model;

    @NonNull
    @Column
    private Integer horsePower;

    public Car() {}

    public Car(String brand, String model, Integer horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car(id='"+id+"', brand='"+brand+"', model='"+model+"', horsePower='"+horsePower+"')";
    }

}
