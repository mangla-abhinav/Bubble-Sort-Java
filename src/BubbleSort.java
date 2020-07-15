public class BubbleSort {
    public int arr[];
    public void getData()
    {
        arr = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = i + 1;
        }
    }

    public void doSorting()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }

    public void displayArray()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        BubbleSort obj = new BubbleSort();
        obj.getData();
        obj.doSorting();
        obj.displayArray();
    }
}
