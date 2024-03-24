package com.designPatterns.builderDesignPrctice;

public class Student {
    private int rollNo;
    private String name;
    private String className;
    private int age;
    private double psp;
    private int gradeYear;

    private Student(Builder builder) {
        if(builder.getAge() > 100){
            throw new RuntimeException("Age cant be greater than 100");
        }
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.className = builder.className;
        this.age = builder.age;
        this.psp = builder.psp;
        this.gradeYear = builder.gradeYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", gradeYear=" + gradeYear +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        private int rollNo;
        private String name;
        private String className;
        private int age;
        private double psp;
        private int gradeYear;

        public int getRollNo() {
            return rollNo;
        }

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getClassName() {
            return className;
        }

        public Builder setClassName(String className) {
            this.className = className;
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
