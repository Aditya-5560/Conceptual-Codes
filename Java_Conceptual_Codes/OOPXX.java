class Arithematic
{
    public int no1;
    public int no2;
    Arithematic()
    {
        this.no1 = 0;
        this.no2 = 0;
    }
    Arithematic(int i,int j)
    {
        this.no1 = i;
        this.no2 = j;
    }
    public int addition()
    {
        int ans = 0;
        ans = this.no1+this.no2;
        return ans;
    }
    public int substraction()
    {
        int ans = 0;
        ans = this.no1-this.no2;
        return ans;
    }
}
class OOPXX {
    public static void main(String A[]) 
    {
        Arithematic aboj = new Arithematic(21,10);
        int result = 0;
        result = aboj.addition();
        System.out.println("Addition is :"+result);

        result = aboj.substraction();
        System.out.println("Substraction is :"+result);
    }
}
