package designPatterns.CreationalDesignPatterns.singleton.LAZY;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonLAZY {
    private static AgendaSingletonLAZY instance;
    private Map<Day, String> schedule;

    private AgendaSingletonLAZY() {
        schedule = new HashMap<>();
        for (Day day : Day.values()) {
            schedule.put(day, "");
        }
    }

    public static synchronized AgendaSingletonLAZY getInstance() {
        if (instance == null) {
            instance = new AgendaSingletonLAZY();
        }
        return instance;
    }

    public void setActivity(Day day, String activity) {
        if (day == Day.FRIDAY || day == Day.SATURDAY) {
            System.out.println("Não é possível definir atividades para Sexta-feira ou Sábado.");
            return;
        }
        schedule.put(day, activity);
    }

    public String getActivity(Day day) {
        return schedule.get(day);
    }

    public void printSchedule() {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + schedule.get(day));
        }
    }
}

