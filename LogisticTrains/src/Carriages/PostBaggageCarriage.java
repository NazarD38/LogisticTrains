package Carriages;

public class PostBaggageCarriage extends PostCarriage {
    private int baggageWeight;
    private int baggageContainer;

    public PostBaggageCarriage(String name, int weightNetto, int postContainer, int baggageContainer) {
        super(name, weightNetto, postContainer);
        this.baggageContainer = baggageContainer;
        this.baggageWeight = baggageWeight();

    }

    public int baggageWeight() {
        int sum = 0;

        int arr[] = new int[baggageContainer];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 400) + 1;
        }
        for (int w : arr) {
            sum += w;
        }
        return sum;
    }

    public int weightBrutto() {
        return getWeightNetto() + getPostWeight() + getBaggageWeight();
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    public int getBaggageContainer() {
        return baggageContainer;
    }

    public boolean electricity(){
        return false;
    }
    public String toString() {
        return "Information about PostBaggageCarriage -->" +
                "(" + " Name: " + getName() +
                ", " + "PostContainer: " + getPostContainer() +
                ", " + "BaggageContainer: " + getBaggageContainer() +
                ", " + "PostWeight : " + getPostWeight() +
                ", " + "BaggageWeight : " + baggageWeight +
                ", " + " WagaNetto : " + getWeightNetto() +
                ", " + "WagaBrutto : " + weightBrutto() +
                ", " + "isConnected : " + electricity() +
                ", " + "CarriageNumber : " + getCarriageNumber() + ")";
    }
}