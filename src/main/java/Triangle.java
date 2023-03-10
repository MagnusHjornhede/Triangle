public class Triangle {
    public Triangle() {
    }

    public String getType(int a, int b, int c) {

        if(a<=0 ||b<=0  ||c<=0)
            return "Invalid";
        if (a == b && b == c && b == c)
            return "Equilateral";
        else if (a == b || a == c || b == c)
            return "Isosceles";
        else
            return "Scalene";

    }
}
