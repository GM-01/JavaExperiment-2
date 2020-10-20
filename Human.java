package Experiment2;

public class Human {
    private int code;
    private String name;
    private char sex;

    Human(int code, String name, char sex){
        setCode(code);
        setName(name);
        setSex(sex);
    }


    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    char getSex() {
        return sex;
    }

    void setCode(int code) {
        if (code <= 0) {
            System.out.println("您输入的编号有误，请重新输入");
        }
        else{
            this.code = code;
        }
    }

    void setName(String name) {
        this.name = name;
    }

    void setSex(char sex) {
        this.sex = sex;
    }


}
