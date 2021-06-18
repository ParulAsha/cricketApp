public class CricketData {

    private int run,wicket;
    float over;
    private CurrentScoreDisplay currentScoreDisplay;
    private AverageScoreDisplay averageScoreDisplay;
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public float getOver() {
        return over;
    }

    public void setOver(float over) {
        this.over = over;
    }



    public CricketData( CurrentScoreDisplay currentScoreDisplay,AverageScoreDisplay averageScoreDisplay)
    {
        this.currentScoreDisplay=currentScoreDisplay;
        this.averageScoreDisplay=averageScoreDisplay;

    }
    public void dataChanged()
    {
        run=getRun();
        wicket=getWicket();
        over=getOver();
        currentScoreDisplay.update(run,wicket,over);
        averageScoreDisplay.update(run,wicket,over);


    }
}

