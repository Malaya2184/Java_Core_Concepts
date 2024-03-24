package com.designPatterns.builderDesign.BuilderUsingLombok;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class MyDetails {
    int  age;
    String name;
}
