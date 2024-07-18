package designPatterns.CreationalDesignPatterns.singleton.EAGER;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {
    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
    private Map<Day, String> schedule;

    private AgendaSingletonEAGER() {
        schedule = new HashMap<>();
        // Inicializando a agenda com dias vazios
        for (Day day : Day.values()) {
            schedule.put(day, "");
        }
    }

    public static AgendaSingletonEAGER getInstance() {
        return INSTANCE;
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

