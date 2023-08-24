package com.example.demo.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private EntityManager entityManager;

    public int getUserCount() {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GET_USER_COUNT");
        query.registerStoredProcedureParameter("user_count", Integer.class, ParameterMode.OUT);

        query.execute();

        return (int) query.getOutputParameterValue("user_count");
    }

}
