package designPatterns.CreationalDesignPatterns.singleton.LAZY;

public class App {
    public static void main(String[] args) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();

        agenda.setActivity(Day.MONDAY, "Gym");
        agenda.setActivity(Day.TUESDAY, "Work Meeting");
        agenda.setActivity(Day.WEDNESDAY, "Dentist Appointment");
        agenda.setActivity(Day.FRIDAY, "Movie Night");  // Deve ser rejeitado
        agenda.setActivity(Day.SATURDAY, "Family Time");  // Deve ser rejeitado

        agenda.printSchedule();

        AgendaSingletonLAZY anotherAgenda = AgendaSingletonLAZY.getInstance();
        anotherAgenda.setActivity(Day.THURSDAY, "Grocery Shopping");

        agenda.printSchedule();
    }
}

