/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

/**
 *
 * @author admin
 */
class Student {
    
    private String StudentName;
    private String ClassName;
    private double Math, Physical, Chemistry, Average;
    private String type;

    public Student(String StudentName, String ClassName, double Math, double Physical, double Chemistry, double Average, String type) {
        this.StudentName = StudentName;
        this.ClassName = ClassName;
        this.Math = Math;
        this.Physical = Physical;
        this.Chemistry = Chemistry;
        this.Average = Average;
        this.type = type;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getClassName() {
        return ClassName;
    }

    public double getMath() {
        return Math;
    }

    public double getPhysical() {
        return Physical;
    }

    public double getChemistry() {
        return Chemistry;
    }

    public double getAverage() {
        return Average;
    }

    public String getType() {
        return type;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }

    public void setPhysical(double Physical) {
        this.Physical = Physical;
    }

    public void setChemistry(double Chemistry) {
        this.Chemistry = Chemistry;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
