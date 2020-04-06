package vectors4d;

/**
 *
 * @author mshir
 */
public class Vector4D {
    public static void main(String[] args) {
        Vector4D nya = new Vector4D(1,2,3,4);
        Vector4D meow = new Vector4D(5,6,7,8);
        add2Vectors(nya,meow);
        subtract2Vectors(meow,nya);
        System.out.println(dotProd(nya,meow));
    }
    float a;
    float b;
    float c;
    float d;
    Vector4D(float a,float b,float c,float d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println("(" + this.a + ", " + this.b + 
                ", " + this.c + ", " + this.d + ")");
    }
    public static Vector4D add2Vectors(Vector4D p, Vector4D q){
        float a = p.a + q.a;
        float b = p.b + q.b;
        float c = p.c + q.c;
        float d = p.d + q.d;
        Vector4D e = new Vector4D(a,b,c,d);
        return e;
    }
    public static Vector4D subtract2Vectors(Vector4D p, Vector4D q){
        float a = p.a - q.a;
        float b = p.b - q.b;
        float c = p.c - q.c;
        float d = p.d - q.d;
        Vector4D e = new Vector4D(a,b,c,d);
        return e;
    }
    public static float dotProd(Vector4D p, Vector4D q){
        float a = p.a * q.a;
        float b = p.b * q.b;
        float c = p.c * q.c;
        float d = p.d * q.d;
        float e = a + b + c + d;
        return e;
    }
    
}
