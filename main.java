public class main {
    public static void main(String[] args) {
        int angle = 0;
        double speed = 0.7;
        
        SolarSystem s = new SolarSystem(500,500);

        while(true) {
            s.drawSolarObject(0,0,50,"YELLOW"); //SUN

            s.drawSolarObject(100,angle,20,"BLUE"); //EARTH
            s.drawSolarObject(200,(angle)*speed,10,"RED"); //MARS

            s.drawSolarObjectAbout(25, angle*(speed*3), 5, "WHITE", 100, angle);
            
            
            
            
            
            s.finishedDrawing();
            angle++;
        }
    }
    
}
