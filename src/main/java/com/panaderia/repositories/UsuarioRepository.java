package com.panaderia.repositories;

import com.panaderia.domains.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByMailAndPasswd(String mail, String passwd);
}
