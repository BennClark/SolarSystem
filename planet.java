public class planet 
{

    
    private double pDistance = 0;
    private double pAngle = 0;
    private double pDiameter = 0;
    private String pColour = "";
    private double pSpeed = 0;



    public planet(double distance, double angle, double diameter, String colour, double speed) 
    {
    
        pDistance = distance;
        pAngle = angle;
        pDiameter = diameter;
        pColour = colour;
        pSpeed = speed;
    }

    public void draw(SolarSystem s, int i)
    {
        s.drawSolarObject(pDistance,pAngle +(i*pSpeed),pDiameter,pColour);
    }



    public double getDistance() 
    {
        return pDistance;
    }
    public double getAngle() 
    {
        return pAngle;
    }
    public double getSpeed() 
    {
        return pSpeed;
    }


}