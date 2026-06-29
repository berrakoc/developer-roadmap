package com.berrakoc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString //toString override etmezsen ram bellekteki adresini sana yazdırır
public class User {
    private String firstName;
}
