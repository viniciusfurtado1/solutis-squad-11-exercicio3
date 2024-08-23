package questao_23;

import java.time.MonthDay;

public class Person {
    private String name;

    private int birthDay;

    private int birthMonth;

    public Person(String name, int birthDay, int birthMonth) {
        /*
        Aqui eu poderia realizar uma verificação se o dia está entre 1 ~ 12
        e o mês está entre 1 ~ 31 e, caso contrário lança uma exception
         */
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
    }

    public String getName() {
        return name;
    }

    public MonthDay getBirthDate() {
        return MonthDay.of(birthMonth, birthDay);
    }

}
