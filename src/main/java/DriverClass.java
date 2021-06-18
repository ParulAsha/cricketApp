public class DriverClass {
    public static void main(String[] args)
    {
    CricketData cricketData=new CricketData(new CurrentScoreDisplay(),new AverageScoreDisplay());
    cricketData.setRun(56);
    cricketData.setWicket(6);
    cricketData.setOver(3);
     cricketData.dataChanged();
    }
}
