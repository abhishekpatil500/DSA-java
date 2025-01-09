 

public class majorityelement169 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2,2};
        majority(arr);
         
    }

    public static void majority(int arr[])
    {int max=0; 
        int num=0;
        int half=arr.length/2;
         
        for(int i=0;i<arr.length-1;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                
            }
            if(count>max)
            {
                max=count;
                num=arr[i];
            }
            if(max >= half)
            { 
            System.err.println(num);
            return;
            }
        }
        System.err.println("number is not found");

    }
    
    
}
