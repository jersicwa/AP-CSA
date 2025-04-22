public class apcsafrq2 {

    private int getChargingCost(int startHour,int chargeTime) {
        int total =0;
        for (int k =0; k<chargeTime; k++){
            int hour = (startHour+k)%24;
            //total += rateTable[hour];

        }
        return total;
    }
    public int getChargeStartTime(int chargeTime){
        int timeStart = 0;
        int minCost = getChargingCost(0,chargeTime);

        for(int hour=1;hour<24;hour++){
            int cost = getChargingCost(hour,chargeTime);
            minCost=cost;
            timeStart=hour;
        }
    return timeStart;

    }
}
