package net.mlwall.pool;
import static net.mlwall.pool.Main.user;

public class Invoice {
    public static void invoice(double length, double width, double deepDepth, double shallowDepth, double averageDepth, double walls1,
    double walls2, double area, double volume, double bottom)
    {
        System.out.println("User:                  " + user);
        System.out.println("Length:                " + length + "m");
        System.out.println("Width:                 " + width + "m");
        System.out.println("Deep End Depth:        " + deepDepth + "m");
        System.out.println("Shallow End Depth:     " + shallowDepth + "m");
        System.out.println("Average Depth:         " + averageDepth + "m");
        System.out.println("1st & 3rd Walls Area:  " + walls1 + "m²");
        System.out.println("2nd & 4th Walls Area:  " + walls2 + "m²");
        System.out.println("Bottom Area:           " + bottom + "m²");
        System.out.println("Interior Surface Area: " + area + "m²");
        System.out.println("Volume:                " + volume + "m³");
    }
    
    public static void invoice(double radius, double deepDepth, double shallowDepth, double averageDepth, double area, double volume, double bottom, double lateralSurfaceArea)
    {
        System.out.println("User:                  " + user);
        System.out.println("Radius:                " + radius + "m²");
        System.out.println("Deep End Depth:        " + deepDepth + "m");
        System.out.println("Shallow End Depth:     " + shallowDepth + "m");
        System.out.println("Average Depth:         " + averageDepth + "m");
        System.out.println("Bottom Area:           " + bottom + "m²");
        System.out.println("Interior Surface Area: " + area + "m²");
        System.out.println("Lateral Surface Area:  " + lateralSurfaceArea + "m²");
        System.out.println("Volume:                " + volume + "m³");
    }
}
