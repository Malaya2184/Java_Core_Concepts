package com.designPatterns.builderDesign;

public class Student {
    private String name;
    private String phone;
    private int age;
    private double psp;
    private String batch;
    private int gradeYear;

    private Student(Builder builder) {
        if(builder.getAge() > 100){
            throw  new RuntimeException("age is greater than 100");
        }
        this.name = builder.getName();
        this.phone = builder.getPhone();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradeYear = builder.getGradeYear();

    }

    public int getGradeYear() {
        return gradeYear;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }

    public  static Builder getBuilder(){
        return new Builder();
    }

    // builder class
    static class Builder {
        private String name;
        private String phone;
        private int age;
        private double psp;
        private String batch;
        private int gradeYear;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {

            this.name = name;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {

            this.phone = phone;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {

            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {

            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradeYear() {
            return gradeYear;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }


}
