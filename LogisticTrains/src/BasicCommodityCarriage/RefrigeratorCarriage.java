package BasicCommodityCarriage;

public class RefrigeratorCarriage extends BasicCommodityCarriage {
    private String kindOfCarriage;
    private String kingOfCooling;

    public RefrigeratorCarriage(String name, int WagaNetto, int LoadCapacity, int BodyVolume, String KindOfCarriage, String KindOfCooling) {
        super(name, WagaNetto, LoadCapacity, BodyVolume);
        this.kindOfCarriage = KindOfCarriage;
        this.kingOfCooling = KindOfCooling;
    }

    public String getKindOfCarriage() {
        return kindOfCarriage;
    }

    public String getKingOfCooling() {
        return kingOfCooling;
    }

    public boolean electricity(){
        return true;
    }
    public String toString() {
        return "Information about RefrigeratorCarriage -->" +
                "(" + " Name : " +getName() +
                ", " + "KindOfCarriage: " + getKindOfCarriage() +
                ", " + "KingOfCooling: " + getKingOfCooling()  +
                ", " + "BodyVolume : " + getBodyVolume() + " M^3" +
                ", " + "LoadCapacity: " + getLoadCapacity() +
                ", " + " WagaNetto : " + getWeightNetto() +
                ", " + "WagaBrutto : " + getWeightBrutto() +
                ", " + "isConnected : " + electricity() +
                ", " + "CarriageNumber : " + getCarriageNumber() + ")";
    }
}
