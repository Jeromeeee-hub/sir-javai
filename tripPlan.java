class tripPlan {

    String planName, planDescription, tripListActivities[], planInstructions[];
    int planPrepTime, planTravelTime, planActivities, planNumInstructions;

    tripPlan(
        String planName,
        String planDescription,
        int planPrepTime,
        int planTravelTime,
        int planActivities,
        String tripListActivities[],
        int planNumInstructions,
        String planInstructions[]

    ) {
        this.planName = planName;
        this.planDescription = planDescription;
        this.planPrepTime = planPrepTime;
        this.planTravelTime = planTravelTime;
        this.planActivities = planActivities;
        this.tripListActivities = tripListActivities;
        this.planNumInstructions = planNumInstructions;
        this.planInstructions = planInstructions;
    }
}
