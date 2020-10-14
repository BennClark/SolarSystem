public class main {
    public static void main(String[] args) {
        int angle = 0;
        
        SolarSystem s = new SolarSystem(900,900);
        
        planet sun = new planet(0,0,100,"#FFCC33",0);
        planet mercury = new planet(75,0,5.744,"#B1ADAD",1.59); //VALUES BASED ON ACTUAL SCALED VALUES
        planet venus = new planet(90,0,14.24,"#98FB98",1.17);
        planet earth = new planet(110,0,15,"#00688B",1);
        planet mars = new planet(135,0,9.32,"#C1440E",0.81);

        planet jupiter = new planet(230,0,50,"#D39C7E",0.439);
        planet saturn = new planet(300,0,40,"#E3E0C0",0.326);
        planet uranus = new planet(360,0,32,"#D9DDF4",0.228);
        planet neptune = new planet(420,0,25,"#274687",0.181);

        moon earthMoon = new moon(14,0,4.088,"WHITE",-1.6,earth);

        moon phobos = new moon(9,0,2,"WHITE",-1.11,mars);
        moon deimos = new moon(13,0,2,"WHITE",-0.8,mars);

        moon ganymede = new moon(35,0,5,"WHITE",-1.6,jupiter);
        moon callisto = new moon(39,0,3,"WHITE",-1.4,jupiter);
        moon io = new moon(41,0,2,"WHITE",-1.11,jupiter);
        moon europa = new moon(43,0,2,"WHITE",-0.98,jupiter);

        moon titan = new moon(30,0,4,"WHITE",2,saturn);
        moon rhea = new moon(35,0,2,"WHITE",1.7,saturn);
        moon iapetus = new moon(37,0,2,"WHITE",1.44,saturn);
        moon dione = new moon(39,0,1,"WHITE",1,saturn);

        moon titania = new moon(25,0,3,"WHITE",1.5,uranus);
        moon oberon = new moon(30,0,2,"WHITE",1,uranus);

        moon triton = new moon(25,0,7,"WHITE",1.2,neptune);
        
        asteroid[] asteroid = new asteroid[100];
        
        for (int i=0;i<100;i++) {
            asteroid[i] = new asteroid();     
        }

        while(true) {

            sun.draw(s,angle);
            mercury.draw(s,angle);
            venus.draw(s,angle);
            earth.draw(s,angle);
            mars.draw(s,angle);
            jupiter.draw(s,angle);
            saturn.draw(s,angle);
            uranus.draw(s,angle);
            neptune.draw(s,angle);
            
            earthMoon.draw(s,angle);

            phobos.draw(s,angle);
            deimos.draw(s,angle);

            ganymede.draw(s,angle);
            callisto.draw(s,angle);
            io.draw(s,angle);
            europa.draw(s,angle);

            titan.draw(s,angle);
            rhea.draw(s,angle);
            iapetus.draw(s,angle);
            dione.draw(s,angle);

            titania.draw(s,angle);
            oberon.draw(s,angle);

            triton.draw(s,angle);

            for (int i=0;i<100;i++) {
                asteroid[i].draw(s,angle);     
            }
           
            s.finishedDrawing();
            angle++;
        }

    }
    
}

