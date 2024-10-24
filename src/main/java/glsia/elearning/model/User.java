package glsia.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String prenom;
    private String email;
    private String password;
    private String phone;

    public enum Role {
        ADMIN, PROFESSOR, STUDENT
    }

    private Role role;

    public User(String name, String prenom, String email, String password, String phone, Role role) {
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }
}