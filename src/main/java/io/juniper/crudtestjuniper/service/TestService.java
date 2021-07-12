package io.juniper.crudtestjuniper.service;

import io.juniper.crudtestjuniper.entity.TestEntity;
import io.juniper.crudtestjuniper.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestRepo testRepo;

    public String saveStudent(String name,String lastName)
    {
        TestEntity testEntity=new TestEntity();
        testEntity.setName(name);
        testEntity.setLastName(lastName);

        testRepo.save(testEntity);
        return "Saved";
    }
}
