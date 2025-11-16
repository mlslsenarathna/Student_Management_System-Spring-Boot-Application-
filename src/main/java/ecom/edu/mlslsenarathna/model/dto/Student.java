package ecom.edu.mlslsenarathna.model.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String studentId;
    private String firstName;
    private String secondName;
    private String contactNo;
    private String Email;
    private LocalDate dob;

}
