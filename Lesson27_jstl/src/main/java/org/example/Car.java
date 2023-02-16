package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Car {
    private Long id;
    private String brand;
    private Long year;



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
