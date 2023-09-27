public class decimalToBinary {
    public static void main(String[] args) {
        int decimal=10;
        StringBuilder binary=new StringBuilder();

        // decimal to binary
        while(decimal>0)
        {
            binary.insert(0,decimal%2);
            decimal=decimal/2;
        }


        // toggle the bits
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0')
            {
                binary.setCharAt(i, '1');
            }
            else if(binary.charAt(i)=='1')
            {
                binary.setCharAt(i, '0');
            }
        }


        int ans=0;
        // binary to decimal
        for(int i=0;i<binary.length();i++)
        {
            ans=(ans<<1)+binary.charAt(i)-'0';
            
        }

        System.out.println("answer is: "+ans);

    }
}
