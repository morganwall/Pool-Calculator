package net.mlwall.pool;
import static net.mlwall.pool.Main.input;

public class Math {
    public static final double PI = 3.14159265358979323846; // I could've used this from the java math class, though I thought it'd make sence to redefine it due to this being my math class.
    
    public static int average(int x, int y) // This and the float one aren't use.
    {
        int average = (x + y) / 2;
        return average;
    }
    
    public static float average(float x, float y)
    {
        float average = (x + y) / 2;
        return average;
    }
    
    public static double average(double x, double y)
    {
        double average = (x + y) / 2;
        return average;
    }

    public static void rect()
    {
        double area, bottom, averageDepth, deepDepth, shallowDepth, width, length, walls1, walls2, volume;
        
        System.out.println("Please enter the length: ");
        length = input.nextDouble();
        System.out.println("Please enter the width: ");
        width = input.nextDouble();
        System.out.println("Please enter the depth of the deep end: ");
        deepDepth = input.nextDouble();
        System.out.println("Please enter the depth of the shallow end: ");
        shallowDepth = input.nextDouble();
        
        averageDepth = Math.average(deepDepth, shallowDepth);
        bottom = width * length;
        walls1 = (width * averageDepth) * 2;
        walls2 = (length * averageDepth) * 2;
        area = walls1 + walls2 + bottom;
        volume = length * width * averageDepth;
        
        Invoice.invoice(length, width, deepDepth, shallowDepth, averageDepth, walls1, walls2, area, volume, bottom);
    }
    
    public static void circular()
    {
        double area, volume, averageDepth, deepDepth, shallowDepth, radius, bottom, lateralSurfaceArea;
        
        System.out.println("Please enter the radius: ");
        radius = input.nextDouble();
        System.out.println("Please enter the depth of the deep end: ");
        deepDepth = input.nextDouble();
        System.out.println("Please enter the depth of the shallow end: ");
        shallowDepth = input.nextDouble();
        
        averageDepth = Math.average(deepDepth, shallowDepth);
        bottom = (radius * radius) * PI;
        lateralSurfaceArea = PI * 2 * radius * averageDepth;
        volume = bottom * averageDepth;
        area = bottom + lateralSurfaceArea;
        
        Invoice.invoice(radius, deepDepth, shallowDepth, averageDepth, area, volume, bottom, lateralSurfaceArea);
    }  
}
