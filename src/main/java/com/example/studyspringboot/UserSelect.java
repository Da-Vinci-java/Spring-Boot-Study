package com.example.studyspringboot;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserSelect implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com/example/studyspringboot/entity/Cat.java","com/example/studyspringboot/entity/User.java"};
    }
}
