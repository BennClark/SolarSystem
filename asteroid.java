public class asteroid 
{

    private double aDistance = 0;
    private double aAngle = 0;
    private double aDiameter = 0;
    private String aColour = "WHITE";
    private double aSpeed = 0.1;

    public asteroid() 
    {
    
        aDistance = getRandomNumber(150,180);
        aAngle = getRandomNumber(0, 360);
        aDiameter = getRandomNumber(1, 4);
        aSpeed = (getRandomNumber(5,20))/10;
        System.out.println(aSpeed);
    }

    public double getRandomNumber(int min, int max) {
        return (double) ((Math.random() * (max - min)) + min);    
    }

    public void draw(SolarSystem s, int i)
    {
        s.drawSolarObject(aDistance,aAngle +(i*aSpeed),aDiameter,aColour);
    }
    
}
