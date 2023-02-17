package org.example.BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    private String country;
    private String city;
    private String district;
}