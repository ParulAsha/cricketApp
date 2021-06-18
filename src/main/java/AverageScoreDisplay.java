public class AverageScoreDisplay {
private float rate;
private float averageScore;
public void update(int run, int wicket, float over)
{
    this.rate=run/over;
    this.averageScore=rate*50;
    display();

}
public void display()
{
    System.out.println( "Average score is "+averageScore);
}
}
