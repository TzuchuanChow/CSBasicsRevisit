public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int ActualMinutes){
        return expectedMinutesInOven()-ActualMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int NumsLayer){
        return NumsLayer * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int NumsLayers, int ActualMinutes){
        return NumsLayers * 2 + ActualMinutes;
    }
}
