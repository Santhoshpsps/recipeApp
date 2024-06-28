//package com.psps.recipe.repository.reactive;
//
//import com.psps.recipe.model.Recipe;
//import com.psps.recipe.model.UnitOfMeasure;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//@DataMongoTest
//class UnitOfMeasureReactiveRepositoryTest {
//
//    @Autowired
//    UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository;
//
//    @BeforeEach
//    void setUp() {
//        unitOfMeasureReactiveRepository.deleteAll().block();
//    }
//
//    @Test
//    void findByDescription() {
//        // given
//        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
//        unitOfMeasure.setDescription("spoon");
//        // when
//        unitOfMeasureReactiveRepository.save(unitOfMeasure).block();
//        // then
//        assertEquals(unitOfMeasureReactiveRepository.count().block(), 1L);
//    }
//}