package com.github.emalock3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class TestRepository {
    
    private static final List<TestEntity> entities = IntStream.range(1, 21)
            .mapToObj(i -> new TestEntity(String.valueOf(i), String.format("test-%s", i), String.format("test-%s@test.com", i)))
            .collect(Collectors.toList());
    
    public Optional<TestEntity> find(String id) {
        return entities.stream().filter(te -> te.getId().equals(id)).findFirst();
    }
    
    public List<TestEntity> findAll() {
        return entities;
    }
    
}
