package BackentASK.Backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

     public User findByEmail (String Email);

}
