# 计191 高萌 2019310175
## 实验三 学生选课模拟系统

### 一、	实验目的
#### 1.	初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
#### 2.	掌握面向对象的类设计方法（属性、方法）；
#### 3.	掌握类的继承用法，通过构造方法实例化对象；
#### 4.	学会使用super()，用于实例化子类；
#### 5.	掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
### 二、	业务要求
#### 说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅0.教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
#### 学生1 (编号: 1,姓名: "小明",性别: 'M',所选课程: "无");
#### 学生2 (编号: 2,姓名: "小红",性别: 'M',所选课程: "无");
#### 学生3 (编号: 3,姓名: "小强",性别: 'M',所选课程: "无");
#### 教师1 (编号: 1,姓名: "成哥",性别: 'M',所授课程: "C");
#### 教师2 (编号: 2,姓名: "贾哥",性别: 'M',所授课程: "Python");
#### 教师3 (编号: 3,姓名: "硕哥",性别: 'M',所授课程: "JAVA");
#### 课程1 (编号: 13,地点: "教300",时间: "7:00",教师类: t1);
#### 课程2 (编号: 20,地点: "综0921",时间: "9:40",教师类: t2);
#### 课程3 (编号: 21,地点: "综1003",时间: "17:00",教师类: t3);
### 三、	实验要求
#### 1.	编写上述实体类以及测试主类（注意类之间继承关系的适用）
#### 2.	在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 ）；模拟学生退课操作，再打印课程信息。
#### 3.	编写实验报告。
### 四、	实验过程
#### 1.	根据实验要求，建立父类：人员类(Human),对象属性包含，人员编号，姓名，性别。
#### 2.	建立子类，教师类，继承父类的方法，并添加特有属性，所授课程。
#### 3.	建立子类，学生类，继承父类的方法，并添加特有属性，所选课程。
#### 4.	建立课程类，要求：
##### 1)	添加属性number，并通过构建setNumber来设置number的值。
##### 2)	添加属性site，并通过构建setSite，来设置site的值。
##### 3)	添加属性time，并通过构建setTime，来设置time的值。
##### 4)	添加教师类变量t，使教师类中的所授课程和对应的授课教师能与课程类关联，避免出现课程类与教师类，内容存在冲突的情况。
##### 5)	构建方法，Course，其变量包含以上四点的全部属性，并设置各个变量的值。
##### 6)	通过对类的地址重写，满足输出结果为课程编号+课程名称+上课地点+时间+授课教师，并在课程名称和授课教师中调用本类中教师类变量中相对应的值。
#### 5.	通过对教师类地址的重写，使其结果满足：教师编号:" + getCode() + " 教师姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + TeachLesson;
#### 6.	通过对学生类地址的重写，使其结果满足：学生编号:" + getCode() + " 学生姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + LearnLesson;
#### 7.	创建Test测试类(主类)，要求如下：
##### 1)	对各个类进行赋值，设置学生类所选课程属性初始值为无。
##### 2)	定义学生类一维数组，字符串型二维数组。
##### 3)	打印教师类和学生类的全部变量
##### 4)	打印课程类全部变量，组成选课列表。
##### 5)	将学生类的对象赋值给学生类数组
##### 6)	建立循环，循环变量为数组下标，进行多个学生的退选课操作。
##### 7)	运用switch和Scanner语句来判断学生是否选课。
##### 8)	再次运用switch和Scanner语句，来判断学生选的什么课。
##### 9)	根据所选编号，来重新设置学生类中所选课程属性的值。
##### 10)	在每个switch中设置default，用来防止用户输入有误。
##### 11)	若学生选课正确，打印学生最终的信息，若不正确，则给出相关提示。
##### 12)	再次运用switch和Scanner语句，来实现退课。
##### 13)	若学生退课成功，则设置学生所选课程为无。
##### 14)	当全部学生进行退选课操作之后，结束循环。
##### 15)	根据学生所选课程，来将学生姓名存入字符串型二维数组。
##### 16)	根据字符串型二维数组，来分课程数组，每个课程学生的姓名，组成名单，并结束程序。

### 五、流程图
![流程图](https://github.com/GM-01/JavaExperiment-2/blob/main/%E9%80%89%E8%AF%BE%E7%B3%BB%E7%BB%9F%E6%B5%81%E7%A8%8B%E5%9B%BE.png)


### 六、核心代码
#### 以下代码，是我本次实验耗时最多的时间，其中课程类中，定义了教师类的变量，并在最后对课程类地址重写中，调用教师类中的所选课程和对应的授课教师变量的值，这样可以避免出现，老师与课程冲突这个问题。
```
package Experiment2;

public class Teacher extends Human {     //继承Human类
    String TeachLesson;
    String name;
    Teacher(int code, String name, char sex, String lesson) {
        super(code, name, sex);          //调用Human的方法
        this.TeachLesson = lesson;       
        this.name = name;
    }
    public String toString() {           //对地址重写
        return "教师编号:" + getCode() + " 教师姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + TeachLesson;
    }
}
```
```
package Experiment2;

public class Course {
    int number;
    String site;
    String time;
    Teacher t;                          //定义教师类变量
    Course(int number,String site,String time,Teacher t) {
        setNumber(number);
        setSite(site);
        setTime(time);
        this.t = t;                    //设置教师类变量的值
    }

    void setNumber(int number) {
        this.number = number;
    }

    void setSite(String site) {
        this.site = site;
    }

    void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "课程编号:"+ number +" 课程名称:"+t.TeachLesson+" 上课地点:"+site+" 时间:"+time+" 授课教师:"+t.name;
    }
}
```
#### 这段代码展示了，如何将多个学生进行选课与退课，首先，建立一个学生类数组，将学生类对象的值赋给学生类数组，然后，用循环里的值调用数组下标，进行退选课操作。 
```
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
```
### 七、实验结果
![实验运行截图](https://github.com/GM-01/JavaExperiment-2/blob/main/ALOJ%400622PWO%5B5N2%60%25RF6RS.png)
### 八、实验感想
####  本次实验，除了继承了上一个实验的基本内容，即类与主类之间的联系，程序并不一定要写在一个文件里面，自定义类增加了代码的自由度与功能性之外，继承，成为了本次实验的重点，在编写本次实验程序时，通过与同学交流，大家普遍认为难点在于选课退课的实现，但是对于我来说，在测试主类中实现的退课选课并没有花费我大量的时间，反而是，对教师，学生，课程类中关键变量的关联，即如何能在课程类中调用教师类的授课教师姓名与其对应的所授课程，避免课程类与教师类内容冲突，以及，如何在学生选课中，使学生类与教师类中，所选课程与所授课程统一，这些需求，给我造成了不小的困难，花费了不少功夫去解决。  
####  另外，又一次在Java中学到了以往学不到的，super方法和子类继承父类，这个看起来很鸡肋，不就是和数学类似的思想，提取公因式，但是，我认为这个方法能使各类之间建立联系，保持相对的统一性，同时，也大大减少了相同代码的复写，提高了工作效率。
####  最终，这个选课系统并不完美，依旧存在一些漏洞，但是这个实验足以将我目前所学，进行不断的深化，也学到了各类之间变量的调用，地址的复写，这些都使我的代码不断的简化。
