package com.example.micro.ministry_of_interior.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "offence")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Offence {
    @Id
    public String Id;
    public String cin;
    public String name;
    public String type;
    public String description;

}
