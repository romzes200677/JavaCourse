package ru.lesson.lessons;

/**
 * Created by оплоплопшгншгрло on 08.06.2016.
 */
public class Calculator {
    /**
     * Результат вычисления
     */
    private int result;
    /*
    Сумма аргументов
     */
    public void add(int ... params){
        for(int i : params){
            this.result+=i;
        }
    }
    /*
    Получить результат
     */
    public int getResult(){
        return this.result;
    }

    /*
      Очистить результаты
     */
    public void clearResult(){
        this.result=0;
    }
}
