package glsia.elearning.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin extends User {

    public Admin() {
    }

    public Admin(String name, String prenom, String email, String password, String phone) {
        super(name, prenom, email, password, phone, Role.ADMIN);
    }
}