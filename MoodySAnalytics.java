package moody.sanalytics;

public class MoodySAnalytics {

    public static void main(String[] args) {
        // TODO code application logic here
        LearningFromPast learning=new LearningFromPast();
        learning.trading();
        
        SmallRiskTrading smallRisk=new SmallRiskTrading();
        smallRisk.tradingRisk();
        
        Asterisk asterik=new Asterisk();
        asterik.mainfun();
    }
    
}
