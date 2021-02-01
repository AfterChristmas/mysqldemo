package com.itwanyan.mysqldemo;

import com.itwanyan.mysqldemo.mapper.AnimalMapper;
import com.itwanyan.mysqldemo.model.entity.Animal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import javax.annotation.Resource;

@SpringBootTest
class MysqldemoApplicationTests {

    @Resource
    private AnimalMapper animalMapper;
    @Test
    void contextLoads() {
        Animal animal = new Animal();
        animal.setName("name"+ new Random(100).nextInt());
        animalMapper.insert(animal);
    }

}
