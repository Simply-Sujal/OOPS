public class EnumExample {
    enum Week{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
        //these are enum constants
        //public , static and final
        //since its final you can create child elements
        //type is week

        Week() {
            System.out.println("Constrictor called for " + this);
        }
        // this is not public or protected , only private or default
        //why? we dont want to create new object 
        // this is not the enum concept , thats why

        // Internally : public static final Week Monday = new Week();
        // Enum can implement interfaces as well
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;
        System.out.println(Week.valueOf("Wednesday"));

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }
    //     System.out.println(week);
    //     System.out.println(week.ordinal()); // ordinal tells us about the number or the position 
    }
}
