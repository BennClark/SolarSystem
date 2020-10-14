public class moon
{
    private double mDistance = 0;
    private double mAngle = 0;
    private double mDiameter = 0;
    private String mColour = "";
    private double mSpeed = 0;
    
    private double pOrbitDistance = 0;
    private double pOrbitAngle = 0;
    private double pOrbitSpeed = 0;


    public moon(double distance, double angle, double diameter, String colour, double speed, planet p) 
    {
    
        mDistance = distance;
        mAngle = angle;
        mDiameter = diameter;
        mColour = colour;
        mSpeed = speed;
        
        pOrbitDistance = p.getDistance();
        pOrbitAngle = p.getAngle();
        pOrbitSpeed = p.getSpeed();
    }

    public void draw(SolarSystem s, int i)
    {
        s.drawSolarObjectAbout(mDistance,mAngle +(i*mSpeed),mDiameter,mColour,pOrbitDistance,pOrbitAngle +(i*pOrbitSpeed));

    }

}

