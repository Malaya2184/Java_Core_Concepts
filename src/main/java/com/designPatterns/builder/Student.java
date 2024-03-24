package com.designPatterns.builder;

public class Student {
    private int rollno;
    private String name;
    private int age;
    public Student(Builder builder){
        if(builder.getAge() < 10){
            throw new RuntimeException("Age below 10");
        }
        this.rollno = builder.getRollno();
        this.name = builder.getName();
        this.age = builder.getAge();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    static class  Builder{
        private int rollno;
        private String name;
        private int age;

        public int getRollno() {
            return rollno;
        }

        public Builder setRollno(int rollno) {
            this.rollno = rollno;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
