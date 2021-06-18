public class CurrentScoreDisplay {
    int run,wicket;
    float over;
    public void update(int run,int wicket,float over)
    {
        this.run=run;
        this.wicket=wicket;
        this.over=over;
        display();

    }
    public void display()
    {
        System.out.println("run= "+run+"wicket= "+wicket);
    }
}
