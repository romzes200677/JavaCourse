package ru.lesson.lessons;

/**
 * Created by ���������������� on 08.06.2016.
 */
public class Calculator {
    /**
     * ��������� ����������
     */
    private int result;
    /*
    ����� ����������
     */
    public void add(int ... params){
        for(int i : params){
            this.result+=i;
        }
    }
    /*
    �������� ���������
     */
    public int getResult(){
        return this.result;
    }

    /*
      �������� ����������
     */
    public void clearResult(){
        this.result=0;
    }
}
