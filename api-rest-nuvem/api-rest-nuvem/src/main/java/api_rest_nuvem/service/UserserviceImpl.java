package api_rest_nuvem.service;

import api_rest_nuvem.model.User;
import api_rest_nuvem.repository.UserRepository;
import org.hibernate.sql.model.jdbc.UpsertOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserserviceImpl implements UserService{

    private final UserRepository repository;

    public UserserviceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null &&repository.existsById(userToCreate.getId()))
        throw new IllegalArgumentException("usuário já existente!");

        return repository.save(userToCreate);
    }
}
