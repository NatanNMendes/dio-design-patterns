package designPatterns.CreationalDesignPatterns.singleton.EAGER;

public class App {
    public static void main(String[] args) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();

        agenda.setActivity(Day.MONDAY, "Gym");
        agenda.setActivity(Day.TUESDAY, "Work Meeting");
        agenda.setActivity(Day.WEDNESDAY, "Dentist Appointment");
        agenda.setActivity(Day.FRIDAY, "Movie Night");  // Deve ser rejeitado
        agenda.setActivity(Day.SATURDAY, "Family Time");  // Deve ser rejeitado

        agenda.printSchedule();

        AgendaSingletonEAGER anotherAgenda = AgendaSingletonEAGER.getInstance();
        anotherAgenda.setActivity(Day.THURSDAY, "Grocery Shopping");

        agenda.printSchedule();
    }
}

