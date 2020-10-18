package del.ac.id.demo.jpa;

import del.ac.id.demo.jpa.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    
    User findByEmail(String email);

}
