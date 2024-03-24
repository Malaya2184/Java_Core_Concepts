package com.designPatterns.prototypeAndRegestryDesign;

public class IntelligentStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public  IntelligentStudent clone() {
        IntelligentStudent clone = new IntelligentStudent();
        clone.setName(this.getName());
        clone.setBatch(this.getBatch());
        clone.setPsp(this.getPsp());
        clone.setAverageBatchPsp(this.getAverageBatchPsp());
        clone.setAge(this.getAge());
        clone.setIq(this.iq);

        return clone;
    }
}
