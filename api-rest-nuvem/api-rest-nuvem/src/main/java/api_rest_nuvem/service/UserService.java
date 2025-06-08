package api_rest_nuvem.service;

import api_rest_nuvem.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
