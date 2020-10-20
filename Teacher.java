package Experiment2;

public class Teacher extends Human {
    String TeachLesson;
    String name;
    Teacher(int code, String name, char sex, String lesson) {
        super(code, name, sex);
        this.TeachLesson = lesson;
        setName(name);
    }
    public String toString() {
        return "教师编号:" + getCode() + " 教师姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + TeachLesson;
    }
}
