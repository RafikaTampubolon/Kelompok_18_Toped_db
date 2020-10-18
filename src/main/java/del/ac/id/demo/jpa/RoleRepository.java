package del.ac.id.demo.jpa;

import del.ac.id.demo.jpa.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);

}
