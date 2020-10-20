package Experiment2;

public class Student extends Human {
    String LearnLesson;

    Student(int code, String name, char sex, String lesson) {
        super(code, name, sex);
        setLearnLesson(lesson);
    }

    String getLearnLesson() {
        return LearnLesson;
    }
    void  setLearnLesson(String LearnLesson){
        this.LearnLesson = LearnLesson;
    }

    public String toString() {
        return "学生编号:" + getCode() + " 学生姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + LearnLesson;
    }
}
