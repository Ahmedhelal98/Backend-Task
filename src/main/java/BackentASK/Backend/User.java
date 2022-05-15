package BackentASK.Backend;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "userData")
@Data
public class User {


    @Id
    public String id;

    public String Email;
    public String password;


//    public User() {
//    }

//    public User(String email, String password) {
//
//       this.Email = email;
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String email) {
//        this.Email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

//    @Override
//    public String toString() {
//        return String.format(
//                "User[id=%s, Email='%s', password='%s']",
//                id, Email, password);
//    }
}
