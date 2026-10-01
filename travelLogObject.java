class TravelLogObject {

    String destinationName, destinationType, dateVisited, location, travelExp;
    int visits;

    TravelLogObject(
        String destinationName,
        String destinationType,
        int visits,
        String dateVisited,
        String location,
        String travelExp
    ) {
        this.destinationName = destinationName;
        this.destinationType = destinationType;
        this.visits = visits;
        this.dateVisited = dateVisited;
        this.location = location;
        this.travelExp = travelExp;
    }
}
