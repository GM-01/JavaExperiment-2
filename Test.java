package Experiment2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int z = 0;
        String[][] x = new String[3][3];
        Student[] a = new Student[3];
        Student s1 = new Student(1, "小明", 'M', "无");
        Student s2 = new Student(2, "小红", 'M', "无");
        Student s3 = new Student(3, "小强", 'M', "无");
        Teacher t1 = new Teacher(1, "成哥", 'M', "C");
        Teacher t2 = new Teacher(2, "贾哥", 'M', "Python");
        Teacher t3 = new Teacher(3, "硕哥", 'M', "JAVA");
        Course c1 = new Course(13, "教300", "7:00", t1);
        Course c2 = new Course(20, "综0921", "9:40", t2);
        Course c3 = new Course(21, "综1003", "17:00", t3);
        a[0] = s1;
        a[1] = s2;
        a[2] = s3;
        System.out.println("教师信息:\n" + t1 + "\n" + t2 + "\n" + t3);
        System.out.println("课程列表:\n" + c1 + "\n" + c2 + "\n" + c3);
        System.out.println("学生信息:\n" + a[0] + "\n" + a[1] + "\n" + a[2]);
        while (z < 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("学生是否选课？？？" + "\n" + "Y or N");
            String i = scan.next();
            switch (i) {
                case "Y":
                case "y":
                    System.out.println("开始选课,请输入课程编号");
                    Scanner ch = new Scanner(System.in);
                    int j = ch.nextInt();
                    switch (j) {
                        case 13:
                            a[z].setLearnLesson(t1.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        case 20:
                            a[z].setLearnLesson(t2.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        case 21:
                            a[z].setLearnLesson(t3.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        default:
                            System.out.println("输入编号有误");
                    }
                    break;
                case "n":
                case "N":
                    System.out.println("不选课你搁这里骗技能呢？？？妹妹");
                    break;
//                    continue;
                default:
                    System.out.println("输入有误");
            }
            System.out.println("学生是否退课？？？" + "\n" + "Y or N");
            Scanner scan1 = new Scanner(System.in);
            String u = scan1.next();
            switch (u) {
                case "y":
                case "Y":
                    a[z].setLearnLesson("无");
                    System.out.println(a[z]);
                    break;
                case "n":
                case "N":
                    System.out.println("祝您生活愉快");
                    break;
                default:
                    System.out.println("输入有误");
            }
            z++;
        }
        z = 0;
        while (z < 3) {
            if (a[z].LearnLesson == "JAVA") {
                x[0][z] = a[z].getName();
                z++;
            } else if (a[z].LearnLesson == "C") {
                x[1][z] = a[z].getName();
                z++;
            } else if (a[z].LearnLesson == "Python") {
                x[2][z] = a[z].getName();
                z++;
            } else if (a[z].LearnLesson == "无") {
                System.out.println("该学生未选课:" + a[z].getName());
                z++;
            }
        }
        System.out.println("**********"+"\n"+"JAVA:");
        for (int i = 0; i < 3; i++) {
            if (x[0][i] == null) ;
            else {
                System.out.println(x[0][i]);
            }
        }
        System.out.println("**********"+"\n"+"C:");
        for (int i = 0; i < 3; i++) {
            if (x[1][i] == null) ;
            else {
                System.out.println("C:" + x[1][i]);
            }
        }
        System.out.println("**********"+"\n"+"Python:");
        for (int i = 0; i < 3; i++) {
            if (x[2][i] == null) ;
            else {
                System.out.println("Python:" + x[2][i]);
            }
        }
    }
}

