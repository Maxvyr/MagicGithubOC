package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // recover user from the API services
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // recover randomUser from the API
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // delete user from the API service
        apiService.deleteUser(user);
    }
}
