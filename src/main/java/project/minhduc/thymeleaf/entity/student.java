package project.minhduc.thymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    String fullname ;
    Boolean gender ;
    String email;
    Double mark;
    String country;
}
