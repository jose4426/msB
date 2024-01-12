package com.example.msB.service;


import com.example.msB.entity.ClassB;
import com.example.msB.repository.ClassBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ClassBService {
    final ClassBRepository repository;

    public List<ClassB> findAll() {
        List<ClassB> list= new ArrayList<>();
        list = repository.findAll();
        return list;
    }

    public ClassB save(ClassB classB) {
        return repository.save(classB);
    }

}
