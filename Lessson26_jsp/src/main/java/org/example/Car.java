package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private long id;
    private String brand;
    private String year;
    private String country;


    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "\nCar:" + "id : " + id + "\n" +
                "brand : " + brand + "\n" +
                "year : " + year + "\n" +
                "country : " + country;
    }
}
