package io.juniper.crudtestjuniper.repository;

import io.juniper.crudtestjuniper.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestEntity,Long> {
}
