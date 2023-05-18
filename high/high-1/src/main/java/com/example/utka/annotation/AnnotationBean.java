package com.example.utka.annotation;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AnnotationBean {
    @Builder.Default
    private String name = "AnnotationBean";
}
